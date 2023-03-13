package test;

public class Clock {
	public static void main(String a[]) {
	final int hour=12;
	final int minute=60;
	final int second=60;
	double circle=360;
	double degree=0;
	degree=circle/60;
	
	for(int i=0;i<=degree;i++) {
		
		for(int j=0;j<=minute;j++) {
			for(int k=0;k<=second;k++) {
				degree++;
			}
		}
	}
	System.out.println();
}
}