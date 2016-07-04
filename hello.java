import java.io.*;

public class hello 
{
	public static void main(String[] args) 
	{
		try 
		{
			File file = new File("hello_unicode.txt");
			FileReader readFile = new FileReader(file);
			BufferedReader readByLine = new BufferedReader(readFile);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = readByLine.readLine()) != null) 
			{
				stringBuffer.append(line + '\n');
			}
			readFile.close();
			System.out.println(stringBuffer.toString());
		} 
		catch (IOException e) 
		{
			System.out.println("File not found.");
		}
	}
}
