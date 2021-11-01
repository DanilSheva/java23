package lesson11;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> tournirTable = new HashMap<>();
        tournirTable.put("Динамо", 5);
        tournirTable.put("Шахтер", 4);
        tournirTable.put("Спартак", 2);
        tournirTable.put("Динамо", 7);

        System.out.println(tournirTable);

        for (Map.Entry<String,Integer> comanda:tournirTable.entrySet()) {
            System.out.println(comanda.getKey());
            System.out.println(comanda.getValue());

        }
        for (String key:tournirTable.keySet()) {
            System.out.println(key);
            System.out.println(tournirTable.get(key));

        }


    }
}
