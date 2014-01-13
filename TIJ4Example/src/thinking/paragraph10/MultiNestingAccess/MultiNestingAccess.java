package thinking.paragraph10.MultiNestingAccess;

//: innerclasses/MultiNestingAccess.java
// Nested classes can access all members of all levels of the classes they are nested within.

class MNA {
	private void f() {
	}

	class A {
		private void g() {
		}

		public class B {
			void h() {
				g();
				f();
			}
		}
	}
}

public class MultiNestingAccess {
	public MultiNestingAccess() {
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnaab = mnaa.new B();
		mnaab.h();
	}
} ///:~
