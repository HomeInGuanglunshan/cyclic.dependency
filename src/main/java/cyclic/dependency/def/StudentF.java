package cyclic.dependency.def;

public class StudentF {

	@SuppressWarnings("unused")
	private StudentD studentD;

	public void setStudentD(StudentD studentD) {
		this.studentD = studentD;
	}

	public StudentF() {
	}

	public StudentF(StudentD studentD) {
		this.studentD = studentD;
	}

}