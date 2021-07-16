package Interfacepractice;

public class Main {
	
	
	public void getGradeOfMathFromSchool(ISchool school) {
		char cGrade=school.getGrade();
		System.out.println("----Grade---->"+cGrade);
		int iPercentage=school.getPercentage();
		System.out.println("-----Percentage----->"+iPercentage);
  		String strSchoolName=school.getSchoolName();
  		System.out.println("-----SchoolName----->"+strSchoolName);
	}
	public static void main(String[] args) {
		Main objMain=new Main();
		objMain.getGradeOfMathFromSchool(new Biology());
		
	}

}
