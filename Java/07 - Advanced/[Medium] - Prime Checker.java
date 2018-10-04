import static java.lang.System.*;

class Prime {
    
    public Prime() {}
    
    public void checkPrime(int... numbers) {
        
        for(int number : numbers) {
            BigInteger bigA = BigInteger.valueOf(number);
            if (bigA.isProbablePrime(1)) {
                System.out.print(bigA + " ");
            }
        }
        System.out.println();
    } 
}

