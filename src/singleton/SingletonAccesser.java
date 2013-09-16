package singleton;

/**
 * Singletonクラスへのアクセサー
 */
public class SingletonAccesser {

	public static void main(String[] args) {
		// Singletonへのアクセス
		Singleton singleton = Singleton.getInstance();
		singleton.setNum(10);

		// enum型使用のSingletonへのアクセス
		EnumSingleton enumSingleton = EnumSingleton.instance;
		enumSingleton.setNum(10);

		System.out.println(singleton.getNum());		// 10
		System.out.println(enumSingleton.getNum());	// 10
	}
}
