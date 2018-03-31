package com.RGu0000.Codility;
//


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
