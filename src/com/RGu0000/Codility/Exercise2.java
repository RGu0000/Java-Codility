// Write a method, that will return the number of lattice points (points with integer coordinates X and Y) for a disc centered at (0,0)
// and with radius N. If number of points exceeds 10^9, return -1 instead.

package com.RGu0000.Codility;


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
