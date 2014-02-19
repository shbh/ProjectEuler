package project.euler.feature;

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
	
	private Permutations() {
	
		super();
		
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
		else 
		{
		
			for (int i = 0; i < nLength; i++) {
			
				perm1(prefix + string.charAt(i),
						content,
						string.substring(0, i)
								+ string.substring(i + 1, nLength));
			
			}
		}

	}

	

	public static SortedSet<String> generateCombination(final String alphabet) {

		return generateCombination(alphabet, alphabet.length());
	
	}

	private static SortedSet<String> generateCombination(final String alphabet,
			final int nLength) {

		final SortedSet<String> strings = new TreeSet<String>(
				new Comparator<String>() {
	
					public int compare(final String first, final String second) {
						return Long.valueOf(second).compareTo(Long.valueOf(first));
					
					}

				});
		
		final String elements = alphabet.substring(0, nLength);
		
		perm1(elements, strings);

		return strings;
	
	}

	

	

}
