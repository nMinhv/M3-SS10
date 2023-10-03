package ra.bt.bt4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "Rekkei Academy để nông dân biết code";
        List<String> list = new ArrayList<>();
        String[] strings = str.split(" ");
        Collections.addAll(list, strings);
        for (String s : list) {
            if (s.length()>=3){
                System.out.println(s);
            };
        }
    }
}
