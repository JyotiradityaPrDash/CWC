import java.util.*;
public class RPS {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char P1;
		char C1 = ' ';
		int compRand;
		int cp = 0 , cc = 0;
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		
		
		for(int i = 1; i<=3; i++) {
			
			compRand = ra.nextInt(3)+1;
			if(compRand == 1)
				C1 = 'R';
			else if(compRand == 2)
				C1 = 'S';
			else if(compRand == 3)
				C1 = 'P';
		
		System.out.println("ROUND: "+i);
		System.out.println("Enter User’s choice: ");
		P1 = sc.next().charAt(0);
		
		P1 = Character.toUpperCase(P1); 
		if(P1 == 'R' || P1 == 'S' || P1 == 'P') {
		System.out.println("Computer’s choice (randomly generated): "+ C1);
		
		
		if (P1 == C1) {
		       System.out.println("Tie of round."); 
			}
		else if (P1 == 'R' && C1 == 'S') { 
		    	
			System.out.println("User won the round");
			cp++;
		    	}
		else if (C1 == 'P' && P1 == 'R') {
		       
			System.out.println("Computer won the round");
			cc++;
		       }
		    
		else if (P1 == 'P' && C1 == 'S') { 
		      
			System.out.println("Computer won the round"); 
			cc++;
		      }
		       	
		else if (C1 == 'R' && P1 =='P' ) {
		            
			System.out.println("User won the round"); 
			cp++;
		            }
		else if (P1 == 'S' && C1 == 'P') {
		         
			System.out.println("User won the round");
			cp++;
			}
		else if (C1 == 'R' && P1 == 'S') {
		            
			System.out.println("Computer won the round");
			cc++;
			}}
		else {
			System.out.println("Invalid Input");
		
		   }
		} 
		System.out.print("3 Rounds over, User scored "+cp);
		if(cp>cc)
			System.out.println(", user won the game.");
		else
			System.out.println(", computer won the game.");
		
		
	}

}
