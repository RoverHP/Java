package animals;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	public Dog() {
	}

	public void voice() {
		System.out.println("woof");
	}

}
