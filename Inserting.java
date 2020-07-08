package practice;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.UncheckedIOException;

public class Inserting 
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream f1 = new FileOutputStream("E:\\f drive\\Practice\\Insert.txt");
		
		f1.write('A');
		System.out.println("char. inserted successfully");
		
		System.out.println();
		FileOutputStream f2 = new FileOutputStream("E:\\f drive\\Practice\\Add.txt");
		
		String s = "AB CD";
		byte b[] = s.getBytes();
		
		f2.write(b);
		System.out.println("multiple char added successfully");
	}
	
}
