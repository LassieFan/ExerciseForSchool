package txt_13chap_3_4;
import java.io.*;
public class count_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "";
		  try
{
	FileInputStream fis = new FileInputStream("d:\\����.txt");
	BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	String temp = "";
		   
	 while((temp=br.readLine())!=null)
   {
	 s = s + temp + "\n";//��ȡ�����ļ���Ϣ
   }
} 
	catch (FileNotFoundException e){} 
	catch (IOException e){}
	for (int i = 0; i < s.length(); i++)
	{
		String temp = "";//��¼��ʱ����
		int tempnum = 0;
		temp = temp + s.charAt(i);
		if((int)s.charAt(i)<97||(int)s.charAt(i)>122)//���ַ�������ĸ��ʱ�� ��ʱ�ַ����
		{
		    temp = "";
		    tempnum++;//��¼���ʵĸ���
		}
    }
}
}



 
