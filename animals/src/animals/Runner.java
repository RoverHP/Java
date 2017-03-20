
package animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan(basePackages = "animals")
@Scope("prototype")
//@Scope("singleton")
@Configuration
public class Runner {
	
	@Autowired
	@Qualifier("cat")
	Animal animal;

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext (Runner.class);
		
		System.out.println(context.getBean(Runner.class));

		context.getBean(Runner.class).animal.voice();
		
		System.out.println(context.getBean(Runner.class) == context.getBean(Runner.class));

    }

}
