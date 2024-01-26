package arraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IsUnique {

	public static void main(String[] args) {
		String input = "abcdeafgh";
        boolean isUnique = true;
        Set<Character> set = new HashSet<Character>();
        for(char c : input.toCharArray()){
            if(set.contains(c)){
                isUnique = false;
                break;
            }
            else{
                set.add(c);
            }
        }
        System.out.println(isUnique);
        isUniqueWithoutDataStructure(input);
	}
	
	private static void isUniqueWithoutDataStructure(String input) {
		char[] cArray = input.toCharArray();
		Arrays.sort(cArray);
		boolean isUnique = true;
		for(int i=0; i < cArray.length-1; i++) {
			if(cArray[i] == cArray[i+1]) {
				isUnique = false;
				break;
			}
		}
		System.out.println(isUnique);
	}

}
