package haifeng.cong.leetcode;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/12 16:26
 *
 * @author conghaifeng
 */
public class ValidIPAddress468验证IP {

    public static void main(String[] args){
        System.out.println(validIPAddress("1.4.5.6."));
    }

    String chunkIPv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    Pattern pattenIPv4 = Pattern.compile("^(" + chunkIPv4 + "\\.){3}" + chunkIPv4 + "$");

    String chunkIPv6 = "([0-9a-fA-F]{1,4})";
    Pattern pattenIPv6 = Pattern.compile("^(" + chunkIPv6 + "\\:){7}" + chunkIPv6 + "$");

    public String validIPAddress2(String IP) {
        if (IP.contains(".")) {
            return (pattenIPv4.matcher(IP).matches()) ? "IPv4" : "Neither";
        }
        else if (IP.contains(":")) {
            return (pattenIPv6.matcher(IP).matches()) ? "IPv6" : "Neither";
        }
        return "Neither";
    }


    public static String validIPAddress(String IP) {
        if (IP.contains(".")) {
            if (isIPV4(IP)) {
                return "IPv4";
            } else {
                return "Neither";
            }
        } else if (IP.contains(":")) {
            if (isIPV6(IP)) {
                return "IPv6";
            } else {
                return "Neither";
            }
        }
        return "Neither";
    }

    public static boolean isIPV4(String IP) {
        if (IP.charAt(0) == '.' || IP.charAt(IP.length() -1) == '.') {
            return false;
        }
        String[] split = IP.split("\\.");
        Pattern pattern = Pattern.compile("[^0-9]");

        for (String string : split) {
            if (string.length() == 0) {
                return false;
            }
            if (string.charAt(0) == '0') {
                return false;
            }
            if (pattern.matcher(string).find()) {
                return false;
            }
        }
        int[] numArray = Arrays.stream(split).mapToInt(Integer::valueOf).toArray();
        for (Integer num : numArray) {
            if (num < 0 || num > 255) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIPV6(String IP) {
        if (IP.charAt(IP.length() -1) == ':') {
            return false;
        }
        String[] split = IP.split(":");
        for (String string : split) {
            if (string.length() == 0) {
                return false;
            }
            if (string.charAt(0) == '0' && string.length() > 4) {
                return false;
            }
        }
        return true;
    }
}
