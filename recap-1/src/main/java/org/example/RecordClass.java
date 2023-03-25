package org.example;

import java.util.List;

public record RecordClass(
        Integer field1,
        Integer field2,
        List<Integer> integerList
) {

    public RecordClass {
        if (integerList.contains(1)) {
            integerList.remove((Integer) 1);
        }
    }
}
