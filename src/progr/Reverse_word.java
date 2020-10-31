package progr;

public class Reverse_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="there is bus";
String[] word = s1.split(" ");
String rev="";
for(int i=word.length-1;i>=0;i--) {
	String s2 = word[i];
	for(int j=s2.length()-1;j>=0;j--) {
		rev=rev+s2.charAt(j);
	}

	
}
System.out.println(rev);

	}

}
