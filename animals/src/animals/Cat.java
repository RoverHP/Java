package animals;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "cat")
//@Primary
public class Cat extends Animal{

	public Cat() {

	}

	@Override
	public void voice() {
		System.out.println("meow");
	}

}
