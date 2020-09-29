import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class RigoTechnology implements ActionListener{ 
    JTextField platform1Text, workinghr1Text ,salaryText ,interviewer1Text ,appointedbyText , termidateText ,platform2Text, workinghr2Text, salary2Text,
    interviewer2Text, contractperiodText, name1Text, specializationText, dev1Text, appointDateText, termiDateText, name2Text,  joiningDateText, dev2Text,
    roomnoText, advanceSlryText;
    
    JButton juniorBtn, seniorBtn, appointBtn, termiBtn, appointJrbtn, displayBtn, clearBtn;
    
     JLabel labelJAdd,platform_1,working_Hour1 ,Salary ,Interviewer1 ,appointed_By ,termination_Date,labelSAdd ,Platform2 ,workingHour_2 , Salary2 ,
     Interviewer2,contract_Period,label_Junior ,Name1 ,Specialization ,developerNo_1 ,appoint_Date ,Termi_Date ,labelSenior ,Name2 ,joining_Date ,developerNo_2 ,room_No
     ,advance_Slry ;
    
    ArrayList<Developer> developerList = new ArrayList<>();
        
    // instance variables - replace the example below with your own
    public static void main(String arg[])
    {
        RigoTechnology obj= new RigoTechnology();
        obj.RigoTechnologyHw();
    }
        
    public void RigoTechnologyHw()
    {
        JFrame jFrame = new JFrame("Rigo Technology");
        jFrame.setSize(670,675);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container container = jFrame.getContentPane();
        
        //Label along with textfield starts from here:
        JLabel labelJAdd = new JLabel("Add platform for Junior Developer", JLabel.CENTER);
        labelJAdd.setBounds(-100, 10, 450, 70);
        
        JLabel platform_1 = new JLabel("Platform:");
        platform_1.setBounds(30, 60, 120, 30);
        
        platform1Text = new JTextField();
        platform1Text.setBounds(100, 60 , 125, 30);
        
        JLabel working_Hour1 = new JLabel("Working Hour:");
        working_Hour1.setBounds(270, 60, 120, 30);
        
        workinghr1Text = new JTextField();
        workinghr1Text.setBounds(360, 60 , 95, 30);
                       
        JLabel Salary = new JLabel("Salary:");
        Salary.setBounds(470, 60 , 120, 30);
        
        salaryText = new JTextField();
        salaryText.setBounds(520, 60, 110, 30);
                
        JLabel Interviewer1 = new JLabel("Interviewer:");
        Interviewer1.setBounds(30, 95, 120, 30);
        
        interviewer1Text = new JTextField();
        interviewer1Text.setBounds(100, 95 , 150, 30);
        
        JLabel appointed_By = new JLabel("Appointed By:");
        appointed_By.setBounds(270, 95 , 110, 30);
        
        appointedbyText = new JTextField();
        appointedbyText.setBounds(360, 95, 95, 30);
        
        JLabel termination_Date = new JLabel("Termi. Date:");
        termination_Date.setBounds(470, 95, 100, 30);
        
        termidateText = new JTextField();
        termidateText.setBounds(545, 95, 85 ,30);
        
        
        JLabel labelSAdd = new JLabel("Add platform for Senior Developer", JLabel.CENTER);
        labelSAdd.setBounds(-100, 150, 450, 70);
        
        JLabel Platform2 = new JLabel("Platform:");
        Platform2.setBounds(30, 200, 120, 30);
        
        platform2Text = new JTextField();
        platform2Text.setBounds(100, 200 , 125, 30);
        
        JLabel workingHour_2 = new JLabel("Working Hour:");
        workingHour_2.setBounds(270, 200, 120, 30);
        
        workinghr2Text = new JTextField();
        workinghr2Text.setBounds(360, 200 , 95, 30);
                       
        JLabel Salary2 = new JLabel("Salary:");
        Salary2.setBounds(470, 200 , 120, 30);
        
        salary2Text = new JTextField();
        salary2Text.setBounds(520, 200, 110, 30);
                
        JLabel Interviewer2 = new JLabel("Interviewer:");
        Interviewer2.setBounds(30, 235, 120, 30);
        
        interviewer2Text = new JTextField();
        interviewer2Text.setBounds(100, 235 , 150, 30);
        
        JLabel contract_Period = new JLabel("Contract Period:");
        contract_Period.setBounds(445, 235, 100, 30);
        
        contractperiodText = new JTextField();
        contractperiodText.setBounds(545, 235, 85 ,30);
        
        
        JLabel label_Junior = new JLabel("Appoint Junior Developer", JLabel.CENTER);
        label_Junior.setBounds(-125, 300, 450, 50);
        
        JLabel Name1 = new JLabel("Name:");
        Name1.setBounds(30, 340, 120, 30);
        
        name1Text = new JTextField();
        name1Text.setBounds(100, 340 , 330, 30);
        
        JLabel Specialization = new JLabel("Specialization:");
        Specialization.setBounds(450, 340, 120, 30);
        
        specializationText = new JTextField();
        specializationText.setBounds(535, 340, 95, 30);
        
        JLabel developerNo_1 = new JLabel("Dev No:");
        developerNo_1.setBounds(30, 375, 120, 30);
        
        dev1Text = new JTextField();
        dev1Text.setBounds(100, 375 , 90, 30);
        
        JLabel appoint_Date = new JLabel("Appoint Date:");
        appoint_Date.setBounds(240, 375, 120, 30);
        
        appointDateText = new JTextField();
        appointDateText.setBounds(320, 375, 110, 30);
                
        JLabel Termi_Date = new JLabel("Termi Date:");
        Termi_Date.setBounds(450, 375, 130, 30);
        
        termiDateText = new JTextField();
        termiDateText.setBounds(535, 375, 95, 30);
        
        
        JLabel labelSenior = new JLabel("Appoint/Terminate Senior Developer", JLabel.CENTER);
        labelSenior.setBounds(-95, 450, 450, 50);
        
        JLabel Name2 = new JLabel("Name:");
        Name2.setBounds(30, 490, 120, 30);
        
        name2Text = new JTextField();
        name2Text.setBounds(100, 490 , 330, 30);
        
        JLabel joining_Date = new JLabel("Joining date:");
        joining_Date.setBounds(450, 490, 120, 30);
        
        joiningDateText = new JTextField();
        joiningDateText.setBounds(530, 490, 100, 30);
        
        JLabel developerNo_2 = new JLabel("Dev No:");
        developerNo_2.setBounds(30, 525, 120, 30);
        
        dev2Text = new JTextField();
        dev2Text.setBounds(100, 525 , 90, 30);
       
        JLabel room_No = new JLabel("Room No:");
        room_No.setBounds(260, 525, 120, 30);
        
        roomnoText = new JTextField();
        roomnoText.setBounds(320, 525, 110, 30);
        
        JLabel advance_Slry = new JLabel("Adv Salary:");
        advance_Slry.setBounds(450, 525, 90, 30);
        
         advanceSlryText = new JTextField();
        advanceSlryText.setBounds(530, 525, 100, 30);
        
        //--Label ends here---
        //---field ends here---
        
        //button starts here:
        juniorBtn = new JButton("Add for Junior");
        juniorBtn.setBounds(510, 130, 120, 30);
        jFrame.add(juniorBtn);
        
        seniorBtn = new JButton("Add for Senior");
        seniorBtn.setBounds(510, 270, 120, 30);
        jFrame.add(seniorBtn);
        
        appointBtn = new JButton("Appoint");
        appointBtn.setBounds(370, 570, 120, 30);
        jFrame.add(appointBtn);
        
        termiBtn = new JButton("Terminate");
        termiBtn.setBounds(510, 570, 120, 30);
        jFrame.add(termiBtn);
        
        appointJrbtn = new JButton("Appoint Junior Dev");
        appointJrbtn.setBounds(430, 415, 200, 30);
        jFrame.add(appointJrbtn);
        
        displayBtn = new JButton("Display All");
        displayBtn.setBounds(230, 570, 120, 30);
        jFrame.add(displayBtn);
        
        clearBtn = new JButton("Clear");
        clearBtn.setBounds(90, 570, 120, 30);
        jFrame.add(clearBtn);
        //--button ends here--
        
        //container starts here:
        container.setLayout(null);
        container.add(labelJAdd);
        container.setLayout(null);
        container.add(labelSAdd);
        container.setLayout(null);
        container.add(labelSenior);
        container.setLayout(null);
        container.add(label_Junior);
        container.add(platform1Text);
        container.add(workinghr1Text);
        container.add(Interviewer1);
        container.add(interviewer1Text);
        container.add(Salary);
        container.add(salaryText);
        container.add(appointed_By);
        container.add(appointedbyText);
        container.add(termination_Date);
        container.add(termidateText);
        container.add(Platform2);
        container.add(platform2Text);
        container.add(workingHour_2);
        container.add(workinghr2Text);
        container.add(Salary2);
        container.add(salary2Text);
        container.add(Interviewer2);
        container.add(interviewer2Text);
        container.add(contract_Period);
        container.add(contractperiodText);
        container.add(name1Text);        
        container.add(joiningDateText);
        container.add(dev1Text);
        container.add(roomnoText);
        container.add(advanceSlryText);
        container.add(name2Text);
        container.add(specializationText);
        container.add(dev2Text);
        container.add(appointDateText);
        container.add(termiDateText);
        container.add(platform_1);
        container.add(working_Hour1);
        container.add(Name1);
        container.add(developerNo_1);
        container.add(joining_Date);
        container.add(room_No);
        container.add(advance_Slry);
        container.add(Name2);
        container.add(Specialization);
        container.add(developerNo_2);
        container.add(appoint_Date);
        container.add(Termi_Date);
        //--container ends here--
        
        juniorBtn.addActionListener(this);
        seniorBtn.addActionListener(this);
        appointBtn.addActionListener(this);
        termiBtn.addActionListener(this);
        appointJrbtn.addActionListener(this);
        displayBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        
        jFrame.setVisible(true);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {   if (e.getSource()==juniorBtn)
        {
            try
            { 
              String platform = platform1Text.getText();
              String interviewer = interviewer1Text.getText();
              int workinghour = Integer.parseInt(workinghr1Text.getText());
              String appointedby = appointedbyText.getText();
              double salaryjunior= Double.parseDouble(salaryText.getText()); 
              String terminationdate = termidateText.getText();
              
              System.out.println("Platform for Junior Developer added.");
              JOptionPane.showMessageDialog(null,"Added platform for Junior Developer");
                                                
              if(salaryjunior < 11000 || salaryjunior > 5000000)
              {
                  System.out.println("Salary range of Develpors is 11000 to 5000000. Please insert a Valid Data");
              }
              else if (interviewer.isEmpty())
              {
                  System.out.println("Do not leave textFields empty");
                }
              else if (workinghour < 8 || workinghour >16 )
              {
                 System.out.println("The range of working hour Develpors is 8 to 16. Please insert a Valid Data");
                  
              }
              else
              {
                  JuniorDeveloper dev_Junior = new JuniorDeveloper(platform ,interviewer ,workinghour ,salaryjunior ,appointedby ,terminationdate) ;
                  developerList.add(dev_Junior);
                  
                  System.out.println("Process Success" + "\n" + platform + "\n" + "Interviewer :" + interviewer + "\n" + "Wokring Hour : " + workinghour + 
                  "\n" + "Salary : " + salaryjunior + "\n" + "Appointed By :" + appointedby + "\n" + "Termination Date :" + terminationdate);
            }
            }
            
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
        }
        
        else if(e.getSource()==seniorBtn)
        {
            try
            {
                String platform_senior=platform2Text.getText();
                int workinghour_senior=Integer.parseInt(workinghr2Text.getText());
                double salary_senior=Double.parseDouble(salary2Text.getText());
                String interviewer_senior = interviewer2Text.getText();
                int contract_Senior=Integer.parseInt(contractperiodText.getText());
                
                System.out.println("Platform for Senior Developer added.");
                
               if (platform_senior.matches(".*\\d.*") || interviewer_senior.matches(".*\\d.*"))
              {
                  System.out.println("Please Enter Valid Data" );
               }
               else if(salary_senior < 11000 || salary_senior > 5000000)
              {
                  System.out.println("Salary range of Develpors is 11000 to 5000000. Please insert a Valid Data");
              }
              else if (workinghour_senior < 8 || workinghour_senior >16 )
              {
                 System.out.println("The range of working hour Develpors is 8 to 16. Please insert a Valid Data");
                  
              }
              else
              {
                SeniorDeveloper dev_Senior = new SeniorDeveloper(platform_senior ,interviewer_senior,workinghour_senior,salary_senior ,contract_Senior);
                developerList.add(dev_Senior);
                System.out.println( "Process Success" + "\n"+ "Platform : "+ platform_senior + "\n" + "Interviewer : " +
                interviewer_senior +"\n" + "Working Hour :" + workinghour_senior + "\n" + "Salary : " + salary_senior + "\n" + 
                "Contract Period : " +contract_Senior);
                
                JOptionPane.showMessageDialog(null,"Added platform for Senior Developer");
            
               }
            }
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
            
        }    
    
        else if (e.getSource()==appointJrbtn)
        {   
            try
            { 
                String name_Appointjunior=name1Text.getText();
                String spec_Appointjunior=specializationText.getText();
                int devno_Appointjunior=Integer.parseInt(dev1Text.getText());
                String appointDate_appointJunior=appointDateText.getText();
                String termiDate_appointJunior=termiDateText.getText();
                
                
               
               
               if(devno_Appointjunior < developerList.size())
               {
                   
                   if(developerList.get(devno_Appointjunior) instanceof JuniorDeveloper)
                   {
                       JuniorDeveloper dev_J = (JuniorDeveloper) developerList.get(devno_Appointjunior);
                       dev_J.Devloperappoint(name_Appointjunior, appointDate_appointJunior, termiDate_appointJunior, spec_Appointjunior);
                       
                       System.out.println("Junior Developer is appointed");
                       JOptionPane.showMessageDialog(null,"Junior Developer Appointed");
                   }
                   else
                   {
                       System.out.println("Please entvalid data");
                       JOptionPane.showMessageDialog(null,"Junior developer cannot be appointed");
                    
                    }
                }
                else
                {
                    System.out.println("Please enter  valid data");
                    JOptionPane.showMessageDialog(null,"Invalid Data");
                }
            }
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
        }
    
        else if (e.getSource()==termiBtn)
        { 
            try
            {
                int devNo_senDevter = Integer.parseInt(dev2Text.getText());
                if(devNo_senDevter < developerList.size())
                {
                    
                    if(developerList.get(devNo_senDevter) instanceof SeniorDeveloper)
                    {
                        SeniorDeveloper dev1 = (SeniorDeveloper) developerList.get(devNo_senDevter);
                        dev1.terminate();
                        
                        System.out.println("Senior Developer is Termiated");
                        JOptionPane.showMessageDialog(null,"Senior Developer has been terminated");
                    }
                    else
                    {
                        System.out.println("Senior Developer is not terminated");
                        JOptionPane.showMessageDialog(null,"Senior Developer cannot be terminated");
                    }
                }
                
            }
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
        }
        
        else if (e.getSource()==appointBtn)
        {
            try
            {
                String name_AppointsenDev=name2Text.getText();
                String joinDate_senDev=joiningDateText.getText(); 
                int devNo_senDev = Integer.parseInt(dev2Text.getText());
                String roomNo_senDev = roomnoText.getText();
                double advanceSalry_senDev= Double.parseDouble(advanceSlryText.getText());
                
                
                if(devNo_senDev < developerList.size())
                {
                    
                    if(developerList.get(devNo_senDev) instanceof SeniorDeveloper)
                    {
                        SeniorDeveloper dev1 = (SeniorDeveloper) developerList.get(devNo_senDev);
                        dev1.developerappoint(name_AppointsenDev,joinDate_senDev, advanceSalry_senDev, roomNo_senDev);
                        
                        System.out.println("Senior Developer is appointed" + "\n" + "Name : " + name_AppointsenDev + "\n" + 
                        "Joining Date : " + joinDate_senDev + "\n" + "Advance Salary" + advanceSalry_senDev + "\n" + "Room Number :" + roomNo_senDev);
                        JOptionPane.showMessageDialog(null,"Senior Developer Appointed");
                    }
                    else
                    {
                        System.out.println("Senior Developer is not appointed yet !");
                        JOptionPane.showMessageDialog(null,"Senior developer cannot be appointed");
                    }
                }
                else
                {
                    System.out.println("Please enter a valid data");
                    JOptionPane.showMessageDialog(null,"Invalid Data");
                }
            }
            
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
        }
        else if (e.getSource()==displayBtn)
        {
            try
            {
                
                int b = developerList.size();
               
                for(int i=0; i<b;i++) {
                 Developer displayBtn= developerList.get(i);
                
                    if (displayBtn instanceof SeniorDeveloper)
                    {
                        SeniorDeveloper dev1 = (SeniorDeveloper) developerList.get(i);
                        dev1.showfinal();
                    }
                    else if (displayBtn instanceof JuniorDeveloper)
                    {
                       JuniorDeveloper dev_J = (JuniorDeveloper) developerList.get(i);
                       dev_J.display();
                    }
                
                }
            }
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
        }
        else if(e.getSource()==clearBtn)
        {
            try
            {
              platform1Text.setText("");
              interviewer1Text.setText("");
              workinghr1Text.setText("");
              appointedbyText.setText("");
              salaryText.setText("");
              termidateText.setText("");
              platform2Text.setText("");
              workinghr2Text.setText("");
              salary2Text.setText("");
              interviewer2Text.setText("");
              contractperiodText.setText("");
              name1Text.setText("");
              specializationText.setText("");
              dev1Text.setText("");
              appointDateText.setText("");
              termiDateText.setText("");
              name2Text.setText("");
              joiningDateText.setText(""); 
              dev2Text.setText("");
              roomnoText.setText("");
              advanceSlryText.setText("");
              JOptionPane.showMessageDialog(null,"All fields cleared");
            }
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
        }
    }
}