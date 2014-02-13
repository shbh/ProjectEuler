package project.euler.util;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*************************************************************************
 * Compilation: javac Permutations.java Execution: java Permutations N
 * 
 * Enumerates all permutations on N elements. Two different approaches are
 * included.
 * 
 * % java Permutations 3 abc acb bac bca cab cba
 * 
 *************************************************************************/

public class Permutations {

	// print N! permutation of the characters of the string s (in order)
	public static void perm1(String string, Set<String> content) {
		perm1("", content, string);
	}

	private final static void perm1(String prefix, Set<String> content, String string) {
		int nLength = string.length();
		if (nLength  == 0) {
			content.add(prefix);
		}

		else {
			for (int i = 0; i < nLength; i++)
				perm1(prefix + string.charAt(i), content,
						string.substring(0, i) + string.substring(i + 1, nLength ));
		}

	}

	// print N! permutation of the elements of array a (not in order)
	public static void perm2(String string) {
		int nLength  = string.length();
		char[] a = new char[nLength ];
		for (int i = 0; i < nLength ; i++)
			a[i] = string.charAt(i);
		perm2(a, nLength );
	}

	private final static void perm2(char[] aChar, int number) {
		if (number == 1) {
			
			return;
		}
		for (int i = 0; i < number; i++) {
			swap(aChar, i, number - 1);
			perm2(aChar, number - 1);
			swap(aChar, i, number - 1);
		}
	}

	// swap the characters at indices i and j
	private final static void swap(char[] aChar, final int increment,final int joker) {
		char character;
		character = aChar[increment];
		aChar[increment] = aChar[joker];
		aChar[joker] = character;
	}

	public static SortedSet<String> generateCombination(final String alphabet) {

		return generateCombination(alphabet, alphabet.length());
		// perm2(elements);
	}

	public static SortedSet<String> generateCombination(final String alphabet,final int nLength) {

		SortedSet<String> strings = new TreeSet<String>(
				new Comparator<String>() {
					public int compare(String a, String b) {
						return Long.valueOf(b).compareTo(Long.valueOf(a));
					}
				});
		String elements = alphabet.substring(0, nLength);
		perm1(elements, strings);
		// System.out.println();
		return strings;
		// perm2(elements);
	}

	public static SortedSet<String> generateWithoutSort(String alphabet, int nLength) {

		SortedSet<String> strings = new TreeSet<String>();
		String elements = alphabet.substring(0, nLength);
		perm1(elements, strings);
		// System.out.println();
		return strings;
		// perm2(elements);
	}

	public static SortedSet<String> generateWithoutSort(String alphabet) {

		SortedSet<String> strings = new TreeSet<String>();
		String elements = alphabet.substring(0, alphabet.length());
		perm1(elements, strings);
		// System.out.println();
		return strings;
		// perm2(elements);
	}

}
