package txt_7chap_3_4;

public class average_letter {

public static void main(String[] args) {
		// TODO Auto-generated method stub
 char s[]= {'J','a','v','a',' ','i','s',' ','a','n',' ','O','b','j','e','c','t',' ','O','r','i','e','n','t','e','d',' ','p','r','o','g','r','a','m','m','i','n','g',' ','l','a','n','g','u','a','g','e'};
 String m="Java is an Object Oriented programming language";
 int sum=m.length();
 int l=0;
 for(int y=0;y<s.length;y++)
 {
	 if(s[y]==' ')
		 {
		   l++;
		   System.out.printf("  ");
		 }
	 else
	 {
		 System.out.print(s[y]);
	 }
 }
 System.out.printf("\n");
 int average =(sum-l)/(l+1);
 System.out.println("average length is:"+average);
 
	
}
}
