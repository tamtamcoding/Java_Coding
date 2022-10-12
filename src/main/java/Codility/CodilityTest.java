package Codility;

import java.util.*;

public class CodilityTest {
    public static void main(String[] args) {
        String input = "Hello, my name is Pedro. I want to go to Paris. I'm going to buy the ticket";

        // String[] sentences = input.split("\\.");
        String[] sentences = input.split("\\s*\\.\\s*");

        String longestSentence = null;
        int longestCount = -1;
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");
            if (longestSentence == null || words.length < longestCount) {
                longestSentence = sentence;

            }
        }

        if (longestSentence != null) {
            System.out.println("\"" + longestSentence + "\" is the longest sentence");
        }
    }
    }

//    public static int solution(String S){
//        String longestSentence;
//        int maxNumberOfWords = 0;
//        String[] sentences = S.split(".");
//        for(int i = 0; i <= sentences.length; i++){ //Might as well be .length(), I'm not sure
//            if(sentences[i].count(" ") + 1 > maxNumberOfWords){
//                maxNumberOfWords = sentences[i].equals(" ") + 1;
//                longestSentence = sentences[i];
//            }}
//
//
//    }


