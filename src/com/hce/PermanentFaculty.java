package com.hce;

public class PermanentFaculty extends Faculty implements Salary {

	public int yearsOfExperience;
	public double salary;
	public String subjectExpert;

	public PermanentFaculty(int facultyId, String facultyName,
			String facultyDept, String typeOfFaculty, long telephoneNo) {
		super(facultyId, facultyName, facultyDept, typeOfFaculty, telephoneNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
