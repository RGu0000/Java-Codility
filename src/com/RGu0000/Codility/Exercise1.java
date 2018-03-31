package com.RGu0000.Codility;
//

public class Exercise1 {
	public int solution(int N){
		int result = 0;
		for(int L=0; L<=N; L++){
			if ( F(L) <= N ) result = L;
			else break;
		}
		return result;
	}

	private double F (int K){
		return (double) K*K/2;
	}
}
