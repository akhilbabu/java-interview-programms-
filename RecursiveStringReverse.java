public class RecursiveStringReverse
{

	public static void main(String[] args)
	{

		System.out.println(recursive("aba"));
	}

	static String recursive(String value)
	{
		String result = "";

		if (value.length() >= 1)
			result = result + value.substring(value.length() - 1) + recursive(value.substring(0, value.length() - 1));
		return result;

	}

}