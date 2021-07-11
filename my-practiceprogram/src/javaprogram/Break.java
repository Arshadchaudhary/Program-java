package javaprogram;

class Break {
	public static void main(String[] args) {
		String s = "hello , how are you";
		String s1 = "";
		for (int j = 0; s.length() - 1 >= 0; j--) {
			s1 = s1 + s.charAt(j);
			System.out.println(s1);
		}

	}
}
