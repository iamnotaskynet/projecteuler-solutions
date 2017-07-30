/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

class Task {
	public static void main(String[] args) {
		long maxPrime = 0;
		long halfNum = 13195/2;
		for (long i = 1; i <= halfNum; i++) {
			if(halfNum%i==0 &&
				isPrime(i) &&
				i>maxPrime) maxPrime = i;
		}
		System.out.println(maxPrime);
	}

	public static boolean isPrime(long num) {
		int res = 0;

		for (long i =1; i<=num ; i++ ) {
			if(num%i==0) ++res;
		}
		return res==2;
	}
}