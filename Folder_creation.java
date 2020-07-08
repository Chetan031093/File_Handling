package practice;
import java.io.File;

public class Folder_creation 
{
	public static void main(String[] args)
	{
		File f1 = new File("E:\\f drive\\Practice");
		
		if(f1.exists())
		{
			System.out.println("folder is already exist");
		}
		else
		{
			f1.mkdir();
			System.out.println("folder created succrssfully");
		}
	}
}
