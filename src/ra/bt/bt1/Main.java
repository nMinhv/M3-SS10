package ra.bt.bt1;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        int maxIndex = (int) (Math.random()*10) +1;
        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i <maxIndex ; i++) {
            int addNum = (int) (Math.random()*10);
            listInt.add(addNum);
        }
        System.out.println(listInt);
        System.out.println(listInt);
        int max = Collections.max(listInt);
        System.out.println(max);
    }
}
