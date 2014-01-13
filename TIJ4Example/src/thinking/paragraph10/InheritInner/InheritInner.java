package thinking.paragraph10.InheritInner;

//: innerclasses/InheritInner.java
// Inheriting an inner class.
class WithInner {
	class Inner {
	}
}

public class InheritInner extends WithInner.Inner {
	// ! InheritInner() {} // Won't compile
	public InheritInner(WithInner wi) {
		wi.super();
	}
} ///:~
