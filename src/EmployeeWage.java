
public class EmployeeWage {
	public static final int Is_Full_Time=1,Is_Part_Time=2,Emp_Rate_Per_Hour=20;
	
	public static void main(String[] args) {
		
		int empHrs=0, empWage=0;
		
		int empCheck=(int) (Math.floor(Math.random()*10)%3);
		switch(empCheck)
		{	
		case Is_Full_Time :
			empHrs=8;
			break;
		
		case Is_Part_Time :
			empHrs=4;
			break;
		
		default :
			empHrs=0;
		}
		
		empWage= empHrs *Emp_Rate_Per_Hour;
		
		System.out.println("Employee Daily Wage Is : "+empWage);
		
	}

}
