package java1202;
import java.util.Scanner;
public class sunhee {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String subj_name[]= {"국어","영어","수학","자바","C","과학","사회","기가","한국사","일본어"};
		System.out.print("학생 수 : ");
		int stu=scan.nextInt();
		//System.out.print("몇 과목 : ");
		//int subj=scan.nextInt();
		int max=0;
		int sum=0;
		for( int i=1; i<=stu; i++){
			int score[]=new int[10];
			System.out.print(i+"번째 학생\n");
			System.out.print("학번 : ");
			String a=scan.next();
			System.out.print("이름 : ");
			String b=scan.next();
			for(int l=0; l<10; l++){
				do{
					System.out.print(subj_name[l]+" :");
					score[l]=scan.nextInt();
				}while(score[l]<0 || score[l]>100);
				sum+=score[l];
				if(score[l]>max) {
					max = score[l];
				}
			}
			System.out.print(a+" "+b);
			for(int j=0; j<10; j++){
				System.out.printf(" %d ",score[j]);
			}
				double il = (double)sum/10;
				System.out.printf(" %d",sum);
				System.out.printf(" %.2f",il);
				int ak = (int)il/10;
				switch(ak){
					case 9 : System.out.println(" A"); break;
					case 8 : System.out.println(" B"); break;
					case 7 : System.out.println(" C"); break;
					case 6 : System.out.println(" D"); break;
					default : System.out.println(" E");
				}
	
			System.out.println("최대값 : "+max);
			System.out.print("\n");
		}
			
	
		
		
	}
}
