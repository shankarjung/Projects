/**Developer Super Class, Yogesh Shrestha */
public class Developer
{
    private String platform;
    private String interviewername;
    private String developername;
    private int workhour;
    
    public Developer (String platform, String interviewername, int workhour)
    {
        this.platform=platform;
        this.interviewername=interviewername;
        this.developername="";
        this.workhour=workhour;
    }
    
    public String getPlatform() //access method of platform
    {
        return this. platform;
    }
    
    public String getInterview()//access method of interviewer
    {
        return this.interviewername;
    }
    
    public String getDeveloper()//access method of developer
    {
        return this.developername;
    }
    
    public int getWorkhour()//access method of workhour
    {
        return this.workhour;
    }
    
    public void setDeveloper(String developername)//mutor method of developer
    {
        this.developername=developername;
    }
    
    public void display()//display the result without developer if developer is empty string 
    {
        if(this.developername=="") 
        {
            System.out.println("Platform: " +this.platform);
            System.out.println("Interviewer Name: " +this.interviewername);
            System.out.println("Work hour: " +this.workhour);
        }
        else
        {
            System.out.println("Platform: " +this.platform);
            System.out.println("Interviewer Name: " +this.interviewername);
            System.out.println("Work hour: " +this.workhour);
            System.out.println("Developer Name: "+this.developername);
        }
    }
}
