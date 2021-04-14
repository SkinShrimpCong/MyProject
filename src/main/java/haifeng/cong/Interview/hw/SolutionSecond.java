package haifeng.cong.Interview.hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company:
 * Create Time: 2021/3/23 19:49
 *
 * @author conghaifeng
 */
public class SolutionSecond {

    public void solve(String input) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
        //处理
        String line;
        HashMap<String, Integer> map = new HashMap<>();

        
        while ((line =bufferedReader.readLine()) != null) {
            String[] split = line.split(";");
            for (String string : split) {
                map.put(string, map.getOrDefault(string, 0) + 1);
            }
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        //排序
        LinkedList<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        //list.sort(Comparator.comparing(Map.Entry::getValue));
        quickSort2(list);

        //输出
        for (Map.Entry ans : list) {
            System.out.println(ans.getKey() + " " + ans.getValue());
        }
    }

    private void quickSort2(LinkedList<Map.Entry<String, Integer>> list) {
        sort2(list, 0, list.size() -1);
    }

    private void sort2(LinkedList<Map.Entry<String, Integer>> list, int left, int right) {
        int partition = partition2(list, left, right);
        sort2(list, left, partition -1);
        sort2(list, partition + 1, right);
    }

    private int partition2(LinkedList<Map.Entry<String, Integer>> list, int left, int right) {
        int pivot = list.get(left).getValue();
        int mark = left + 1;
        for (int i = left + 1; i < right; i++) {
            if (list.get(i).getValue() > pivot) {
                swap2(list, mark, i);
                mark++;
            }
        }
        swap2(list, left, mark - 1);
        return mark - 1;
    }

    private void swap2(LinkedList<Map.Entry<String, Integer>> list, int first, int second) {
        Map.Entry temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }



















    private void quickSort(int[] array) {
        sort(array, 0, array.length -1);
    }
    
    private void sort(int[] array, int left, int right) {
        int partition = partition(array, left, right);
        sort(array, left, partition -1);
        sort(array, partition + 1, right);
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[left];
        int mark = left + 1;
        for (int i = left + 1; i < right; i++) {
            if (array[i] > pivot) {
                swap(array, mark, i);
                mark++;
            }
        }
        swap(array, left, mark - 1);
        return mark - 1;
    }

    private void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
