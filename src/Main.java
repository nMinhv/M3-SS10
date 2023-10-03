import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<String> strings = new ArrayList<>();
//        strings.add("hanoi");
//        strings.add("danang");
//        strings.add("hue");
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        Set<String> stringSet = new HashSet<>();
        stringSet.add("1");
        stringSet.add("2");
        Set<String> stringSet1 = new HashSet<>();
        stringSet1.add("1");
        stringSet1.add("2");
        System.out.println(stringSet.equals(stringSet1));
        Eagle<String> eagle = new Eagle<String>();
        eagle.display("Eagle");
        LinkedList<Integer> listInt = new LinkedList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        System.out.println(listInt);
    }
}