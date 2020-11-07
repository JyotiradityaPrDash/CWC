public class prime{
    public static boolean isPrime(int p){
        boolean prime = false;
        if(p == 2){
            prime = true;
        }
        
        for(int i = 2; i < p; i++){
            if(p % i != 0){
                prime = true;
            } 
            else {
                prime = false;
                break;
            }
        }
        return prime;
    }


    public static void main(String[] args) {
        int pCont = 0;
        int x = 2;
        
        while(pCont < 10_001){
            if(isPrime(x)){
                pCont++;
            } 
            x++;
        }
        System.out.println("The 10 001st prime is: " + (x-1));
    }
}