package Algorithms.Implementation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ACMICPCTeam {
    static List<Integer> acmTeam(List<String> topics) {
        List<BigInteger> bigIntList = new ArrayList<>();
        for (String topic : topics) bigIntList.add(new BigInteger(topic, 2));
        int maxTopicCount = 0;
        int teamCount = 0;
        for (int i = 0; i < topics.size() - 1; i++) {
            for (int j = i + 1; j < topics.size(); j++) {
                int topicCount = bigIntList.get(i).or(bigIntList.get(j)).bitCount();
                if (maxTopicCount < topicCount) {
                    maxTopicCount = topicCount;
                    teamCount = 1;
                } else if (maxTopicCount == topicCount) teamCount++;
            }
        }
        return List.of(maxTopicCount, teamCount);
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            List<String> topics = IntStream.range(0, n)
                    .mapToObj(i -> scan.next())
                    .filter(i -> i.length() == m)
                    .collect(toList());
            List<Integer> result = acmTeam(topics);
            for (Integer element : result) System.out.println(element);
        }
    }
}