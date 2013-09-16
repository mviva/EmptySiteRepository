package builder;

import static builder.NormalEntity.Sex.MALE;
import static builder.NormalEntity.Sex.FEMALE;

public class NormalEntityTest {

	/**
	 * 通常のエンティティクラスのインスタンス生成
	 */
	public static void main(String[] args) {
		// 必須パラメータのみをセットしたインスタンス
		NormalEntity entity1 = new NormalEntity("田中", "太郎", MALE);

		// 一部のオプションに値をセットしたインスタンス(セッター使用)
		NormalEntity entity2 = new NormalEntity("山田", "花子", FEMALE);
		entity2.setAge(30);
		entity2.setTel("090-XXXX-XXXX");
		// 一部のオプションに値をセットしたインスタンス(コンストラクタ使用)
		@SuppressWarnings("unused")
		NormalEntity entity2b = new NormalEntity("山田", "花子", FEMALE,
				30, "", "090-XXXX-XXXX", "");

		// 全てのオプションに値をセットしたインスタンス
		NormalEntity entity3 = new NormalEntity("鈴木", "次郎", MALE);
		entity3.setAge(40);
		entity3.setAddress("東京都千代田区千代田1-1");
		entity3.setTel("090-YYYY-YYYY");
		entity3.setMail("suzuki@sample.com");
		@SuppressWarnings("unused")
		NormalEntity entity3b = new NormalEntity("鈴木", "次郎", MALE,
				40, "東京都千代田区千代田1-1", "090-YYYY-YYYY", "suzuki@sample.com");

		System.out.println(entity1.toString());
		System.out.println(entity2.toString());
		System.out.println(entity3.toString());
	}

}
