public class StaffHire//StaffHire class is made
{
    private int vacancyNumber;
    private String designation;
    private String jobtype;
    //passing parameters in constructor
    public StaffHire(int vacancynumber,String designation,String jobtype){
        this.vacancyNumber=vacancynumber;
        this.designation=designation;
        this.jobtype=jobtype;
    }
    //getter method
    public int getVacancyNumber(){
        return vacancyNumber;
    }

    public String getDesignation(){
        return designation;
    }
    
    public String getJobType(){
        return jobtype;

    }
    //setter method
    public void setVacancyNumber (int vacancynumber) {
        this.vacancyNumber = vacancynumber;
    }
    
    public void setDesignation (String designation) {
        this.designation = designation;
    }

    public void setJobType (String jobtype) {
        this.jobtype = jobtype;
    }
    //display method 
    public void display(){
        System.out.println("Vacancy Number: " + vacancyNumber);//prints Vacancy Number:
        System.out.println("Designation: " + designation);//prints Designation:
        System.out.println("Job Type: " + jobtype);//prints Job Type:
    }
}
