package week1.day2;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b, temp, d;
int c=34343;
temp=c;
for(b=0;c>0;c/=10)
{
	d=c%10;
	b=(b*10)+d;
	
}
if(b==temp) {
	System.out.println("It is a Palindrome");
}
else {
	System.out.println("It is not a Palindrome");
}
}
	}

