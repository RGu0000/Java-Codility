package com.RGu0000.Codility;

class Lesson1 {
	public int solution(int N){
		int result = 0;
		while( N>0 && N%2==0 ){
 			N = N/2;
		}

		for(int i=0; N>0; N /= 2){
			if( N%2 ==0 ){
				i++;
			} else{
				result = Math.max(result,i);
				i=0;
			}
		}
		return result;
	}
}
