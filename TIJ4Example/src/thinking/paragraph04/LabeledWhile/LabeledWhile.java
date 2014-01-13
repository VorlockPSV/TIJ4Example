//: control/LabeledWhile.java
// While loops with "labeled break" and "labeled continue."
package thinking.paragraph04.LabeledWhile;

public class LabeledWhile {
	public LabeledWhile() {
		// TODO Auto-generated constructor stub
		int i = 0;
		outer: while (true) {
			System.out.println("Outer while loop");
			while (true) {
				i++;
				System.out.println("i=" + i);
				if (i == 1) {
					System.out.println("continue");
					continue;
				}
				if (i == 3) {
					System.out.println("continue outer");
					continue outer;
				}
				if (i == 5) {
					System.out.println("break");
					break;
				}
				if (i == 7) {
					System.out.println("break outer");
					break outer;
				}
			}
		}
	}
} /* Output: 
Outer while loop
i=1
continue
i=2
i=3
continue outer
Outer while loop
i=4
i=5
break
Outer while loop
i=6
i=7
break outer
 */// :~