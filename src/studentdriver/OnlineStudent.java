package studentdriver;


public class OnlineStudent extends StudentFees {
    
    private int noOfMonths;
    private double MONTHLY_FEE = 1245.5;
    
    public OnlineStudent(String studentName , int studentID , boolean isEnrolled , int noOfMonths){
        super(studentName, studentID, isEnrolled);
        this.noOfMonths = noOfMonths;
        
    }
    //getPayableAmount method
    public double getPayableAmount(){
        return MONTHLY_FEE * noOfMonths;
    }
    
    //toString method
    public String toString(){
        return "Student name: "+ getStudentName() +"\nStudent id: "+ getStudentID()+"\nEnrolled: "+ isIsEnrolled()+
                "\nNo of Months: "+ noOfMonths+"\nPayable Amount: "+ getPayableAmount();
    }
}



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

