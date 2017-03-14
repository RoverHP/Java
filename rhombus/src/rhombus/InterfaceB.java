package rhombus;

public interface InterfaceB {

	default void sayWord(String word){
		System.out.println("B says:" + word);
	}
}
