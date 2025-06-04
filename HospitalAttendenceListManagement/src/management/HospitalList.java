package management;

import java.util.ArrayList;
import java.util.List;

public class HospitalList {
	
	private List<patient> PreferredPatientList = new ArrayList<>();
	private List<patient> NormalPatientList = new ArrayList<>();	



	
	public List<patient> getPreferredPatientList() {
		return PreferredPatientList;
	}

	public void setPreferredPatientList(List<patient> preferredPatientList) {
		PreferredPatientList = preferredPatientList;
	}

	public List<patient> getNormalPatientList() {
		return NormalPatientList;
	}

	public void setNormalPatientList(List<patient> normalPatientList) {
		NormalPatientList = normalPatientList;
	}

	public void AddPatient (patient x) {
		if  (x.getMedicalAttendenceType() == typeAttendence.NORMAL) {
			NormalPatientList.add(x);
			System.out.println("Patient " + x.getName() + "added to the preferred list.\n");
		} else {
			PreferredPatientList.add(x);
			System.out.println("Patient " + x.getName() + "added to the normal list.\n");
		}
	}
	
	public patient callNext() {
		if (!PreferredPatientList.isEmpty()) {
			return PreferredPatientList.remove(0);
		} else if (!NormalPatientList.isEmpty()) {
			return NormalPatientList.remove(0);
		} else {
			return null;
		}
	}
	
	public void showLists() {
		System.out.println("\n=== Refreshed Lists ===");
		System.out.println("\n=== Preferred Patients (" + PreferredPatientList.size() + "):");
		for (patient X: PreferredPatientList) {
			System.out.println(" - " + X.getName());
		}
		System.out.println("\n=== Normal Patients (" + NormalPatientList.size() + "):");
		for (patient x: NormalPatientList) {
			System.out.println(" - " + x.getName());
		}
		System.out.println("======================\n");
	}
}
