package animals;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Cat implements Animal{
	
	public Cat() {

	}

	public void voice() {
		System.out.println("meow");
	}

}
