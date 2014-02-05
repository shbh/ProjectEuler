package euler.learning;

import java.util.Comparator;
import java.util.Iterator;
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
	public static void perm1(String s, Set<String> content) {
		perm1("", content, s);
	}

	private static void perm1(String prefix, Set<String> content, String s) {
		int N = s.length();
		if (N == 0) {
			content.add(prefix);
		}

		else {
			for (int i = 0; i < N; i++)
				perm1(prefix + s.charAt(i), content,
						s.substring(0, i) + s.substring(i + 1, N));
		}

	}

	// print N! permutation of the elements of array a (not in order)
	public static void perm2(String s) {
		int N = s.length();
		char[] a = new char[N];
		for (int i = 0; i < N; i++)
			a[i] = s.charAt(i);
		perm2(a, N);
	}

	private static void perm2(char[] a, int n) {
		if (n == 1) {
			System.out.println(a);
			return;
		}
		for (int i = 0; i < n; i++) {
			swap(a, i, n - 1);
			perm2(a, n - 1);
			swap(a, i, n - 1);
		}
	}

	// swap the characters at indices i and j
	private static void swap(char[] a, int i, int j) {
		char c;
		c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	public static SortedSet<String> generate(String alphabet) {

		return generate(alphabet, alphabet.length());
		// perm2(elements);
	}

	public static SortedSet<String> generate(String alphabet, int N) {

		SortedSet<String> strings =new TreeSet<String>(new Comparator<String>(){
		    public int compare(String a, String b){
		        return Long.valueOf(b).compareTo(Long.valueOf(a));
		    }
		});
		String elements = alphabet.substring(0, N);
		perm1(elements, strings);
		// System.out.println();
		return strings;
		// perm2(elements);
	}
	
	public static SortedSet<String> generateWithoutSort(String alphabet, int N) {

		SortedSet<String> strings =new TreeSet<String>();
		String elements = alphabet.substring(0, N);
		perm1(elements, strings);
		// System.out.println();
		return strings;
		// perm2(elements);
	}

	public static SortedSet<String> generateWithoutSort(String alphabet) {

		SortedSet<String> strings =new TreeSet<String>();
		String elements = alphabet.substring(0, alphabet.length());
		perm1(elements, strings);
		// System.out.println();
		return strings;
		// perm2(elements);
	}

	public static void main(String[] args) {
		// 1193, 3779, 11939, 19937, 193939, 199933
		for (Iterator<String> iterator = generate("199933").iterator(); iterator
				.hasNext();) {
			System.out.println("add("+(String) iterator.next()+");");

		}
	}
}
