package project.euler;

public class DoubleBasePalindromes {

	public static void main(String[] args) {
		
		System.out.println(getDoubleBasePalindromes(1000000));
	}

	public static String reverse(String characters)
    {
        char[] oldString = characters.toCharArray();
        char[] newString = new char[oldString.length];

        int newindex=0;
        for(int n=oldString.length-1; n>=0;n--)
        {
            newString[newindex]=oldString[n];
            newindex++;
        }
        return new String(newString);
    }
	
	public static Boolean IsPalindrome(String letters) {
		
		return (letters.equals(reverse(letters)));
	}

	public static boolean IsDoubleBasePalindrome(Integer number) {
		String binary = Integer.toBinaryString(number);

		if (IsPalindrome(number.toString()) && IsPalindrome(binary))
			return true;

		return false;
	}

	public static int getDoubleBasePalindromes(int limit) {
		int result = 0;

		for (int i = 1; i < limit; i++)
			if (IsDoubleBasePalindrome(i))
			{
				System.out.println(i);
				result += i;
			}

		return result;
	}
}
