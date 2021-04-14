package haifeng.cong.leetcode;

import java.util.HashMap;

/**
 * Description: 781. 森林中的兔子
 *
 * 森林中，每个兔子都有颜色。其中一些兔子（可能是全部）告诉你还有多少其他的兔子和自己有相同的颜色。我们将这些回答放在 answers 数组里。
 *
 * 返回森林中兔子的最少数量。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rabbits-in-forest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/4/4 10:56
 *
 * @author conghaifeng
 */
public class LQ781 {

    public static void main(String[] args) {
        System.out.println(numRabbits(new int[]{10,10,10}));
    }

    public static int numRabbits(int[] answers) {
        if (answers == null || answers.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < answers.length; i++) {
            map.put(answers[i], map.getOrDefault(answers[i], 0) + 1);
        }
        int ans = 0;
        for (Integer key : map.keySet()) {
            Integer time = map.get(key);
            ans += (key + 1) * Math.ceil(time / (key + 1.0));
        }
        return ans;
    }
}
