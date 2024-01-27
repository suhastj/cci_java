package arraysAndStrings;

public class OneAway {
    public static void main(String[] args){
        String input1 = "pale";
        String input2 = "palf";

        if(Math.abs(input1.length() - input2.length()) > 1)
            System.out.println(false);

        if(input1.equals(input2))
            System.out.println(true);

        System.out.println(isOneAway(input1, input2));
    }

    public static boolean isOneAway(String input1, String input2){
        // int i1 = 0;
        // int i2 = 0;
        // int j1 = input1.length() - 1;
        // int j2 = input2.length() - 1;
        // while(input1.charAt(i1) == input2.charAt(i2)){
        //     i1++;
        //     i2++;
        // }
        // while(i1 <= j1 && i2 <= j2 && input1.charAt(j1) == input2.charAt(j2)){
        //     j1--;
        //     j2--;
        // }
        // if(input1.charAt(i1) != input2.charAt(i2) && input1.charAt(j1) != input2.charAt(j2))
        //     return false;
        
        int i1 = 0;
        int i2 = 0;
        int diff = 0;

        while (i1 < input1.length() && i2 < input2.length() && diff < 2) {
            if(input1.charAt(i1) == input2.charAt(i2)){
                i1++;
                i2++;
            }
            else {
                if(i1+1 < input1.length() && input1.charAt(i1+1) == input2.charAt(i2)){
                    i1 += 2;
                    i2++;
                }
                else if(i2+1 < input2.length() && input1.charAt(i1) == input2.charAt(i2+1)){
                    i1++;
                    i2 += 2;
                }
                else if(i1+1 < input1.length() && i2+1 < input2.length() && 
                        input1.charAt(i1+1) == input2.charAt(i2+1)){
                    i1 += 2;
                    i2 += 2;
                }
                else {
                    i1++;
                    i2++;
                }
                diff++;
                System.out.println(i1 + " " + i2);
            }
        }
        System.out.println(diff);
        return diff < 2 ? true : false;
    }
}
