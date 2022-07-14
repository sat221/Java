class AddDigit{
public void addDigit(){
	int b= 1123;
	int sum=0;
	int rem;
while(b>0){
	rem=b%10;
	sum=sum+rem;
	System.out.println("The addition of digits is: "+sum);
	b/=10;
	}
}
public static void main(String[] args){
AddDigit sp=new AddDigit();
sp.addDigit();
	}
}