package haifeng.cong.practical;

import java.util.Arrays;

/**
 * Description: 833. 字符串中的查找与替换
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/2 20:12
 *
 * @author conghaifeng
 */
public class FindReplaceString833 {

    public static void main(String[] args){

        String abcd = findReplaceString2("vmokgggqzp", new int[]{3, 5, 1}, new String[]{"kg","ggq","mo"}, new String[]{"s","so","bfr"});
        System.out.println(abcd);

    }

    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        String anw = S;
        boolean[] matches = new boolean[indexes.length];
        for (int i = 0; i < indexes.length; i++) {
            if(compare(S, indexes[i], sources[i])) {

                matches[i] = true;
            }
        }
        for (int i = 0; i < indexes.length; i++) {
            if (matches[i]) {
                anw = swap(anw, indexes[i], targets[i], sources[i]);
                indexes = updateIndex(indexes, targets[i].length() - sources[i].length(), indexes[i]);
            }

        }

        return anw;
    }

    public int[] updateIndex(int[] indexes, int length, int index) {
        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i] > index) {
                indexes[i]+=length;
            }
        }
        return indexes;
    }

    public boolean compare(String s, int index, String source) {
        int length = source.length();
        String substring = s.substring(index, length + index);
        if (substring.equals(source)) {
            return true;
        }
        return false;
    }

    public String swap(String s, int index, String targets, String source) {
        StringBuilder stringBuilder = new StringBuilder();
        int sourceLength = source.length();
        stringBuilder.append(s.substring(0,index));
        stringBuilder.append(targets);
        stringBuilder.append(s.substring(index + sourceLength));
        return stringBuilder.toString();
    }


    public static String findReplaceString2(String S, int[] indexes, String[] sources, String[] targets) {

        //定义字符串每个字符是第几个匹配上的
        int[] match = new int[S.length()];
        Arrays.fill(match, -1);
        for (int i = 0; i < indexes.length; i++) {
            if (S.substring(indexes[i], indexes[i] + sources[i].length()).equals(sources[i])) {
                match[indexes[i]] = i;
            }
        }
        StringBuilder anw = new StringBuilder();
        //遍历字符串S的指针
        int flag = 0;
        while (flag < S.length()) {
            //注意match可能是第0个就匹配上，所以要>=0
            if (match[flag] >= 0) {
                anw.append(targets[match[flag]]);
                flag += sources[match[flag]].length();
            } else {
                anw.append(S.charAt(flag++));
            }
        }

        return anw.toString();

    }

}
