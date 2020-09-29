/** Junior Developer Sub Class, Yogesh Shrestha*/
public class JuniorDeveloper extends Developer
{
   private double Salary;
   private String AppointedDate;
   private String TerminationDate;
   private String EvaluationPeriod;
   private String Specialization;
   private String AppointedBy;
   private boolean Join;
   
   public JuniorDeveloper(String platform, String interviewername, int workhour, double Salary, String AppointedBy, String TerminationDate)
   {
       super(platform, interviewername, workhour);
       this.Salary=Salary;
       this.AppointedDate="";
       this.TerminationDate=TerminationDate;
       this.EvaluationPeriod="";
       this.Specialization="";
       this.AppointedBy=AppointedBy;     
       this.Join=false;
    }
    
   public double getsalary()//access method of salary
   {
       return this.Salary;
    }
    
    public String getappointdate()//access method of AppointedDate
    {
        return this.AppointedDate;
    }
    
    public String getterminatedate()//access method of TerminarionDate
    {
        return this.TerminationDate;
    }
    
    public String getevaluateperiod()//access method of EvaluationPeriod
    {
        return this.EvaluationPeriod;
    }
    
    public String getspecility()//access method of Specialization
    {
        return this.Specialization=Specialization;
    }
    
    public String getappointedby()//access method of AppointedBy
    {
        return this.AppointedBy;
    }
    
    public boolean getjoined()//access method of Join
    {
        return this.Join;
    }
    
    public void setsalary(double Salary)//mutor of salary
    {
        if(this.Join==true)
        {
            System.out.println("Sorry, The salary is fixed.");
        }
        else
        {
            this.Salary=Salary;
        }
    }
    public void Devloperappoint(String developername, String AppointedDate, String TerminationDate, String Specialization)
    //appointing a new developer
    {
        if (this.Join==false)
        {
            super.setDeveloper(developername);
            this.Join=true;
            this.EvaluationPeriod=EvaluationPeriod;
            this.AppointedDate=AppointedDate;
            this.TerminationDate=TerminationDate;
            this.Specialization=Specialization;
        }
        else
        {
            System.out.println("Developer appointed by: "+this.AppointedDate);
        }
    }
    
    public void display()//showing the results
    {
        super.display();
        if(this.Join==true)
        {
            System.out.println("Developer appointed at: " +getappointdate());
            System.out.println("Evaluation period: " +getevaluateperiod());
            System.out.println("Termination Date: " +getterminatedate());
            System.out.println("Developer Salary: " +getsalary());
            System.out.println("Developer Specialization: " +getspecility());
            System.out.println("Developer appointed by: " +getappointedby());
        }
    }
}
