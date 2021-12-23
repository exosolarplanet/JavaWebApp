package com.develogical;

import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class NumberComparer {

    public Integer getMax(String input){
        String[] results = input.replace(" ","").split(",");
        Stream<String> stream = Arrays.stream(results);
        Optional<Integer> maxNumber = Arrays.stream(results).map(s -> Integer.parseInt(s)).
                max((i,j) -> i.compareTo(j));
        return maxNumber.get();

    }
    public Integer add(String input){
        Pattern pattern = Pattern.compile("is (\\d+) plus (\\d+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            String d1 = matcher.group(1);
            String d2 = matcher.group(2);
            System.out.println("d1= " + d1 + ", d2=" + d2);
            Integer i1 = Integer.parseInt(d1);
            Integer i2 = Integer.parseInt(d2);
            return i1 + i2;
        }
        return 0;
    }
}
