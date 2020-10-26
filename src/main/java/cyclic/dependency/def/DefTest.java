package cyclic.dependency.def;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
//			context = new ClassPathXmlApplicationContext("def/def1.xml");
//			context = new ClassPathXmlApplicationContext("def/def2.xml");
			context = new ClassPathXmlApplicationContext("def/def3.xml");

			System.out.println(context.getBean("d"));
			System.out.println(context.getBean("e"));
			System.out.println(context.getBean("f"));
		} finally {
			if (context != null) {
				context.close();
			}
		}
	}

}
