public class palindrome {
	
	public static int palin(int num){
		int rev = 0, digit;
		
	  while(num != 0){
	    digit = num % 10;
	    rev = rev * 10 + digit;
	    num = num / 10;
	  }
	  
	 return rev;
	}

	public static void main(String[] args) {
	      int p = 1, m = 0;
	      
	      for(int i = 999; i >= 100; i--) {
	        for(int j = 999; j >= 100; j--){
	        
	        	p = i * j;
	        
	  	      if(palin(p) == p && p > m) {
	  	    	 m = p;
	  	      	
	  	      }
	        		          
	      }
	  }
		System.out.println(m);
	}
}
