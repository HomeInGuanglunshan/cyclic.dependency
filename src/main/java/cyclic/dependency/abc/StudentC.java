package cyclic.dependency.abc;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

//@Service
//@Scope("prototype")
//@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class StudentC {

	private StudentA studentA;

	@Autowired
	public void setStudentA(StudentA studentA) {
		this.studentA = studentA;
	}

	public StudentC() {
	}

//	@Autowired
	public StudentC(StudentA studentA) {
		this.studentA = studentA;
	}

	@PostConstruct
	public void sayHello() {
		System.out.println("hello, " + studentA);
	}

}