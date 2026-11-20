package method_overriding_;

public class GeneralPatient extends Hospital{
	@Override
	void patientDetails() {
		System.out.println("patient info");
	}
	@Override
	void calculateBill(){
	int consultation_fee =500;
	int medical_fee =1000;
	System.out.println("Consultation charges ----->>>"+consultation_fee);
	System.out.println("medicine charges"+medical_fee);
	System.out.println("total fees"+consultation_fee+medical_fee );
	}
	
}

