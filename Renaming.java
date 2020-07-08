package practice;
import java.io.File;

public class Renaming 
{
	public static void main(String[] args) 
	{
		File f1 = new File("E:\\f drive\\Practice");
		
		File f2 = new File("E:\\f drive\\Prroo");
		
		if(f1.exists())
		{
			f1.renameTo(f2);
			System.out.println("folder renamed successfully");
		}
		else
		{
			System.out.println("folder already exist");
		}
	}
}
