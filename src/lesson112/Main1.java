package lesson112;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();


        long startTimeArrAdd = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i,"ksds" + i);

        }
        long endTimeArrAdd = System.currentTimeMillis();
        System.out.println("ArrayList add "+(endTimeArrAdd-startTimeArrAdd));

        long startTimeLinkAdd = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i,"ksds" + i);

        }
        long endTimeLinkAdd = System.currentTimeMillis();
        System.out.println("LindkedList add "+(endTimeLinkAdd-startTimeLinkAdd));









        long startTimeArrGet = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.get(i);

        }
        long endTimeArrGet = System.currentTimeMillis();
        System.out.println("ArrayList Get "+(endTimeArrGet-startTimeArrGet));

        long startTimeLinkGet = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.get(i);

        }
        long endTimeLinkGet = System.currentTimeMillis();
        System.out.println("LindkedList Get "+(endTimeLinkGet-startTimeLinkGet));



    }
}
