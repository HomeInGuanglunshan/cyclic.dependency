package cyclic.dependency.ghi;

import org.springframework.context.annotation.Bean;

//@Configuration
public class GhiConfig {

	@Bean
	public StudentG getG() {
		StudentG g = new StudentG();
		g.setStudentH(getH());
		return g;
	}

	@Bean
	public StudentH getH() {
		StudentH h = new StudentH();
		h.setStudentI(getI());
		return h;
	}

	@Bean
	public StudentI getI() {
		StudentI i = new StudentI();
		i.setStudentG(getG());
		return i;
	}

}
