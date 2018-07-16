import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *The email id's are expected to separted with a space 
 * @author akhil.babu
 * @since 10-Jul-2018
 * @version 1.0
 */
public class Email
{

	public static void main(String[] args) throws IOException
	{

		BufferedReader br = Files.newBufferedReader(Paths.get("D:\\mytext.txt"));
		String line;
		while ((line = br.readLine()) != null)
		{
			Arrays.stream(line.split(" ")).filter(p2 -> Pattern.compile("([\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Za-z]{2,4})").matcher(p2).find()).collect(Collectors.toList()).forEach(System.out::println);
		}
	}
}
