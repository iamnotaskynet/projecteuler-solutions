/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

class Task {
	public static void main(String[] args) {
		
		long a = 1, b = 2;
		long sum = 0;
		while(b < 4000000){
			if(isEven(b)) sum += b;

			System.out.println("---"+b+"\n");
			long tmp = b;
			b = a + b;
			a = tmp;
		}

		System.out.println(sum);
	}

	public static boolean isEven(long num){
		boolean res = num%2== 0;
		return  res;
	}
}