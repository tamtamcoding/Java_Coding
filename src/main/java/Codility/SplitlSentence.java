package Codility;

public class SplitlSentence {
    public static void main(String[] args) {
        System.out.println(solution("Hello, my name is Pedro. I want to go to Paris. I'm going to buy the ticket"));
    }
    public static int solution(String S) {
        int wordCounts = -1;
        String[] splitSentences = S.split("\\s*\\.\\s*");
        String longestSentence = null;
        for (String splitSentence : splitSentences) {
            String[] words = splitSentence.split("\\s+");
            if (longestSentence == null || words.length < wordCounts) {
                longestSentence = splitSentence;
                wordCounts = words.length + 1;
            }
        }

        if (longestSentence != null) {
        }
        return wordCounts;

    }

}
