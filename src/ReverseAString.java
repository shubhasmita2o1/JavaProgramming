/*
 * 
 * Reverse a string
Imagine you are a software engineer working on a text processing application. Your task is to develop a function that reverses a given string while preserving the position of punctuation marks, spaces, and the case of the letters. This function will be used to process input from users and provide them with the reversed string as an output.

Example :
Input: "No lemon, no melon"
Output: "no lemon, no meloN"

Input: "Race car"
Output: "race caR"

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input:
Litcoder is best

Output:
tsebsire do ctiL

Exercise-2

Input:
i like Litcoder

Output:
r edoc tiLekili
 */


public class ReverseAString {
	public static String reverseOnlyString(String s){
        if(s == null || s.isEmpty()){
            return s;
        }
        
        char[] result = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        
        while(left < right){
            while( left < right && !Character.isLetterOrDigit(result[left])){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(result[right])){
                right--;
            }
            
            if(left < right){
                char charLeft = result[left];
                char charRight = result[right];
                
                result[left] = charRight;
                result[right] = charLeft;
                
                left++;
                right--;
            }
        }
        return new String(result);
    }
    public static void main(String[] args){
        
        String input1 = "hai,hello welcome - to programming.";
        String output1 = reverseOnlyString(input1);
        System.out.println(input1);
        System.out.println(output1);
        
        
    }


}
