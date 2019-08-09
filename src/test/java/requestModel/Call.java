package requestModel;

import java.util.ArrayList;
import java.util.List;

public class Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		emp1.setName("A");
		emp1.setId(1);
		emp1.setAge(22);
		emp1.setSalary(1000);
		
		List<String> vehicleDetails= new ArrayList<String>();
		vehicleDetails.add("Car");
		vehicleDetails.add("Bike");
		
		emp1.setVehicleDetails(vehicleDetails);
		PreviousCompanyDetails prevcompdetails1 = new PreviousCompanyDetails();
		prevcompdetails1.setCompanyName("CTS");
		prevcompdetails1.setLwd("11112006");
		
		PreviousCompanyDetails prevcompdetails2 = new PreviousCompanyDetails();
		prevcompdetails2.setCompanyName("TCS");
		prevcompdetails2.setLwd("11112009");
		
		List<PreviousCompanyDetails> compDetails = new ArrayList<PreviousCompanyDetails>();
		compDetails.add(prevcompdetails1);
		compDetails.add(prevcompdetails2);
		
		emp1.setPrevcompdetails(compDetails);
	
		System.out.println(emp1);
	}

}
