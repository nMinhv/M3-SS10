package ra.bt.bt2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int addNum = (int) (Math.random() * 10);
            listInt.add(addNum);
        }
        List<Integer> reversedList = new ArrayList<>();
        System.out.println(listInt);
        for (int i = listInt.size(); i > 0; i--) {
            reversedList.add(listInt.get(i-1));
        }
        System.out.println(reversedList);
    }
}
