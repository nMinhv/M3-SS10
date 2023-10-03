package ra.bt.bt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int addNum = (int) (Math.random() * 10);
            listInt.add(addNum);
        }
        Collections.sort(listInt,Collections.reverseOrder());
        listInt.sort(Collections.reverseOrder());
        System.out.println(listInt);
    }
}
