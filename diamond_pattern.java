package basic_program;

public class diamond_pattern {
	public static void main(String args[]) {
		for(int i =1;i<=8;i++) {
			for(int k=1;k<=8-i;k++) {
				System.out.print(" ");
			}
			for(int j =1;j<=(2*i)-1;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(int i=7;i>=1;i--) {
			for(int k=1;k<=8-i;k++) {
				System.out.print(" ");
			}
			for(int j =1;j<=(2*i)-1;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
