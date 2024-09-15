
package assignment6;

import java.util.Scanner;
import java.util.Date;

public class Processor {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student by ID");
            System.out.println("3. Delete a student by ID");
            System.out.println("4. Display all students");
            System.out.println("5. Find the student with the highest GPA");
           
            
            int choice = scanner.nextInt();
            scanner.nextLine();              
            switch (choice) {
                case 1:
                 
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter full name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter date of birth (dd/mm/yyyy): ");
                    Date dob = new Date(scanner.nextLine());
                    System.out.print("Enter GPA: ");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine();  
                    System.out.print("Enter major: ");
                    String major = scanner.nextLine();
                    studentList.addStudent(new Student(id, name, dob, gpa, major));
                    break;
                
                case 2:
                    break;
                    
                case 3:
                    
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    studentList.deleteStudentById(deleteId);
                    break;
                    
                case 4:
                    
                    studentList.displayAllStudents();
                    break;
                    
                case 5:
                    
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students available.");
                    }
                    break;
                    
                
                    
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}