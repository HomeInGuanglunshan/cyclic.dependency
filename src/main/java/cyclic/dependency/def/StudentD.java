package cyclic.dependency.def;

public class StudentD {

	@SuppressWarnings("unused")
	private StudentE studentE;

	public void setStudentE(StudentE studentE) {
		this.studentE = studentE;
	}

	public StudentD() {
	}

	public StudentD(StudentE studentE) {
		this.studentE = studentE;
	}

}