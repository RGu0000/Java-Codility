package com.RGu0000.Codility;
//

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Exercise2 {
	int solution(int R){
		int sum = 0;
		for(int i=1; i<=R; i++){
			sum += sqrt( pow(R, 2) - pow(i,2) );
		}
		if( 1 + 4*R + 4*sum > 1000000000 ) return -1;
		return 1 + 4*R + 4*sum;
	}

	private double F (int K){
		return (double) K*K/2;
	}
}
