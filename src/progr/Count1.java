package progr;

public class Count1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
		String s1="i will become engineer";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ') {
				count++;
				
			}
		}
		System.out.println(count);
		
	}

}
