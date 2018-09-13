import java .io.*;
import java.io.IOException;
class copyfiledata
{
	public static void main(String[] args) throws IOException 
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter("file1.txt"));
		bw.write ("this file will show updated items");
		bw.close();
		InputStream in=new FileInputStream(new File("file1.txt"));
		OutputStream out=new FileOutputStream(new File("file 2.txt"));
		byte[] buf=new byte[1024];
		int len;
		while((len=in.read(buf))>0)
		{
			out.write(buf,0,len);
		}
		in.close();
		out.close();
	}
}
