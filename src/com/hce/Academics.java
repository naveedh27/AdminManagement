package com.hce;

public class Academics {

	public int semesterId;
	public Faculty faculty;
	public String semestersubject;
	public static int counter;

	public Academics(int semesterId, Faculty faculty, String semestersubject) {
		super();
		this.semesterId = semesterId;
		this.faculty = faculty;
		this.semestersubject = semestersubject;
	}

	public String semesterWiseResults(Faculty faculty) {
		return semestersubject;
	}

}
