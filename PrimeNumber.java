package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=95;
		boolean flag=false;
		for (int i=2;i<=a/2;++i) {
			if(a%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("It is a Prime number");
		}else {
			System.out.println("It is not a Prime number");
		}

	}

}
