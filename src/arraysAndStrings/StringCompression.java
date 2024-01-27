package arraysAndStrings;

public class StringCompression {
    public static void main(String[] args){
        String input = "aabcccccaaa";
        System.out.println(compress1(input));
    }

    private static String compress1(String input){
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        char c = input.charAt(0);
        for(int i=1; i < input.length(); i++){
            if(input.charAt(i) == c){
                counter++;
            }
            else {
                sb.append(c + "" + counter);
                c = input.charAt(i);
                counter = 1;
            }
        }
        sb.append(c + "" + counter);
        String result = sb.toString();
        return result.length() > input.length() ? input : result;
    }
}
