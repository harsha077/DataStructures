package DesignPatterns;

public class TestDesignPatterns {
	public static void main(String...args) {
		int x=9;
		int y=12;
			
		System.out.println(digitchange(x, y));
	}
	
	public static int digitchange(int x,int y) {
		int count=0;
		int temp = x;
		
		while(x<y) {
			x=x+1;
			if(x/10==0) {
				count+=1;
			}else {
				if(x/10==temp/10) {
					count+=1;
				}else {
					count = count+2;	
				}
			}
			temp=x;
		}
		return count;
	}
}
