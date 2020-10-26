package cyclic.dependency.abc;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

//@Service
//@Scope("prototype")
//@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class StudentA {

	private StudentB studentB;

	@Autowired
	public void setStudentB(StudentB studentB) {
		this.studentB = studentB;
	}

	public StudentA() {
	}

//	@Autowired
	public StudentA(StudentB studentB) {
		this.studentB = studentB;
	}

	@PostConstruct
	public void sayHello() {
		System.out.println("hello, " + studentB);
	}

}