package haifeng.cong.practical;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/6 21:02
 *
 * @author conghaifeng
 */
public class TranslateToExcel {

    public static void main(String[] args){
        System.out.println(translate(704));
    }

    public static String translate(int num) {
        char[] asc = new char[26];
        for (char i = 'a'; i <= 'z'; i++) {
            asc[i - 'a'] = i;
        }
        int rest = num;
        StringBuilder stringBuilder = new StringBuilder();
        while (rest > 0) {
//            if (rest <= 26) {
//                stringBuilder.append(String.valueOf(asc[rest -1]));
//                break;
//            }
            if (rest % 26 == 0) {
                stringBuilder.append(asc[25]);
                rest = rest / 26 - 1;
            } else {
                stringBuilder.append(asc[(rest % 26) - 1]);
                rest = rest / 26;
            }

        }
        return stringBuilder.reverse().toString();
    }
}
