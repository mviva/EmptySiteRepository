package builder;

/**
 * ビルダーパターンを実装するクラス
 */
public class BuilderPatternEntity {

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
	private final int age;
	/** 住所 */
	private final String address;
	/** 電話番号 */
	private final String tel;
	/** メールアドレス */
	private final String mail;

	/**
	 * ビルダーパターン
	 */
	public static class Builder {
		// 必須パラメータ
		private final String firstName;
		private final String lastName;
		private final Sex sex;

		// オプションパラメータ
		private int age = -1;
		private String address = "";
		private String tel = "";
		private String mail = "";

		/**
		 * 必須パラメータの値をセットするコンストラクタ
		 * @param firstName 姓
		 * @param lastName 名
		 * @param sex 性別
		 */
		public Builder(String firstName, String lastName, Sex sex) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.sex = sex;
		}

		/**
		 * 年齢のセッター
		 * @param age 年齢
		 * @return 年齢をセットしたビルダー
		 */
		public Builder age(int age) {
			this.age = age;
			return this;
		}

		/**
		 * 住所のセッター
		 * @param address 住所
		 * @return 住所をセットしたビルダー
		 */
		public Builder address(String address) {
			this.address = address;
			return this;
		}

		/**
		 * 電話番号のセッター
		 * @param tel 電話番号
		 * @return 電話番号をセットしたビルダー
		 */
		public Builder tel(String tel) {
			this.tel = tel;
			return this;
		}

		/**
		 * メールアドレスのセッター
		 * @param mail メールアドレス
		 * @return メールアドレスをセットしたビルダー
		 */
		public Builder mail(String mail) {
			this.mail = mail;
			return this;
		}

		/**
		 * {@link BuilderPatternEntity}オブジェクトをビルドして返すメソッド
		 * @return 全フィールドに値のセットされた{@link BuilderPatternEntity}オブジェクト
		 */
		public BuilderPatternEntity build() {
			return new BuilderPatternEntity(this);
		}
	}

	/**
	 * ビルダーを使用したコンストラクタ
	 * @param builder ビルダー
	 */
	public BuilderPatternEntity(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.sex = builder.sex;
		this.age = builder.age;
		this.address = builder.address;
		this.tel = builder.tel;
		this.mail = builder.mail;
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
