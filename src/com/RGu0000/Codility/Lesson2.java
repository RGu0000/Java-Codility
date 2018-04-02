package com.RGu0000.Codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Lesson2 {
	public int[] arraySolution(int[] A, int K) {
		List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
		Collections.rotate(list, K);
		return list.stream().mapToInt(i -> i).toArray();
	}
}
