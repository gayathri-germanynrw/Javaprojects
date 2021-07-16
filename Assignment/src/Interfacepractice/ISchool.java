package Interfacepractice;

public interface ISchool extends IPrimary,ISecondary {
	
	public default String getSchoolName() {
		return "HSS School";
	}

}
