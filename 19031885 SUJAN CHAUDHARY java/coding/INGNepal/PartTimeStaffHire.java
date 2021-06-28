//Making subclass
public class PartTimeStaffHire extends StaffHire{
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
 //calling Constructors. 
 public PartTimeStaffHire( int vacancyNumber, String designation, String jobType,int workingHour,int wagesPerHour,String shifts){
   super(vacancyNumber,designation,jobType);
      this.workingHour=workingHour;
      this.wagesPerHour=wagesPerHour;
      this.shifts=shifts;
      this.staffName="";
      this.joiningDate="";
      this.qualification="";
      this.appointedBy="";
      this.joined=false;
      this.terminated=false;
 }
  //getter Method  
  public int getWorkingHour(){
        return workingHour;
  }
  
  public int getWagesPerHour(){
        return wagesPerHour;
  }
  
  public String getShifts(){
        return shifts;
  }
  public String getStaffName(){
      return staffName;
  }
    
  public String getJoiningDate(){
        return joiningDate;
  }
  
  public String getQualification(){
        return qualification;
  }
  
  public String getAppointedBy(){
        return appointedBy;
  }
  
    public boolean getJoined(){
        return joined;
  }
  
  public boolean getTerminated(){
        return terminated;
  }
  //setter method
  public void setWorkingHour(int workinghour){
        this.workingHour= workingHour;
  }
  
  public void setWagesPerHour(int wagesPerHour){
        this.wagesPerHour=wagesPerHour;
  }
  public void setShifts(String newShifts){
    if(getJoined()==false){
        this.shifts= newShifts;
       }
    else
       {
         System.out.println("Not permitted to change the shifts"); 
        }
  }
  public void setStaffName(String staffName){
      this.staffName=staffName;
   }
  
  public void setJoiningDate(String JoiningDate){
        this.joiningDate=joiningDate;
  }
  
  public void setQualification(String qualification){
        this.qualification=qualification;
  }
  
  public void setAppointedBy(String appointedBy){
        this.appointedBy=appointedBy;
  }
  
  public void setJoined(boolean joined){
        this.joined=joined;
  }

  public void setTerminated(boolean terminated){
        this.terminated=terminated;
  }  
  
 public void hirePartTimeStaff (String staffName, String joiningDate, String qualification,String appointedBy){
    if(getJoined()==true){
         System.out.println("The staff is appointed already"+getJoiningDate()+getStaffName());
        }
    else
       {
        this.staffName=staffName;
        this.joiningDate=joiningDate;
        this.qualification=qualification;
        this.appointedBy=appointedBy;
        this.joined=true;
        this.terminated=false;
        }
 }
   
 public void terminateStaff(){
    if(getTerminated()==true){
        System.out.println("The satff is terminated already");
        }
    else
        {
          this.staffName="";
          this.joiningDate="";
          this.qualification="";
          this.appointedBy="";
          this.joined=false;
          this.terminated=true;
        }
 }
    
 public void display(){// using display method to display details of part time staff 
        super.display();
        if(joined == true){
        System.out.println("The Part Time Staff Working Hour is: "+getWorkingHour());
        System.out.println("The Part Time Staff Total Wage per Hour is: "+getWagesPerHour());
        System.out.println("The Part Time Staff Name is: "+ getStaffName());
        System.out.println("The Part Time Staff Joining date is: "+getJoiningDate());
        System.out.println("The Part Time Staff Qualification of: "+getQualification());
        System.out.println("The Part Time Staff is Appointed by: "+getAppointedBy());
        System.out.println("The Part Time Staff Income Per Day is :"+getWagesPerHour()*getWorkingHour());
    }
         
}
}
    
    
    
