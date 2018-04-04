// Write a method that will implement a stack, which after inputing a string combined of:
// digits (0-9), '+' and '*' will perform operations:
// - if the char is a digit- it will add the digit to stack
// - if the char is '+' - it will add last two last numbers on the stack and put the result back on stack
// - if the char is '*' - it will multiply two last numbers on the stack and put the result back on stack
// - if an error occurs (no sufficient number of numbers on the stack) - method returns -1
// If the whole input String has been processed - method returns last object of the stack.

package com.RGu0000.Codility;


import java.util.Stack;

class Exercise3 {
	int solution(String S) {
		char[] input = S.toCharArray();
		Stack<Integer> stack = new Stack<>();
		int temp = 0;

		for(char ch : input) {
			temp = 0;
			if(ch == '*') {
				if(stack.size() >= 2) {
					temp = stack.pop() * stack.pop();
					stack.push(temp);
				} else {
					return -1;
				}
			} else if(ch == '+') {
				if(stack.size() >= 2) {
					temp = stack.pop() + stack.pop();
					stack.push(temp);
				} else {
					return -1;
				}
			} else {
				stack.push(ch - '0');
			}
		}
		return stack.pop();
	}
}
