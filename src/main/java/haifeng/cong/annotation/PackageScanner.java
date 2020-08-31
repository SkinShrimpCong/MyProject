package haifeng.cong.annotation;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/7 9:34
 *
 * @author conghaifeng
 */
public abstract class PackageScanner {

    public static void main(String[] args){

        new PackageScanner() {

            @Override
            public void dealClass(Class<?> Klass) {
                System.out.println(Klass);
            }
        }.scanPackage("haifeng");

    }

    public PackageScanner() {

    }

    public void scanPackage(Class<?> klass) {
        scanPackage(klass.getPackage().getName());
    }

    public void scanPackage(String packageName) {
        //将包名转化为路径名称的形式
        String packagePath = packageName.replace(".", "/");
        try {
            // 由类加载器得到URL的枚举
            Enumeration<URL> resource = Thread.currentThread().getContextClassLoader().getResources(packagePath);

            while (resource.hasMoreElements()) {
                URL url = resource.nextElement();

                // 处理jar包
                if (url.getProtocol().equals("jar")) {
                    parse(url);
                } else {
                    File file = new File(url.toURI());

                    if (file.exists()) {
                        //处理普通包
                        parse(file, packageName);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    // 抽象方法，由用户自行处理扫描到的类
    abstract void dealClass(Class<?> klass);

    // jar包的扫描
    private void parse(URL url) throws IOException {
        Enumeration<JarEntry> jarEntries = ((JarURLConnection) url.openConnection()).getJarFile().entries();

        while (jarEntries.hasMoreElements()) {
            JarEntry jarEntry = jarEntries.nextElement();
            String jarName = jarEntry.getName();

            if (!jarEntry.isDirectory() && jarName.endsWith(".class")) {
                // 将文件路径名转换为包名称的形式
                dealClassName(jarName);
            }
        }
    }

    // 普通包的扫描
    private void parse(File curFile, String packageName) {
        File[] fileList = curFile.listFiles(new FileFilter() {
            // 筛选文件夹和class文件，其余文件不处理
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().endsWith(".class");
            }
        });

        // 目录就是一颗树，对树进行递归，找到class文件
        for (File file : fileList) {
            String fileName = file.getName();
            if (file.isDirectory()) {
                parse(file, packageName + "." + fileName);
            } else {
                String className = packageName + "." + fileName.replace(".class", "");
                dealClassName(className);
            }
        }
    }

    // 将找到的class文件生成类对象
    private void dealClassName(String className) {
        try {
            Class<?> klass = Class.forName(className);

            // 注解、接口、枚举、原始类型不做处理
            if (!klass.isAnnotation() && !klass.isInterface() && !klass.isEnum() && !klass.isPrimitive()) {
                dealClass(klass);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
