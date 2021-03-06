//: initialization/VarArgs.java
// Using array syntax to create variable argument lists.
package thinking._05_initialization.VarArgs;

class A {
}

public class VarArgs {
	static void printArray(Object[] args) {
		for (Object obj : args) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

	public VarArgs() {
		printArray(new Object[] { new Integer(47), new Float(3.14),
				new Double(11.11) });
		printArray(new Object[] { "one", "two", "three" });
		printArray(new Object[] { new A(), new A(), new A() });
	}
} /* Output
47 3.14 11.11 
one two three 
thinking.paragraph5.VarArgs.A@adb1d4 thinking.paragraph5.VarArgs.A@175d6ab thinking.paragraph5.VarArgs.A@160a26f 
*/
