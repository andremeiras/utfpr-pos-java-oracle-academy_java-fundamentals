package studyTool;

public class Student {

	// Declaração das variáveis
	private int studentId;
	private String name;
	private String ssn;
	private double gpa;
	public final int SCHCODE = 34958;

	public Student() { // Construtor
	} // fim construtor

	public Student(int studentId, String name, String ssn, double gpa) {
	}

	public int getStudentId() { // método acessor
		return studentId;
	} // fim do método getStudentId

	public void setStudentId(int x) { // método modificador de acesso
		this.studentId = x;
	} // fim do método setStudentId

	public String getStudentName() {
		return name;
	}

	public void setStudentName(String n) {
		this.name = n;
	}

	public String getStudentSSN() {
		return ssn;
	}

	public void setSSN(String s) {
		this.ssn = s;
	}

	public double getStudentGPA() {
		return gpa;
	}

	public void setGPA(double g) {
		this.gpa = g;
	}

	public String toString() {
		String s1 = "";

		s1 = 	"Student Id: " + getStudentId() + "\n" + 
				"Student Name: " + getStudentName() + "\n" + 
				"Student SSN: " + getStudentSSN() + "\n" + 
				"Student GPA: " + getStudentGPA();

		return s1;
	}

} // fim da classe Student
