/**
 * 
 */
package student.edu;

/**
 * 
 */
public class Student {
    private int id;
    private String name;
    private double grade;

	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	// Parameterized constructor
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
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
    @Override
    public String toString() {
         return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";

    }
//The bottom down is commented out for now
    /*// Main method for demonstration

	/**
	 * @param args
	 */
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//} 

//}
