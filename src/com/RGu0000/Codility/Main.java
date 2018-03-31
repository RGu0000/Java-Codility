package com.RGu0000.Codility;

public class Main {
	public static void main(String[] args) {

		long startTime = System.nanoTime();
//		Exercise1 ex1 = new Exercise1();
//		System.out.println( ex1.solution(17) );

//		Exercise2 ex2 = new Exercise2();
//		System.out.println( ex2.solution(0) == 1 );
//		System.out.println( ex2.solution(1) == 5 );
//		System.out.println( ex2.solution(2) == 13 );
//		System.out.println( ex2.solution(3) == 29 );
//		System.out.println( ex2.solution(4) == 49 );
//		System.out.println( ex2.solution(5) == 81 );
//		System.out.println( ex2.solution(6) == 113 );
//		System.out.println( ex2.solution(7) == 149 );
//		System.out.println( ex2.solution(2000));

		Exercise3 ex3 = new Exercise3();
		System.out.println( ex3.solution( "13+62*7+*") == 76 );
		System.out.println( ex3.solution( "11++") == -1 );

		System.out.println( ex3.solution( "133+62*7+0*") == 0 );

		long endTime = System.nanoTime();

		System.out.println( ( endTime - startTime)/Math.pow(10,9) );
	}
}
