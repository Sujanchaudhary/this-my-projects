//making a subclass
public class FullTimeStaffHire extends StaffHire{
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

    //calling Constructor 
    public FullTimeStaffHire(int vacancyNumber, int salary, int workingHour, String designation, String jobType){
        super(vacancyNumber,designation,jobType);//super class.
        this.salary= salary;
        this.workingHour= workingHour;
        this.staffName= "";
        this.joiningDate= "";
        this.qualification="";
        this.appointedBy= "";
        this.joined= false;

    }

    //getter method.
    public int getSalary(){
        return salary;
    }

    public int getWorkingHour(){
        return workingHour;
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

    //setter method 

    public void setSalary(int newSalary){
        if (getJoined()==false){ // using method to set the salary as changes to salary inevitably occur.
            this.salary= newSalary;
        }
        else
        {
            System.out.println("not permitted to change salary");   
        }

    }

    public void setWorkingHour(int newWorkingHour){
        this.workingHour=newWorkingHour;
    }

    public void setStaffName(String staffName){
        this.staffName=staffName;
    }

    public void setJoiningDate(String joiningDate){
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

    public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if (getJoined()==true){
            System.out.println("The staff has been already appointed"+getJoiningDate()+getStaffName());
        }
        else
        {
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.joined=true;
        }
    }

    public void display(){//using display method display value of full time staff. 
        super.display();
        if (joined == true){

            System.out.println("The staff salary is: " +getSalary());
            System.out.println("The staff WorkingHour is: " +getWorkingHour());
            System.out.println("The name of Staff is: " +getStaffName());
            System.out.println("The staff Joining Date is: " +getJoiningDate());
            System.out.println("The staff Qualification is: " +getQualification());
            System.out.println("The staff appointed By: " +getAppointedBy());

        }
    }

}    