import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	
	
	
	public static void main(String[] args)
	{
		
		System.out.println();
		System.out.println(recursive("AKHIL"));
	}
	
	static String recursive(String value)
	{
		String result="";
		
		if(value.length()>=1)
		result=result+value.substring(value.length()-1)+recursive(value.substring(0,value.length()-1));
		return result;
		
		
	}
	
	
	
	
}