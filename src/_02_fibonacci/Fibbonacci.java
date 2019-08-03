package _02_fibonacci;

public class Fibbonacci {
public static void main(String[] args) {
	int intone = 0;
	int inttwo = 1;
	int intthree = 0;
	for(int i=0;i<12;i++) {
		intthree=inttwo;
		inttwo=intone+inttwo;
		intone=intthree;
		System.out.println(inttwo);
	}
}
}
