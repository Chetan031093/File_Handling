package practice;
import java.io.File;

public class Deleting 
{
	public static void main(String[] args) 
	{
		File f1 = new File("E:\\f drive\\Prroo");
		
		if(f1.exists())
		{
			f1.delete();
			System.out.println("folder deleted successfully");
		}
		else
		{
			System.out.println("folder does not exist");
		}
	}
}
