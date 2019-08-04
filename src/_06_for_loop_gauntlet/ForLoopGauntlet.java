package _06_for_loop_gauntlet;

public class ForLoopGauntlet {
public static void main(String[] args) {
	System.out.println("#1");
	for(int i=0;i<101;i++) {
		System.out.println(i);
	}
	System.out.println("#2");
	for(int i=100;i>0;i--) {
		System.out.println(i);
	}
	System.out.println("#3");
	for(int i=1;i<101;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	System.out.println("#4");
	for(int i=0;i<100;i++) {
		if(i%2==1) {
			System.out.println(i);
		}
	}
	System.out.println("#5");
	for(int i=1;i<501;i++) {
		if(i%2==1) {
			System.out.println(i + " is odd");
		}
		else if(i%2==0) {
			System.out.println(i + " is even");
		}
	}
	System.out.println("#6");
	for(int i=0;i<778;i++) {
		if(i%7==0) {
			System.out.println(i);
		}
	}
	System.out.println("#7");
	int age = 0;
	for(int i=2006;i<2020;i++) {
		System.out.println("In " + i + " I was " + age + " years old");
		age=age+1;
	}
	System.out.println("#8");
	/*int one = 0;
	int two = 0;
	for(int i=0;i<9;i++) {
		System.out.println(one+" "+two);
		if(two==2) {
			one=one+1;
			two=-1;
		}
		two=two+1;
	}*/
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.println(i+" "+j);
		}
	}
	System.out.println("#9");
	int one2 = 1;
	int two2 = 2;
	int three2 = 3;
	for(int i=0;i<3;i++) {
		System.out.println(one2+" "+two2+" "+three2);
		one2=one2+3;
		two2=two2+3;
		three2=three2+3;
	}
	System.out.println("#10");
	int onee = 1;
	int twoe = 2;
	int threee = 3;
	int foure = 4;
	int fivee = 5;
	int sixe = 6;
	int sevene = 7;
	int eighte = 8;
	int ninee = 9;
	int tene = 10;
	for(int i=0;i<10;i++) {
		System.out.println(onee+" "+twoe+" "+threee+" "+foure+" "+fivee+" "+sixe+" "+sevene+" "+eighte+" "+ninee+" "+tene);
		onee=onee+10;
		twoe=twoe+10;
		threee=threee+10;
		foure=foure+10;
		fivee+=10;
		sixe+=10;
		sevene+=10;
		eighte+=10;
		ninee+=10;
		tene+=10;
	}
	System.out.println("#11");
	String huhc = "*";
	for(int i=0;i<3;i++) {
		for(int j=0;j<2;j++) {
			System.out.println(huhc);
			huhc+="*";
		}
	}
	System.out.println("bonus");
	for(int i=0;i>-101;i--) {
		System.out.println(i+100);
	}
}
}
