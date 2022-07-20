    package src.ApiResponse;  
      
    public class ApiResponse {  
     
	 
	private String Employeecode;
	private String FirstName;
	private String LastName;
	private String Yearlysalary;
	private int Taxamount;
	private long Cessamount;
	private int Dojinmonths;
	private long Salary;
	
      

	 public int getDojinmonths() {  
        return Dojinmonths;  
    }  
      
    public void setDojinmonths(int Dojinmonths) {  
        this.Dojinmonths = Dojinmonths;  
    }
	
    public String getEmployeecode() {  
        return Employeecode;  
    }  
      
    public void setEmployeecode(String Employeecode) {  
        this.Employeecode = Employeecode;  
    }  
      
    public String getFirstName() {  
        return FirstName;  
    }  
      
    public void setFirstName(String FirstName) {  
        this.FirstName = FirstName;  
    } 

	public String getLastName() {  
        return LastName;  
    }  
      
    public void setLastName(String LastName) {  
        this.LastName = LastName;  
    } 

	public String getEmployeecode() {  
        return Employeecode;  
    }  
      
    public void setEmployeecode(String Employeecode) {  
        this.Employeecode = Employeecode;  
    } 	
	
	
	
	public int getYearlysalary() {  
        return Yearlysalary;  
    }  
      
    
    public long getSalary() {  
        return Salary;  
    }  
      
    public void setSalary(long Salary) {  
        this.Salary = Salary; }
		
	
	public void setYearlysalary(String Yearlysalary) {  
//        this.Yearlysalary = Yearlysalary;  

	Yearlysalary = Salary * Dojinmonths;
	
	if(Yearlysalary<=250000)
	{
	Yearlysalary=0;
	}
	else if(Yearlysalary>250000 and <=500000)
	{
	Yearlysalary = Yearlysalary-12500;
	}
	else if(Yearlysalary>500000 and <=1000000)
	{
	Yearlysalary = Yearlysalary-37500;
	}
	else if(Yearlysalary>1000000)
	{
	Yearlysalary = Yearlysalary-75000;
	}
    } 	
	
	
    public void setTaxamount(int Taxamount) {  
        this.Taxamount = Taxamount; 
		
		
		public long getTaxamount() {  
        return Taxamount;  
    }  
      
    public void setCessamount(long Cessamount) {  
        //this.Cessamount = Cessamount; 
		Yearlysalary = Salary * Dojinmonths;
	
	if(Yearlysalary>=2500000)
	{
	Cessamount= Yearlysalary + (Yearlysalary * 0.02);
	}
		
		public long getCessamount() {  
        return Cessamount;  
    }  
	
	
	
	
	
      
    
	
    }  


