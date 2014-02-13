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

public final class Permutations {

	private static final int ZERO = 0;
	private static final int ONE = 1;
	
	private Permutations() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	// print N! permutation of the characters of the string s (in order)
	public static void perm1(final String string, final Set<String> content) {
		perm1("", content, string);
	}

	private static void perm1(final String prefix,
			final Set<String> content, final String string) {
		final int nLength = string.length();
		if (nLength == ZERO) {
			content.add(prefix);
		}

		else {
			for (int i = 0; i < nLength; i++) {
				perm1(prefix + string.charAt(i),
						content,
						string.substring(0, i)
								+ string.substring(i + 1, nLength));
			}
		}

	}

	// print N! permutation of the elements of array a (not in order)
	public static void perm2(final String string) {
		final int nLength = string.length();
		final char[] aChar = new char[nLength];
		for (int i = 0; i < nLength; i++) {
			aChar[i] = string.charAt(i);
		}
		perm2(aChar, nLength);
	}

	private static void perm2(final char[] aChar, final int number) {
		if (number == ONE) {

			return;
		}
		for (int i = 0; i < number; i++) {
			swap(aChar, i, number - 1);
			perm2(aChar, number - 1);
			swap(aChar, i, number - 1);
		}
	}

	// swap the characters at indices i and j
	private static void swap(final char[] aChar, final int increment,
			final int joker) {
		char character;
		character = aChar[increment];
		aChar[increment] = aChar[joker];
		aChar[joker] = character;
	}

	public static SortedSet<String> generateCombination(final String alphabet) {

		return generateCombination(alphabet, alphabet.length());
		// perm2(elements);
	}

	public static SortedSet<String> generateCombination(final String alphabet,
			final int nLength) {

		final SortedSet<String> strings = new TreeSet<String>(
				new Comparator<String>() {
					public int compare(final String first, final String second) {
						return Long.valueOf(second).compareTo(Long.valueOf(first));
					}
				});
		final String elements = alphabet.substring(0, nLength);
		perm1(elements, strings);
		// System.out.println();
		return strings;
		// perm2(elements);
	}

	public static SortedSet<String> generateWithoutSort(final String alphabet,
			final int nLength) {

		final SortedSet<String> strings = new TreeSet<String>();
		final String elements = alphabet.substring(0, nLength);
		perm1(elements, strings);
		// System.out.println();
		return strings;
		// perm2(elements);
	}

	public static SortedSet<String> generateWithoutSort(final String alphabet) {

		final SortedSet<String> strings = new TreeSet<String>();
		final String elements = alphabet.substring(0, alphabet.length());
		perm1(elements, strings);
		// System.out.println();
		return strings;
		// perm2(elements);
	}

}
