package com.hce;

public class VisitingFaculty extends Faculty implements Salary {

	public int noOfHours;
	public float payRatePerHour;
	public String subjectExpert;

	public VisitingFaculty(int facultyId, String facultyName,
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
