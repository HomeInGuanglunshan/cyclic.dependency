package cyclic.dependency.teacher.student.p02;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Teacher2 {
	@Autowired
	private Student2 student;

	public Teacher2() {
		System.out.println("Teacher init1:" + student);

	}

	@PostConstruct
	public void teach() {
		System.out.println("teach:");
		student.learn();
	}

}