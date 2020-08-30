package File_Manipulaion;
//import java.util.*;
import java.io.*;

public class Reading_Created_file 
{

	public static void main(String[] args) 
	{
		
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader("D:\\GitHub Repo\\Data-Structures-And-Algorithm-Interview-Kit\\Programming_Knowledge\\password.txt"));
			br.readLine();
			String line;
			
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			
			br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
}
