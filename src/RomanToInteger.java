/*
 * Roman to Integer
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M. 
For example, 2 is written as II in Roman numerals, just two one's added together. 
12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. 
However, the numeral for four is not IIII. 
Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
The same principle applies to the number nine, which is written as IX. 
There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Example
INPUT
III
OUTPUT
3
 */

import java.util.Scanner;

public class RomanToInteger {
	public static int values(char c) {
		if(c == 'I') return 1;
		if(c == 'V') return 5;
		if(c == 'X') return 10;
		if(c == 'L') return 50;
		if(c == 'C') return 100;
		if(c == 'D') return 500;
		if(c == 'M') return 1000;
		return 0;
	}
	
	public static int romanToInteger(String s) {
		int total = 0;
		
		for(int i=0;i < s.length();i++ ) {
			int current = values(s.charAt(i));
			
			if(i+1 < s.length()) {
				int next = values(s.charAt(i+1));
				
				if(current < next) {
					total -= current;
				}
				else {
					total += current;
				}
			}
			else {
				total += current;
			}
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String roman = sc.next();
		System.out.println(romanToInteger(roman));
	}

}
