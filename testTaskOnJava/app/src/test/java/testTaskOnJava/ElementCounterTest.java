package testTaskOnJava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class ElementCounterTest {

    @Test
    void testCountElements() {
        List<Integer> inputList = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> elementCountMap = ElementCounter.countElements(inputList);

        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(1, 2);
        expectedMap.put(3, 1);
        expectedMap.put(4, 2);
        expectedMap.put(5, 2);

        assertEquals(expectedMap, elementCountMap);
    }

    @Test
    void testCountElementsWithEmptyList() {
        List<Integer> inputList = Collections.emptyList();
        Map<Integer, Integer> elementCountMap = ElementCounter.countElements(inputList);

        Map<Integer, Integer> expectedMap = new HashMap<>();

        assertEquals(expectedMap, elementCountMap);
    }

    @Test
    void testCountElementsWithNullList() {
        Map<Integer, Integer> elementCountMap = ElementCounter.countElements(null);
        Map<Integer, Integer> expectedMap = new HashMap<>();

        assertEquals(expectedMap, elementCountMap);
    }

    @Test
    void testCountElementsWithSomeNullsInList(){
        List<Integer> inputList = Arrays.asList(1, 3, 4, 5, null, 5, 4, null, 8, 3);
        Map<Integer, Integer> elementCountMap = ElementCounter.countElements(inputList);

        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(1, 1);
        expectedMap.put(3, 2);
        expectedMap.put(4, 2);
        expectedMap.put(5, 2);
        expectedMap.put(null, 2);
        expectedMap.put(8, 1);

        assertEquals(expectedMap, elementCountMap);

    }
}
