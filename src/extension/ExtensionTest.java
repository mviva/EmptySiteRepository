package extension;

/** インターフェースのメソッドは全てpublic abstractとして処理される */
interface InterfaceA {
	void display();
}

/** interfaceAと等価 */
abstract interface InterfaceB {
	abstract void display();
}

/** 抽象クラスはインターフェース/抽象クラスのメソッドを実装する必要がない */
abstract class AbstractClass implements InterfaceA{
}

/** 具象クラスはインターフェース/抽象クラスのメソッドを実装する必要がある */
class ConcreteClass extends AbstractClass {
	@Override public void display() { }
}

/** 親クラス */
class SuperClass {
	public void display() { System.out.println("SuperClass"); }
}

/** 子クラスA */
class SubClassA extends SuperClass {
}

/** display()をオーバーライドする子クラスB */
class SubClassB extends SuperClass {
	@Override public void display() { System.out.println("SubClassB"); }
}

public class ExtensionTest {
	public static void main(String args[]) {
		SuperClass sc = new SuperClass();
		SuperClass sc_sbA = new SubClassA();
		SuperClass sc_sbB = new SubClassB();
		SubClassA sbA = new SubClassA();
//      SubClassA sbA_sc = (SubClassA) new SuperClass();                // 実行時エラー：ClassCastException
//      SubClassA sbA_sbB = (SubClassA)((SuperClass)new SubClassB());   // 実行時エラー：ClassCastException
		SubClassB sbB = new SubClassB();
//      SubClassB sbB_sc = (SubClassB) new SuperClass();                // 実行時エラー：ClassCastException
//      SubClassB sbB_sbA = (SubClassB)((SuperClass) new SubClassA());  // 実行時エラー：ClassCastException

		sc.display();		// 表示：SuperClass
		sc_sbA.display();	// 表示：SuperClass
		sc_sbB.display();	// 表示：SubClassB  display()をオーバーライドしているため
		sbA.display();		// 表示：SuperClass
//      sbA_sc.display();
//      sbA_sbB.display();
		sbB.display();		// 表示：SubClassB
//      sbB_sc.display();
//      sbB_sbA.display();

		sc = sbA;
		sc.display();		// 表示：SuperClass
		sc = sbB;
		sc.display();		// 表示：SubClassB
	}
}
