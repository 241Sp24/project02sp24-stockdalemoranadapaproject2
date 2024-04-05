package studentdriver;

import java.util.*;
import java.io.*;

public class StudentDriver {
    public static void main(String[] args) throws Exception {

Scanner input = new Scanner(System.in);

System.out.println("Enter the no of UG students: ");   
int num_of_UG_students = input.nextLine();

System.out.println("Enter the no of Graduate students: ");   
int num_of_grad_students = input.nextLine();

System.out.println("Enter the no of online students: ");   
int num_of_online_students = input.nextLine();

StudentFees[] students = new StudentFees[12]; //create array for everything


System.out.println("**********Undergraduate students list**********");   

//list out undergraduate student infomation

System.out.println("**********Graduate students list**********"); 

//list out graduate student infomation   

System.out.println("**********Online students list**********");   

//list out online student infomation        
for(StudentFees s: stuList){
    if(s instanceof UGStudent){
        System.out.println("**********Undergraduate Students details***********"); 
    }
    else if(s instanceof GraduateStudent){
        System.out.println("**********Graduate Students details**********");  
    }
    else{
        System.out.println("**********Online Students details**********");  
    }
}      
    
    }
}
