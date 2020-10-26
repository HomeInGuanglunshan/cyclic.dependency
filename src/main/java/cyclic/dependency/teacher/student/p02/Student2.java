package cyclic.dependency.teacher.student.p02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student2 {
	@Autowired
	private Teacher2 teacher;

	public Student2() {
		System.out.println("Student init:" + teacher);
	}

	public void learn() {
		System.out.println("Student learn");
	}
}