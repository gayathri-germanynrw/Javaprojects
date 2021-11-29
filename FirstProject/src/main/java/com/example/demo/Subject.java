package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Subject {
	private String english;
	private String maths;
	private String science;
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getMaths() {
		return maths;
	}
	public void setMaths(String maths) {
		this.maths = maths;
	}
	public String getScience() {
		return science;
	}
	public void setScience(String science) {
		this.science = science;
	}
	
    public void TotalMarks() {
		
    	System.out.println("inside Total marks");

	}
	@Override
	public String toString() {
		return "Subject [english=" + english + ", maths=" + maths + ", science=" + science + "]";
	}
    

}
