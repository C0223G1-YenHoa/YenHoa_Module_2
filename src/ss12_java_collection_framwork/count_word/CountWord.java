package ss12_java_collection_framwork.count_word;

import java.util.Map;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        String str = "Lê thị yến hoa lê thị yến hoa lê thị yến hoa";
        Map<String, Integer> map = new TreeMap<>();
        String[] array = str.split(" ");
        for (String s : array) {
            if (map.containsKey(s.toUpperCase())) {
                map.put(s.toUpperCase(),map.get(s.toUpperCase())+1);
            } else {
                map.put(s.toUpperCase(), 1);
            }
        }
        System.out.println(map);
    }
}
