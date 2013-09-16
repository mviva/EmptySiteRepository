package singleton;

/**
 * 従来のSingletonパターン
 */
public class Singleton {

	/**
	 * Singletonインスタンス
	 */
	private static Singleton instance = new Singleton();

	/**
	 * フィールド
	 */
	private int num;

	/**
	 * privateコンストラクタ
	 */
	private Singleton() {
	}

	/**
	 * インスタンス取得メソッド
	 * @return Singletonインスタンス
	 */
	public static Singleton getInstance() {
		return instance;
	}

	/**
	 * フィールドのgetter
	 * @return フィールド
	 */
	public int getNum() {
		return num;
	}

	/**
	 * フィールドのsetter
	 * @param num フィールド
	 */
	public void setNum(int num) {
		this.num = num;
	}
}
