package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrtimeOrNot {
public static void main(String[] args) {
String num = JOptionPane.showInputDialog("Type a number!");
int numb = Integer.parseInt(num);
for(int i=2;i<numb;i++) {
	System.out.println(i);
	if(numb%i==0) {
		JOptionPane.showMessageDialog(null, "The number is not prime.");
		return;
	}
}
JOptionPane.showMessageDialog(null, "The number is prime!!!");
}
}
