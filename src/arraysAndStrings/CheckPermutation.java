package arraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CheckPermutation {
    public static void main(String[] args){
        String sOne = "abczbca";
        String sTwo = "cbazabc";
        System.out.println(isPermutationOfOther_converToArray(sOne, sTwo));
        System.out.println(isPermutationOfOther_hashMap(sOne, sTwo));
        System.out.println(isPermutationOfOther_basicArray(sOne, sTwo));
    }

    private static boolean isPermutationOfOther_basicArray(String sOne, String sTwo){
        int[] intArray = new int[26];
        for(char c : sOne.toCharArray()){
            ++intArray[c - 'a'];
        }
        for(char c : sTwo.toCharArray()){
            --intArray[c - 'a'];
        }
        for(int a : intArray){
            if(a != 0)
                return false;
        }
        return true;
    }

    private static boolean isPermutationOfOther_hashMap(String sOne, String sTwo){
        Map<Character, Integer> mapOne = new HashMap<>();
        Map<Character, Integer> mapTwo = new HashMap<>();
        for(char c : sOne.toCharArray()){
            if(mapOne.containsKey(c)){
                mapOne.put(c, mapOne.get(c) + 1);
            }
            else {
                mapOne.put(c, 1);
            }
        }
        for(char c : sTwo.toCharArray()){
            if(mapTwo.containsKey(c)){
                mapTwo.put(c, mapTwo.get(c) + 1);
            }
            else {
                mapTwo.put(c, 1);
            }
        }
        for(Entry<Character, Integer> entry : mapOne.entrySet()){
            if(!mapTwo.containsKey(entry.getKey()) || !mapTwo.get(entry.getKey()).equals(entry.getValue())){
                return false;
            }
        }
        return true;
    }

    private static boolean isPermutationOfOther_converToArray(String sOne, String sTwo){
        char[] cArrayOne = sOne.toCharArray();
        char[] cArrayTwo = sTwo.toCharArray();
        Arrays.sort(cArrayOne);
        Arrays.sort(cArrayTwo);
        
        return new String(cArrayOne).equals(new String(cArrayTwo));
    }
}
