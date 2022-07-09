
public class EmployeeWage {
	
	public static void main(String[] args) {
		
		int Is_Full_Time=1,Is_Part_Time=2,Emp_Rate_Per_Hour=20;
		int empHrs=0, empWage=0;
		
		
		double empCheck=Math.floor(Math.random()*10)%3;
		if(empCheck==Is_Full_Time) {
			empHrs=8;
		}
		else if(empCheck==Is_Part_Time) {
			empHrs=4;
		}
		else {
			empHrs=0;
		}
		empWage= empHrs *Emp_Rate_Per_Hour;
		
		System.out.println("Employee Daily Wage Is : "+empWage);
		
	}

}
