package com.develogical;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class NumberComparer {

    public Integer getMax(String input){
        String[] results = input.split(",");
        Stream<String> stream = Arrays.stream(results);
        Optional<Integer> maxNumber = Arrays.stream(results).map(s -> Integer.parseInt(s)).
                max((i,j) -> i.compareTo(j));
        return maxNumber.get();
    }
}
