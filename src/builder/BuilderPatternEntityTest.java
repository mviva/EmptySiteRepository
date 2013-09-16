package builder;

import static builder.BuilderPatternEntity.Sex.MALE;
import static builder.BuilderPatternEntity.Sex.FEMALE;

public class BuilderPatternEntityTest {

	/**
	 * ビルダーパターンを実装したクラスのインスタンス生成
	 */
	public static void main(String[] args) {
		// 必須パラメータのみをセットしたインスタンス
		BuilderPatternEntity entity1 = new BuilderPatternEntity
				.Builder("田中", "太郎", MALE)
					.build();

		// 一部のオプションに値をセットしたインスタンス
		BuilderPatternEntity entity2 = new BuilderPatternEntity
				.Builder("山田", "花子", FEMALE)
					.age(30)
					.tel("090-XXXX-XXXX")
					.build();

		// 全てのオプションに値をセットしたインスタンス
		BuilderPatternEntity entity3 = new BuilderPatternEntity
				.Builder("鈴木", "次郎", MALE)
					.age(40)
					.address("東京都千代田区千代田1-1")
					.tel("090-YYYY-YYYY")
					.mail("suzuki@sample.com")
					.build();

		System.out.println(entity1.toString());
		System.out.println(entity2.toString());
		System.out.println(entity3.toString());
	}

}
