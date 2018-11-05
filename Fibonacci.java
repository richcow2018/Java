public class Fibonacci {

	public int fibo(int n) {
      	if(n==0) {
        	return 0;
      	}
      	if(n==1) {
       		return 1;
		}
      	else {
       		return fibo(n-1)+fibo(n-2);
     	}
	}	
	
	public static void main(String s[]) {
        	Fibonacci f = new Fibonacci();
        	for(int i=0; i<10; i++) {
            		System.out.println(f.fibo(i));
			}
	}
	
}