
public class EmployeeWage {
	public static final int Is_Full_Time=1,Is_Part_Time=2;
	private String company ;
	private final int Emp_Rate_Per_Hour ;
	private final int Num_Of_Working_Days;
	private final int Max_Working_Hrs_Per_Month;
	private  int totalEmpWage;
	
	
	
	public EmployeeWage(String company, int emp_Rate_Per_Hour, int num_Of_Working_Days, int max_Working_Hrs_Per_Month) {
	
		this.company = company;
		this.Emp_Rate_Per_Hour = emp_Rate_Per_Hour;
		this.Num_Of_Working_Days = num_Of_Working_Days;
		this.Max_Working_Hrs_Per_Month = max_Working_Hrs_Per_Month;
	}

	public void computeWage() {
		int empHrs=0, empWage=0,totalWorkingDays=0,totalEmpHrs=0;
		
		while(totalEmpHrs<=Max_Working_Hrs_Per_Month && totalWorkingDays<Num_Of_Working_Days) {
			totalWorkingDays++;
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
		totalEmpWage +=empWage;
		totalEmpHrs +=empHrs;
		
		}
	}
	

	@Override
	public String toString() {
		return "EmployeeWage Total Wage For " +company+" is : " + totalEmpWage ;
	}

	public static void main(String[] args) {
		EmployeeWage relaince=new EmployeeWage("Relaince Industry", 20, 2, 10);
		EmployeeWage adaniGroup=new EmployeeWage("Adani Group", 10, 4, 20);
		relaince.computeWage();
		System.out.println(relaince);
		adaniGroup.computeWage();
		System.out.println(adaniGroup);

		
	}
}
