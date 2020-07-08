package practice;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;

public class Retriving
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream f1 = new FileInputStream("E:\\f drive\\Practice\\Insert.txt");
		
		int res = f1.read();
		
		System.out.println(res); 
		
		System.out.println((char)res);
		
		FileInputStream f2 = new FileInputStream("E:\\f drive\\Practice\\Add.txt");
		int res1 = 0;
		
		while((res1 = f2.read()) != -1)
		{
			System.out.println(res1);
			
			System.out.println((char)res1);
			System.out.println();
		}
	}
}
