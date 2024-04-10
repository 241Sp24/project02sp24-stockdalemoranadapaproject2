package studentdriver;

public class GraduateStudent extends StudentFees {
    //initializing variables
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 654.45;
    
    
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
        this.coursesEnrolled = coursesEnrolled;
    }

    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.coursesEnrolled = coursesEnrolled;
    }
    //isISGraduateAssistant method(get method)
    public boolean isIsGraduateAssistant() {
        return isGraduateAssistant;
    }
    
    //Getter Methods
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    
    public double getPayableAmount(){
        return (coursesEnrolled * CREDITS_PER_COURSE) * PER_CREDIT_FEE;
    }
        
    //toString method
    public String toString() {
            return super.toString() + "\n" +
                    "Graduate assistant: " + isGraduateAssistant +
                    "\nGraduate assistant type: " + graduateAssistantType +
                    "\nCourses enrolled: " + coursesEnrolled +
                    "\nPayable amount: " + getPayableAmount();
    }    
}
