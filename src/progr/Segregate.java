package progr;

public class Segregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="vijendra123@gnail.gh*:";
int alpha=0;
int spl=0;
int num=0;
char[] ch = s1.toCharArray();
for(int i=0;i<ch.length;i++) {
	if(Character.isAlphabetic(ch[i])) {
		alpha++;
	}else if(Character.isDigit(ch[i])) {
		num++;
	}else
	{
	spl++;	
	}
}
System.out.println(alpha);
System.out.println(spl);
System.out.println(num);
	}

}
