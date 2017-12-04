package utils;
public class Math {
	public static long factorial(int n){
	    long product = 1;
	    for(int i=n;i>0;i--){
	    	product *= (i);
	  	}
	    return product;
  	}
  	public static long factorialRec(int n) {
  		if(n <= 1) {
  			return 1;
  		}
  		return n * factorialRec(n - 1);
  	}
}