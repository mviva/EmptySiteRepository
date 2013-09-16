import java.util.Date;


public class StringBuilderTest {

	public static void main(String args[]) {
		string();
		stringBuilder();
	}

	public static void string() {
		Date date = new Date();
		String a = "h";
		for(int i = 0; i < 100000; i++) {
			a += "w";
			if(i % 1000 == 0) {
				a = "";
			}
		}
		Date date2 = new Date();
		System.out.println("s = " + (date2.getTime() - date.getTime()));
	}


	public static void stringBuilder() {
		Date date = new Date();
		StringBuilder sb = new StringBuilder("h");
		for(int i = 0; i < 100000; i++) {
			sb.append("w");
			if(i % 1000 == 0) {
				sb = new StringBuilder("h");
			}
		}
		Date date2 = new Date();
		System.out.println("SB = " + (date2.getTime() - date.getTime()));

		StringBuilder sb2 = new StringBuilder();
		sb2
			.append("<HTML>")
			.append("<HEAD>")
			.append("<TITLE>")
			.append("title");
	}



}
