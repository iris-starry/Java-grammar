package java1202;
import java.util.Scanner;
public class array_ABC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int inp=(int)(sc.next().charAt(0));
		if(inp<97) inp=inp-64;
		else inp=inp-96;
		char num[]= new char[inp];
		for(int i=0; i<num.length; i++) {
			num[i]=(char)('A'+i);
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
		}
		for(int i=0; i<num.length; i++) {
			System.out.print((char)(num[i]+'a'-'A'));
		}
			
		

	}

}