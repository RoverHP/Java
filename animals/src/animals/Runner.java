
package animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Runner {
	
	@Autowired
	Animal animal;

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext (Animal.class);
		
		System.out.println(context.getBean(Animal.class));
		//System.out.println(context.getBean(Test.class));

    }

}
