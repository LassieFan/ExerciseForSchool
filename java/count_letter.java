package txt_13chap_3_4;
import java.io.*;
public class count_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "";
		  try
{
	FileInputStream fis = new FileInputStream("d:\\单词.txt");
	BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	String temp = "";
		   
	 while((temp=br.readLine())!=null)
   {
	 s = s + temp + "\n";//读取到的文件信息
   }
} 
	catch (FileNotFoundException e){} 
	catch (IOException e){}
	for (int i = 0; i < s.length(); i++)
	{
		String temp = "";//记录临时单词
		int tempnum = 0;
		temp = temp + s.charAt(i);
		if((int)s.charAt(i)<97||(int)s.charAt(i)>122)//当字符不是字母的时候 临时字符清空
		{
		    temp = "";
		    tempnum++;//记录单词的个数
		}
    }
}
}



 
