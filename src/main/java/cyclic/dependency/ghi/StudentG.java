package cyclic.dependency.ghi;

public class StudentG {

	@SuppressWarnings("unused")
	private StudentH studentH;

	public void setStudentH(StudentH studentH) {
		this.studentH = studentH;
	}

	public StudentG() {
	}

	public StudentG(StudentH studentH) {
		this.studentH = studentH;
	}

}