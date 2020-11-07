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
	      int p = 1;
	      
	      for(int i = 999; i >= 100; i--) {
	        for(int j = 999; j >= 100; j--){
	        
	        	p = i * j;
	        
	  	      if(palin(p) == p) {
	  	    	 System.out.println(p);
	  	      	System.exit(0);
	  	      }
	        		          
	      }
	  }
	}
}