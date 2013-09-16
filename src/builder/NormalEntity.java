package builder;

/**
 * 通常のエンティティクラス
 */
public class NormalEntity {

	/** 性別を表す列挙型 */
	public enum Sex {
		/** 男 */
		MALE("男"),
		/** 女 */
		FEMALE("女");

		/** 性別(日本語) */
		private final String jSex;
		private Sex(String jSex) {this.jSex = jSex;}
		public String getName() {return jSex;}
	};

	/** 姓 */
	private final String firstName;
	/** 名 */
	private final String lastName;
	/** 性別 */
	private final Sex sex;
	/** 年齢 */
	private int age = -1;
	/** 住所 */
	private String address = "";
	/** 電話番号 */
	private String tel = "";
	/** メールアドレス */
	private String mail = "";

	/**
	 * 必須パラメータの値をセットするコンストラクタ
	 * @param firstName 姓
	 * @param lastName 名
	 * @param sex 性別
	 */
	public NormalEntity(String firstName, String lastName, Sex sex) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
	}

	/**
	 * 全パラメータの値をセットするコンストラクタ
	 * @param firstName 姓
	 * @param lastName 名
	 * @param sex 性別
	 * @param age 年齢
	 * @param address 住所
	 * @param tel 電話番号
	 * @param mail メールアドレス
	 */
	public NormalEntity(String firstName, String lastName, Sex sex, int age, String address, String tel, String mail) {
		this(firstName, lastName, sex);
		this.age = age;
		this.address = address;
		this.tel = tel;
		this.mail = mail;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override public String toString() {
		String sp = System.lineSeparator();
		StringBuilder sb = new StringBuilder();
		sb.append("姓:" + firstName + sp);
		sb.append("名:" + lastName + sp);
		sb.append("性別:" + sex.getName() + sp);
		sb.append("年齢:" + age + sp);
		sb.append("住所:" + address + sp);
		sb.append("電話番号:" + tel + sp);
		sb.append("メールアドレス:" + mail + sp);
		return sb.toString();
	}
}