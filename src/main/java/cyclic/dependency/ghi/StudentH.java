package cyclic.dependency.ghi;

public class StudentH {

	@SuppressWarnings("unused")
	private StudentI studentI;

	public void setStudentI(StudentI studentI) {
		this.studentI = studentI;
	}

	public StudentH() {
	}

	public StudentH(StudentI studentI) {
		this.studentI = studentI;
	}

}