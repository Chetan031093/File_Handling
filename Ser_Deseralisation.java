package practice;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.Serializable;

class Employee implements Serializable
{
	int id = 41;
	
	transient double salary = 46000.2;
}

public class Ser_Deseralisation 
{
	public static void main(String[] args) throws Exception
	{
		Employee e = new Employee();
		
		System.out.println(e);
		System.out.println(e.id);
		System.out.println(e.salary);
		
		//File f3 = new File("E:\\f drive\\Practice\\Test.txt");
		//Serialization
		FileOutputStream f1 = new FileOutputStream("E:\\f drive\\Practice\\Test.txt");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		
		o1.writeObject(e);
		
		FileInputStream f2 = new FileInputStream("E:\\f drive\\Practice\\Test.txt");
		ObjectInputStream o2 = new ObjectInputStream(f2);
		
		Employee e1 = (Employee)o2.readObject();
		
		System.out.println(e1);
		System.out.println("id :"+e1.id);
		System.out.println("salary :"+e1.salary);
	} 
	
}
