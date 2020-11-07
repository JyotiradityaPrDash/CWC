public class Collatz {

	public static long Co(long c) {
		int n = 0;
		
		while(c != 1) {
			if (c % 2 == 0) {
				c = c / 2;
			}
			else {
				c = (3 * c) + 1;
			}
			n  = n + 1;
		}
		return n ;
	}
	public static void main(String[] args) {
		long x = 0 ,max = 0;
		for(int i = 2; i < 1000000; i++) {
			
			if(Co(i) > max) {
				max = Co(i);
				x = i;
			}
		}
		System.out.println("number with highest collatz sequence is " +x);
	}

}