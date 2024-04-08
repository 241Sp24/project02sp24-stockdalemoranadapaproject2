package studentdriver;

import java.util.*;
import java.io.*;

public class StudentDriver {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // Opening the input file
        File inputFile = new File("input.csv");
        Scanner fileInput = new Scanner(inputFile);
    //ArrayList to hold all objects
    ArrayList<StudentFees> stuList = new ArrayList<>();

    System.out.println("Enter the no of UG students: ");   
    int num_of_UG_students = input.nextInt();

    System.out.println("Enter the no of Graduate students: ");   
    int num_of_grad_students = input.nextInt();

    System.out.println("Enter the no of online students: ");   
    int num_of_online_students = input.nextInt();

    StudentFees[] students = new StudentFees[12]; //create array for everything

   /*
    File source_file = new File("input.csv");
    while(fileInput.hasNext())
    {

String[] row = line.split(",");

    
    }
    fileInput.close();
    */  


    //Loop to print out all student details       
    for(StudentFees s: stuList){
        if(s instanceof UGStudent){
            System.out.println("**********Undergraduate Students list***********"); 
        }
        else if(s instanceof GraduateStudent){
            System.out.println("**********Graduate Students list**********");  
        }
        else{
            System.out.println("**********Online Students list**********");  
        }
    }
    
    //Loop to calculate student details
    for(StudentFees f: stuList){
        if(f instanceof UGStudent){
            System.out.println("**********Undergraduate Students details***********"); 
            System.out.println("Average Students fee: " + ((UGStudent) f).getPayableAmount());
            System.out.println("Scholarship count: " + ((UGStudent) f).getScholarshipAmount());
            System.out.println("Total number of courses: " + ((UGStudent) f).getCoursesEnrolled());
        }
        else if(f instanceof GraduateStudent){
            System.out.println("**********Graduate Students details**********");
            System.out.println("Average Students fee: " + ((GraduateStudent) f).getPayableAmount());
            System.out.println("Graduate Assitantship count: ");
            System.out.println("Total number of courses: " + ((GraduateStudent) f).getCoursesEnrolled());
        }
        else{
            System.out.println("**********Online Students details**********");
            System.out.println("Average Students fee: " + ((OnlineStudent) f).getPayableAmount());
        }
    }
    }
}
