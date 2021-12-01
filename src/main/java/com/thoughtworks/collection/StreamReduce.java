package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream().reduce(0, (lastOdd, number) -> number % 2 > 0? number : lastOdd);
    }

    public String getLongest(List<String> words) {
        return words.stream().reduce("", (first, second) -> first.length() > second.length()? first : second);
    }

    public int getTotalLength(List<String> words) {
        return words.stream().reduce("", (total_word, word) -> total_word += word).length();
    }
}
