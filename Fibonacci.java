package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4,b=0,c=1,sum;
		System.out.println(+b);
		System.out.println(+c);
		for (int i=2;i<a;++i) {
			sum=b+c;
			System.out.println(+sum);
			b=c;
			c=sum;
	}
}
}