
public class Test {

	public static void main(String[] args) {
		int i = 0;
		int j = 10;
		int k = 0;
		if((i++ == 0) & (j-- == 10)) {
			System.out.println("1st : k = " + k++);
		}
		if((i == 1) || (++k == 1)) {
			System.out.println("2nd : k = " + k++);
		}
		System.out.println("end : k = " + k++);
	}
}
