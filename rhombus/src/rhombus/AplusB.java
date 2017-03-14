package rhombus;

public class AplusB implements InterfaceA, InterfaceB {
	
	@Override
	public void sayWord(String word) { 
		InterfaceA.super.sayWord(word);
		InterfaceB.super.sayWord(word);
	}

}
