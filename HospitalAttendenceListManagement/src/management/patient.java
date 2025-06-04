package management;

public class patient {
	

	private String Name;
	private typeAttendence MedicalAttendenceType;

	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public typeAttendence getMedicalAttendenceType() {
		return MedicalAttendenceType;
	}

	public void setMedicalAttendenceType(typeAttendence medicalAttendenceType) {
		MedicalAttendenceType = medicalAttendenceType;
	}

	public patient (String Name, typeAttendence MedicalAttendenceType) {
		this.Name = Name;
		this.MedicalAttendenceType = MedicalAttendenceType;
	}
}
	
	
	

