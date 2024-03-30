import java.util.Scanner;
public class Lab4_2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the line:");
		String line=sc.next();
		int conso=0;
		int alpha=0;
		for(int i=0; i<line.length();i++){
			char n = line.charAt(i);
			if(n=='A'||n=='a'||n=='E'||n=='e'||n=='I'||n=='i'||
				n=='O'||n=='o'||n=='U'||n=='u'){
				conso=conso+1;
			}else{
				alpha=alpha+1;
			}
		}
		System.out.println("VOWELS:"+conso);
		System.out.println("CONSONANTS:"+alpha);
	}
}