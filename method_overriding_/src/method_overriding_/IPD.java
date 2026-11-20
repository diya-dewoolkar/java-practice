package method_overriding_;

public class IPD extends Hospital{
	@Override
	void patientDetails() {
		System.out.println("it contains patient info");
	}
	@Override
	void calculateBill() {
		int room_charges =4000;
		int treatment_charges =6000;
		System.out.println("the room charges"+room_charges);
		System.out.println("the treatment charges "+treatment_charges);
		System.out.println("the total calculated bill"+room_charges+treatment_charges);
	}
	public static void main(String[] args) {
		Hospital h = new GeneralPatient();
		h.patientDetails();
		h.calculateBill();
	
		Hospital r = new EmergencyPatient();
		r.patientDetails();
		r.calculateBill();

		Hospital p = new IPD();
		p.patientDetails();
		p.calculateBill();
		}
		}
		


