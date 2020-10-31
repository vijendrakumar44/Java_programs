package progr;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="mango";
String s2 = s1.toLowerCase();
String rev="";
for(int i=s2.length()-1;i>=0;i--) {
	rev=rev+s2.charAt(i);
}
System.out.println(rev);
	}

}
