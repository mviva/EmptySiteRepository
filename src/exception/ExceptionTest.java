package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class SuperExeptionTest {

	/**
	 * 呼び出し先のメソッド。メソッド内で検査例外をスローする場合は、
	 * try/catch節で囲むか、メソッドで例外をスローする。
	 * 検査例外は、非検査例外以外の例外のこと。非検査例外はuncheckedExceptionMethod()を参考。
	 * @throws IOException
	 */
	public void method() throws IOException {
		throw new IOException();
	}

	/**
	 * 非検査例外(RuntimeExceptionの子クラス、Errorの子クラス)はメソッドで例外をスローしなくてもよい
	 */
	public void uncheckedExceptionMethod() {
		/*
		 * JVMの通常の処理でスローすることができる各種の例外。
		 * IndexOutOfBoundsException, NullPointerExceptionなど
		 */
		throw new RuntimeException();
		/*
		 * 通常のアプリケーションであればキャッチすべきではない重大な問題。
		 * StackOverFlowError, NoClassDefFoundExceptionなど
		 */
//		throw new Error();
	}

	/**
	 * 呼び出し先のメソッドがスローする例外を処理しなければコンパイルエラー
	 */
	public void superMethodA() {
//		method();
	}

	/**
	 * 呼び出し先のメソッドがスローする例外と、同一の例外をスローするのはOK
	 * @throws IOException
	 */
	public void superMethodB() throws IOException {
		method();
	}

	/**
	 * 呼び出し先のメソッドがスローする例外よりも上位クラスの例外をスローするのもOK
	 * @throws Exception
	 */
	public void superMethodC() throws Exception {
		method();
	}

	/**
	 * 呼び出し先のメソッドがスローする例外よりも下位クラスの例外をスローするのはNG
	 * @throws FileNotFoundException
	 */
	public void superMethodD() throws FileNotFoundException {
//		method();
	}

	/**
	 * try/catch節で例外を処理すれば、例外をスローしなくてOK
	 */
	public void superMethodE() {
		try {
			method();
		} catch (IOException e) {
		}
	}
}

class SubExceptionTest extends SuperExeptionTest {

	/**
	 * オーバーライドしたメソッドが例外をスローしていないのに、
	 * 子クラスで例外をスローしようとするとコンパイルエラー
	 */
//	@Override public void superMethodA() throws IOException{
//	}

	/**
	 * オーバーライドしたメソッドが例外をスローするが、
	 * 子クラスは例外をスローしなくてもOK
	 */
	@Override public void superMethodB() {
	}

	/**
	 * オーバーライドしたメソッドよりも下位の例外をスローするのはOK
	 */
	@Override public void superMethodC() throws FileNotFoundException {
	}

	/**
	 * オーバーライドしたメソッドと同じ例外をスローするのはもちろんOK
	 */
	@Override public void superMethodD() throws FileNotFoundException {
	}
}
