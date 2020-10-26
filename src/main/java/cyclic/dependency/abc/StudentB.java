package cyclic.dependency.abc;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

//@Service
//@Scope("prototype")
//@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class StudentB {

	private StudentC studentC;

	@Autowired
	public void setStudentC(StudentC studentC) {
		this.studentC = studentC;
	}

	public StudentB() {
	}

//	@Autowired
	public StudentB(StudentC studentC) {
		this.studentC = studentC;
	}

	@PostConstruct
	public void sayHello() {
		System.out.println("hello, " + studentC);
	}

}