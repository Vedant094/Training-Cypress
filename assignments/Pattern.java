package assignments;

public class Pattern {

	public static void main(String[] args) {
		int number=5;
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=number-1;i>=1;i--) {
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
