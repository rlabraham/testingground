package org.example.arrays;

import java.util.Set;

public class FromSet {
    private static Object[] setToArray(Set<Object> set) {
        final Object[] arr = new Object[set.size()];
        int i = 0;
        for (Object o : set) {
            arr[i++] = o;
        }
        return arr;
    }
}
