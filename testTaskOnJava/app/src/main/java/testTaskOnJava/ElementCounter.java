package testTaskOnJava;

import java.util.*;

public class ElementCounter {
    public static Map<Integer, Integer> countElements(List<Integer> list) {
        if (list == null) return new HashMap<>();
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (Integer element : list) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }

        return elementCountMap;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> elementCountMap = countElements(inputList);

        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
