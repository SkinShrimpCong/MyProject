package haifeng.cong.Interview.hw;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/14 14:20
 *
 * @author conghaifeng
 */
public class Solve2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String workerNum = scanner.next();
        ArrayList<Inner> input = new ArrayList<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        while (scanner.hasNext()) {
            Inner inner = new Inner();
            String fruit = scanner.next();
            set.add(fruit);
            inner.setFruit(fruit);
            inner.setWorkerTag(scanner.nextInt());
            inner.setWeight(scanner.nextInt());
            input.add(inner);
        }
        solve(input, set);
    }

    private static void solve(ArrayList<Inner> input, LinkedHashSet<String> fruitInput) {
        Map<String, List<Inner>> map = input.stream().collect(Collectors.groupingBy(Inner::getFruit));
        for (String fruit : fruitInput) {
            List<Inner> fruitList = map.get(fruit);
            fruitList.sort(Comparator.comparing(Inner::getWorkerTag));
            fruitList.sort(Comparator.comparing(Inner::getWeight));
            for (Inner inner : fruitList) {
                System.out.println(fruit + " " + inner.getWorkerTag() + " " + inner.getWeight());
            }
        }
    }


}

class Inner {

    private String fruit;

    private int workerTag;

    private int weight;

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public int getWorkerTag() {
        return workerTag;
    }

    public void setWorkerTag(int workerTag) {
        this.workerTag = workerTag;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
