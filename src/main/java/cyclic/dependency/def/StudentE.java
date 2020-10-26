package cyclic.dependency.def;

public class StudentE {

	@SuppressWarnings("unused")
	private StudentF studentF;

	public void setStudentF(StudentF studentF) {
		this.studentF = studentF;
	}

	public StudentE() {
	}

	public StudentE(StudentF studentF) {
		this.studentF = studentF;
	}

}