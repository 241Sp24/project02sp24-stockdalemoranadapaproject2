package studentdriver;

abstract class StudentFees {
    
    //initializing the variables
    private String studentName;
    private int studentID;
    private boolean isEnrolled;
    final int CREDITS_PER_COURSE = 3;
    final double PER_CREDIT_FEE = 543.50;

    public StudentFees(String studentName, int studentID, boolean isEnrolled) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.isEnrolled = isEnrolled;
    }

    //Getter Methods
    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getCREDITS_PER_COURSE() {
        return CREDITS_PER_COURSE;
    }

    public double getPER_CREDIT_FEE() {
        return PER_CREDIT_FEE;
    }
    
    //Setter Methods
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setIsEnrolled(boolean isEnrolled) {
        this.isEnrolled = isEnrolled;
    }

    public boolean isIsEnrolled() {
        return isEnrolled;
    }
    
    //public abstract method
    public abstract double getPayableAmount();

    //toString method
    public String toString() {
        return "Student name: " + studentName +
                "\nStudent id: " + studentID +
                "\nEnrolled: " + isEnrolled;
    }
}
