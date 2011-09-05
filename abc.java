/*
TASK: abc
LANG: JAVA
*/
import java.util.Arrays;
import java.util.Scanner;


public class abc {
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int n1=Integer.parseInt(sc.next());
	int n2=Integer.parseInt(sc.next());
	int n3=Integer.parseInt(sc.next());
	String input=sc.next();
	int [] keep={n1,n2,n3};
	
	Arrays.sort(keep);
	for(int i=0;i<input.length();i++){
	if(input.charAt(i)=='A'){
		System.out.print(keep[0]+" ");
	}
	else if(input.charAt(i)=='B'){
		System.out.print(keep[1]+" ");
	}
	else if(input.charAt(i)=='C'){
		System.out.print(keep[2]+" ");
	}
	}
}
}
