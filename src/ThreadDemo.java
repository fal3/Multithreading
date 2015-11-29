import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.AbstractCollection;
import java.util.Random;

//HashMap
//LinkedHashMap
//Hashtable

//defining a thread 
class MyThread extends Thread {

	private static int time;

	MyThread(int t) {
		MyThread.setTime(t);

	}

	public void run() {// job of thread
		try {
			System.out.println("Doctor is seeing a patient");
			sleep(time);
			System.out.println("Doctor will see the next patient");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	public static int getTime() {
		return time;
	}

	public static void setTime(int time) {
		MyThread.time = time;
	}
}

// theres gonna be a boolean variable for the doctor class that will determine
// whether he is done with a patient or not, or whats on his agenda
//

class ThreadDemo {
	
	private static MyThread appointment = new MyThread(0);
	public static void main(String[] args) throws InterruptedException {
//		MyThread appointment = new MyThread(randInt(500, 3600));
		for (int i = 0; i < 5; i++) {
			appointment.start();
			
		}
		
		
		System.out.println("Doctor has seen all his patients");
	}

	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
}

// we need a patient prioritizer
