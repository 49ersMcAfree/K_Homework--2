 /**
 * 
 */
package student.edu;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * 
 */
public class StudentManager {

	
	private Student[] students = new Student[10];
	private int numberofStudents;
	/**
	 * 
	 */
	public StudentManager() {
		// TODO Auto-generated constructor stub

	}
	
	public boolean readFromFile(String fileName) {
		try {
			Scanner fileIn = new Scanner(new FileInputStream("studentData.txt"));
			
			int i=0;
			numberofStudents = 0;
			
			
			// Read the Data line by line
			while(fileIn.hasNext()) {
				
				
				int S_id = fileIn.nextInt();
			
				String S_name = fileIn.next();
				
				String S_name2 = fileIn.next();
				
				double S_grade = fileIn.nextDouble();
				
				//System.out.println("");
				students[i] = new Student(S_id, S_name, S_name2, S_grade);
				//System.out.println(S_id+"\t"+S_name+"\t"+S_name2+"\t"+S_grade);
				i++;
				numberofStudents = i;

			}
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void displayStudents() {
		// Display the students
		if (numberofStudents == 0) {
			System.out.println("No students to display");
		} else {
			for (int i = 0; i < numberofStudents; i++) {
				System.out.println(students[i].toString());
			}
		}
	}

	public boolean searchStudentById(int id) {
		// Search for a student by ID
		for (int i = 0; i < numberofStudents; i++) {
			if ((students[i].equals(id))) {
				System.out.println("Student found: " + students[i].toString());
				return true;
			}
		}
		return false;
	}

	public class Student {
	    private int id;
	    private String name;
	    private double grade;
		

		
		public Student() {
			// TODO Auto-generated constructor stub
		}
		// Parameterized constructor
	    public Student(int s_id, String name, String name2, double s_grade) {
	        this.id = s_id;
	        this.name = (name +" "+ name2);
	        this.grade = s_grade;
	    }

	    // Getter and Setter 
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
		
	    }

	    public void setName(String name) {
	        this.name = name;
	       
	    }
	    public double getGrade() {
	        return grade;
	    }
	    public void setGrade(double grade) {
	        this.grade = grade;
	    }

	    // toString method to display student information
	    public String toString() {
	    	
	    
	         return "Student [id=" + getId() + ", name=" + getName() + ", grade=" + getGrade()+ "]";

	    }
	}
	 public boolean updateStudentGradeById(int id, double grade) {
 		if (students == null || students.length == 0) {
   			return false;
      		}
		for (Student student : students) {
  			if (student.getId() == id) {
				student.setGrade(grade);
     				System.out.println("Student grade updated: " + student);
				return true;
   			}
     		}
		System.out.println("Student with ID " + id + " not found, grade not updated.");	
	 	return false;
	}
	 
	
	

}




