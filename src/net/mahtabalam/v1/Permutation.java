package net.mahtabalam.v1;

public class Permutation {
	public static void main(String[] args) {
		permutations("abc");
	}

	public static void permutations(String str) {
		if (str == null || str.length() == 0) {
			System.out.println("Input string is empty !!");
			return;
		} else {
			permute("", str);
		}
	}

	public static void permute(String prefix, String remaining) {
		if (remaining.length() == 0) {
			System.out.println(prefix);
			return;
		}

		for (int i = 0; i < remaining.length(); i++) {
			String newPrefix = prefix + remaining.charAt(i);
			String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
			permute(newPrefix, newRemaining);
		}
	}
}
