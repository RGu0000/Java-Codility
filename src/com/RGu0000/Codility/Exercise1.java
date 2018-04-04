// There is a function F(K), such that:
// F(K) = 0 for K=0
// F(K) = F(K-1) + K for K>0
// Given integer N return maximum integer L, such that F(L) <= N

package com.RGu0000.Codility;


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
