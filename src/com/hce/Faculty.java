package com.hce;

public class Faculty {

	public int facultyId;
	public String facultyName, facultyDept, typeOfFaculty;
	public long telephoneNo;
	public static int counter;

	public Faculty(int facultyId, String facultyName, String facultyDept,
			String typeOfFaculty, long telephoneNo) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.facultyDept = facultyDept;
		this.typeOfFaculty = typeOfFaculty;
		this.telephoneNo = telephoneNo;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public String getFacultyDept() {
		return facultyDept;
	}

	public String getTypeOfFaculty() {
		return typeOfFaculty;
	}

	public long getTelephoneNo() {
		return telephoneNo;
	}

	public boolean validatetelephoneNo() {

		return false;
	}

}
