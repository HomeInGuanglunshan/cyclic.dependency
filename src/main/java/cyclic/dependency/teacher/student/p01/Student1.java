package cyclic.dependency.teacher.student.p01;

import org.springframework.beans.factory.annotation.Autowired;

//@Service
public class Student1 {
	@Autowired
	private Teacher1 teacher;

	public Student1(Teacher1 teacher) {
		System.out.println("Student init1:" + teacher);
	}

	public void learn() {
		System.out.println("Student learn");
	}
}