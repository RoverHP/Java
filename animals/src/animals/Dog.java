package animals;

import org.springframework.stereotype.Component;

@Component(value = "dog")
public class Dog extends Animal {

	public Dog() {
	}

	@Override
	public void voice() {
		System.out.println("woof");
	}

}
