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
public class studentmanager {

	/**
	 * 
	 */
	public studentmanager() {
		// TODO Auto-generated constructor stub
	

	}
	
	public boolean readFromFile(String fileName) {
		try {
			Scanner fileIn = new Scanner(new FileInputStream("studentData.txt"));
			Student[] students = new Student;
			int i=0;
			// Read the data separated by whitespaces and new lines
//			while(fileIn.hasNext()) {
//				System.out.println("String token: " + fileIn.next());
//			}
			
			// Read the Data line by line
			while(fileIn.hasNextLine()) {

//				System.out.println("Line: " + fileIn.nextLine());
				S_id = fileIn.next();
				S_name = fileIn.next();
				S_grade = fileIn.next();
				Student student[i] = new Student(S_id, S_name, S_grade);
				i++;
				//System.out.println("Name: " + name + ", Age: " + age);	
			}
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
