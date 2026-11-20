package method_overriding_;

public class EmergencyPatient extends Hospital{
	@Override
	void patientDetails() {
		System.out.println("The details of the patient");
	}
	@Override
	void calculateBill() {
		int emergency_charges =2000;
		int treatment_charges =4000;
		System.out.println("the emergency charges"+emergency_charges);
		System.out.println("The treatment charges"+treatment_charges);
		System.out.println("total bills"+emergency_charges +treatment_charges);
	}

}
