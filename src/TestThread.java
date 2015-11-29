class RunnableDemo implements Runnable {
   private Thread t;
   private String threadName;
   
   Thread t1 = new Thread();
   
   public void run() {
	   System.out.println("YO");
	   
   }
   
   
   
   
   boolean isPrime(int n) {
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}

