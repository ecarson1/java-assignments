package com.ss.week.one;

public class Evaluator {

	PerformOperation isOdd() {
		PerformOperation op = (int i) -> i % 2 == 0? false: true;
		return op;
	}
	
	PerformOperation isPrime() {
		PerformOperation op = (int i) -> {
			int sqrt = (int) Math.sqrt(i); // cut-off when searching for factors
			for(int idx = 2; idx <= sqrt; idx++) {
				if(i % idx == 0) {
					return false;
				}
			}
			return true;
		};
		return op;
	}
	
	PerformOperation isPalindrome() {
		PerformOperation op = (int i) -> {
			String str = String.valueOf(i);
			int start = 0;
			int end = str.length() - 1;
			while(start <= end) {
				if(str.charAt(start) != str.charAt(end)) {
					return false;
				}
				start++;
				end--;
			}
			return true;
		};
		return op;
	}
}
