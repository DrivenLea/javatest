package 练习;

public class PrimeNumberMethod {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    System.out.println("The first prime Numbers are \n");
    printPrimeNumbers(50);
	}
	
	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
	    int count = 0;
	    int number =2;
	    
	    while(count < numberOfPrimes ) {
	    	if(isPrime(number)) {
	    		count++;
	        if(count % NUMBER_OF_PRIMES_PER_LINE == 0) {
	        	 System.out.printf("%-5s\n" , number);
	        }
	        else
	        	 System.out.printf("%-5s" , number );
	    	}
	    	number++;
	    
	    }
	}
	
    public static boolean isPrime(int number) {
    	for(int divisor = 2 ; divisor < number ; divisor++) {
    		if(number % divisor == 0)
    			return false;
    	}
    	return true;
    	
    }
}
