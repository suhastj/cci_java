package arraysAndStrings;

public class URLify {
    public static void main(String[] args){
        char[] input = new String("Mr John Smith    ").toCharArray();
        int i = input.length - 1;
        int j = input.length - 1;
        while(input[j] == ' '){
            j--;
        }
        System.out.println(input[j]);
        while(j >= 0){
            if(input[j] == ' '){
                input[i--] = '0';
                input[i--] = '2';
                input[i--] = '%';
            }
            else {
                input[i--] = input[j];
            }
            j--;
        }
        System.out.println(input);
    }
}
