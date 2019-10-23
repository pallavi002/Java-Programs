import java.io.*;
class Ex{
	public static void main(String args[])throws IOException
	{
		FileReader fr = new FileReader("Z:\\abc.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.println((char)i);
		}
		br.close();
		fr.close();
	}
}