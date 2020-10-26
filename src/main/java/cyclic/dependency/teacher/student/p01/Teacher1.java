package cyclic.dependency.teacher.student.p01;

import org.springframework.beans.factory.annotation.Autowired;

//@Service
public class Teacher1 {
	@Autowired
	private Student1 student;

	public Teacher1(Student1 student) {
		System.out.println("Teacher init1:" + student);

	}

	public void teach() {
		System.out.println("teach:");
		student.learn();
	}
}