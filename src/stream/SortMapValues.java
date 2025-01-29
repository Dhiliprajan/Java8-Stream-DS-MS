package stream;

import java.awt.image.Kernel;
import java.util.*;

public class SortMapValues {
    public static void main(String[] args) {
        // Example input map with String keys and List<Object> values
        Map<String, List<Object>> map = new HashMap<>();
        map.put("Apple", Arrays.asList(6,4,9));
        map.put("Banana", Arrays.asList(5,3,7));
        map.put("Carrot", Arrays.asList(2,1,8));

        // Sort each list in natural order
        map.forEach((key, value) -> {
            value.sort((o1, o2) -> {
                if (o1 instanceof Comparable && o2 instanceof Comparable) {
                    return ((Comparable) o1).compareTo(o2);
                }
                return 0; // If elements are not comparable, don't change their order
            });
        });

        // Print the sorted map
        map.forEach((key, value) -> System.out.println(key + " : " +value));

    }
}
