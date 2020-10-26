package cyclic.dependency.ghi;

public class StudentI {

	@SuppressWarnings("unused")
	private StudentG studentG;

	public void setStudentG(StudentG studentG) {
		this.studentG = studentG;
	}

	public StudentI() {
	}

	public StudentI(StudentG studentG) {
		this.studentG = studentG;
	}

}