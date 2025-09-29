package org.example.arrays;

import java.util.List;
import java.util.Objects;

public class IsSubset {
    private static boolean isSubset(Integer[] mainArr, Integer[] subsetArray) {
        if (mainArr.length <= subsetArray.length) {
            return false;
        } else {
            for (int i = 0; i < mainArr.length; i++) {
                if (Objects.equals(subsetArray[0], mainArr[i])) {
                    for (int j = 0; j < subsetArray.length; j++) {
                        if (!mainArr[i + j].equals(subsetArray[j])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isSubset_listVariant(Integer[] mainArr, Integer[] subsetArray) {
        List<Integer> mainList = List.of(mainArr);
        List<Integer> subsetList = List.of(subsetArray);

        return mainList.containsAll(subsetList);
    }
}
