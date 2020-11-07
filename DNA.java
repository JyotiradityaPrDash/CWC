import java.util.*;
public class DNA {

	public static String complementDNA(String dna){
		
	    StringBuilder builder = new StringBuilder();
	    for(int i=0;i<dna.length();i++){
	        char c = dna.charAt(i);
	        c = Character.toUpperCase(c); //even if user gave input as small character it will not show error
	        switch(c) {
	        case 'T': 
	        	 builder.append('A');
	        	 break;
	        case 'A':
	        	 builder.append('U');
	        	 break;
	        case 'C':
	        	 builder.append('G');
	        	 break;
	        case 'G':
	        	builder.append('C');
	        	break;
	        default:
	        	System.out.println("Invalid Input");
	        	System.exit(0);
	        }
	        
	     
	    }
	    return builder.toString();
	}
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		String dna = sc.next();
		System.out.println(complementDNA(dna));
	}

}
