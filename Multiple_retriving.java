package practice;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

public class Multiple_retriving 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream f1 = new FileInputStream("E:\\f drive\\Practice\\Insert.txt");
		
		FileInputStream f2 = new FileInputStream("E:\\f drive\\Practice\\Add.txt");
		
		SequenceInputStream f3  = new SequenceInputStream(f1,f2);
		
		int res = 0;
		
		while((res = f3.read()) != -1)
		{
			System.out.println(res);
			System.out.println((char)res);	
			System.out.println();
		}
	}
}
