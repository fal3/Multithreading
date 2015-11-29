import java.util.Random;


class Patient {
//	private static int randomTime
	
	private int randomTime;
	private String appointmentType;
	
	public int getRandomTime() {
		return randomTime;
	}



	public String getAppointmentType() {
		return appointmentType;
	}



	public void setRandomTime(int randomTime) {
		this.randomTime = randomTime;
	}



	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}

	
	Patient(String aType) {
		appointmentType = aType;
		
	}
	
	
	
	public static int randInt(int min, int max) {
		
		Random rand = new Random();
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}
	
	public static int pickTime() {
		int myTimes[];
		myTimes = new int[] {150, 300, 600 };
		
		int pickedTime = myTimes[randInt(0,2)];
		
		return pickedTime;
		
	}

}
