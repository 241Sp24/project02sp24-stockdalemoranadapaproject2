package studentdriver;

public class UGStudent extends StudentFees {
    //initializing the variables
    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;
    
    public UGStudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled){
        super(studentName, studentID, isEnrolled);
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;
        this.coursesEnrolled = coursesEnrolled;
    }
    
    //public boolean isHasScholarship(){
        
    //Getter Methods
    public double getScholarshipAmount(){
        return scholarshipAmount;
    }
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    public double getPayableAmount(){
        return ADDITIONAL_FEE - scholarshipAmount;
    }
    //toString Method
    public String toString() {
        return super.toString() + "\n" +
                "Scholarship: " + hasScholarship +
                "\nScholarship amount: " + scholarshipAmount +
                "\nCourses enrolled: " + coursesEnrolled +
                "\nPayable amount: " + getPayableAmount();
    }
}    
