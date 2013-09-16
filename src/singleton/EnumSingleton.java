package singleton;

/**
 * enum型使用によるSingleton
 */
public enum EnumSingleton {

	/**
	 * Singletonインスタンス
	 */
	instance;

	/**
	 * フィールド
	 */
	private int num;

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
