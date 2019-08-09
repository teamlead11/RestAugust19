package requestModel;

import java.util.List;

public class Employee {

	private String name;
	private int id;
	private int age;
	private int salary;
	private List<PreviousCompanyDetails> prevcompdetails;
	private List<String> vehicleDetails;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<PreviousCompanyDetails> getPrevcompdetails() {
		return prevcompdetails;
	}

	public void setPrevcompdetails(List<PreviousCompanyDetails> prevcompdetails) {
		this.prevcompdetails = prevcompdetails;
	}

	public List<String> getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(List<String> vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public int calculateBonus(int salary) {

		int bonus = salary * 10 / 100;

		return bonus;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", salary=" + salary + ", prevcompdetails="
				+ prevcompdetails + ", vehicleDetails=" + vehicleDetails + "]";
	}

}
