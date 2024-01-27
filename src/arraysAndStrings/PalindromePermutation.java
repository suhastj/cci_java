package arraysAndStrings;

public class PalindromePermutation {
    public static void main(String[] args){
        String input = "Tact CoaAa";
        System.out.println(isPalindromePermutable(input));
    }

    private static boolean isPalindromePermutable(String input){
        input = input.toLowerCase();
        input = input.replaceAll(" ", "");

        int[] array = new int[26];
        for(char c : input.toCharArray()){
            array[c - 'a']++;
        }

        int oddCount = 0;
        for(int i : array){
            if(i % 2 == 1)
                oddCount++;

            if(oddCount > 1)
                return false;
        }
        return true;
    }
}
