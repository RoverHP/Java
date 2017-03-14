package rhombus;

public interface InterfaceA {

	default void sayWord(String word){
		System.out.println("A says:" + word);
	}
}
