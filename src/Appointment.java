import java.util.Random;



public class Appointment extends Thread {
	private static int time;
	private static Patient patient;
	public static String doctor = "Dr.Fallah";
	
	

	Appointment(Patient withPatient) {
		patient = withPatient;
		Appointment.setTime(patient.getTime());
	}
	
	Appointment() {
		
	}

	public void run() {// job of thread
		try {
			sleep(2000);
			System.out.println(doctor + " is seeing " + patient.getName());
			sleep(2000);
			System.out.println("The patient is here for a " + patient.getAppointmentType());
			sleep(2000);
			if(time > 3000) {
				sleep(2000);
				System.out.println("Tell the next patient he'll be done at the half hour mark");
				sleep(2000);
			} else if (time < 2000) {
				sleep(2000);
				System.out.println("The doctor should be out 20 minutes from his appointment");
				sleep(2000);
			} else {
				sleep(2000);
				System.out.println("The doctor should be out of his appointment soon");
				sleep(2000);
			}
			sleep(time);
			sleep(2000);
			System.out.println("Doctor will see the next patient");
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static int getTime() {
		return time;
	}

	public static void setTime(int time) {
		Appointment.setTime(time);
	}

}



class DemoApp {
	
	private static Appointment appointment = new Appointment();
	private static Patient[] patients;
	
	private static Patient patient;
	
	public static void main(String[] args) throws InterruptedException {
		Patient patient1 = new Patient("Physical","John Keys", randInt(2000,3600));
		Patient patient2 = new Patient("Check up","Marcus Mariota", randInt(2000,3900));
		Patient patient3 = new Patient("Pick up prescription","Alex Fallah", randInt(2000,3900));
		Patient patient4 = new Patient("New Patient appointment","Karina Assiter", randInt(3000,6000));
		Patient patient5 = new Patient("Physical","David Uv",randInt(3400,4200));
		
		patients = new Patient[] {patient1, patient2,patient3,patient4,patient5};
		
		for(int i = 0; i < patients.length; i++) {
			appointment = new Appointment(patients[i]);
			appointment.sleep(2200);
			appointment.start();
			appointment.sleep(3000);

		}
		appointment.sleep(2000);
		System.out.println("Doctor has seen all his patients");
	}


	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
}

