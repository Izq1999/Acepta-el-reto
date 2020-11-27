import java.util.Scanner;

public class Caminando_voy{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int max_slope,n,level1,level2, dif=0, level=0;
		boolean apt=true;
		max_slope=sc.nextInt();
		n=sc.nextInt();
		sc.nextLine();
		level1=sc.nextInt();
		do{
			level2=sc.nextInt();
			if(level2<=level1){
				level=0;
			}
			else{
				level+=(level2-level1);
			}
			if(level>max_slope){
				apt=false;
			}
			n--;
			level1=level2;	
		}while((n-1>0) && (apt));
		
		if(apt){
			System.out.println("APTA");
		}else{
			System.out.println("NO APTA");
		}
	}
}
