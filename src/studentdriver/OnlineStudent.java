package studentdriver;


public class OnlineStudent extends StudentFees {
    //initializing the variables
    private int noOfMonths;
    private final double MONTHLY_FEE = 1245.5;
    
    public OnlineStudent(String studentName , int studentID , boolean isEnrolled , int noOfMonths){
        super(studentName, studentID, isEnrolled);
        this.noOfMonths = noOfMonths;
        
    }
    //getPayableAmount method
    public double getPayableAmount(){
        return MONTHLY_FEE * noOfMonths;
    }
    
    //toString method
    public String toString() {
        return super.toString() +
            "\nNo of months: " + noOfMonths +
            "\nPayable amount: " + getPayableAmount();
    }
}
