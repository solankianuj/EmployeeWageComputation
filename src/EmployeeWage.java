import java.util.ArrayList;

public class EmployeeWage implements IEmpWage{
	public static final int Is_Full_Time=1,Is_Part_Time=2;
	
	private int NumOfCompany=0;
	private  ArrayList<CompanyEmpWage> listOfCompanies;
	
	public EmployeeWage () {
		listOfCompanies=new ArrayList<CompanyEmpWage>();
	}
	

	public ArrayList<CompanyEmpWage> getListOfCompanies() {
		return listOfCompanies;
	}


	public void setListOfCompanies(ArrayList<CompanyEmpWage> listOfCompanies) {
		this.listOfCompanies = listOfCompanies;
	}


	@Override
	public void addCompanyEmpWage(String company, int emp_Rate_Per_Hour, int num_Of_Working_Days,
			int max_Working_Hrs_Per_Month) {
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company, emp_Rate_Per_Hour, num_Of_Working_Days, max_Working_Hrs_Per_Month);
		listOfCompanies.add(companyEmpWage);
		NumOfCompany++;
		}


	@Override
	public void computeEmpWage(String company) {
		
		for (int i=0; i< NumOfCompany;i++) {
			if(company==listOfCompanies.get(i).getCompany()) {
			computeWage(listOfCompanies.get(i));
			System.out.println(listOfCompanies);
			return;
			}
		}		
	}

	@Override
	public int computeWage(CompanyEmpWage companyEmpWage) {
		int empHrs=0, empWage=0,totalWorkingDays=0,totalEmpHrs=0;
		
		while(totalEmpHrs<=companyEmpWage.Max_Working_Hrs_Per_Month && totalWorkingDays<companyEmpWage.Num_Of_Working_Days) {
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
		
		empWage= empHrs * companyEmpWage.Emp_Rate_Per_Hour;
		totalEmpHrs +=empHrs;
		companyEmpWage.totalEmpWage=totalEmpHrs*companyEmpWage.Emp_Rate_Per_Hour;
		}
		return companyEmpWage.totalEmpWage ;
	}
	
	public static void main(String[] args) {
		EmployeeWage wage=new EmployeeWage();
		wage.addCompanyEmpWage("Relaince Industry", 10, 4, 32);
		wage.addCompanyEmpWage("Adani Group", 20, 2, 16);
		wage.computeEmpWage("Adani Group");
		
	}
	
}



