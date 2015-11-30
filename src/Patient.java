import java.util.Random;


class Patient {
//	private static int randomTime
	
	private int time;
	private String appointmentType;
	private String name;
	
	public int getTime() {
		return time;
	}



	public String getAppointmentType() {
		return appointmentType;
	}



	public void setRandomTime(int randomTime) {
		this.time = randomTime;
	}



	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}

	
	Patient(String aType, String n, int forTime) {
		appointmentType = aType;
		setName(n);
		time = forTime;
	}
	
	Patient() {
		
	}
	
	
	
	public static int randInt(int min, int max) {
		
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}
	
	public static int pickTime() {
		int myTimes[];
		myTimes = new int[] {150, 300, 600};
		int pickedTime = myTimes[randInt(0,2)];
		return pickedTime;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
