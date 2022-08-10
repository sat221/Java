class WrapperClass{
	public static void main(String[] ar){
		int a=23;
		int b=23;
		int c=23;
	Integer i = Integer.valueOf(a);
	Integer j = Integer.valueOf(b);
	Integer k = Integer.valueOf(c);
	System.out.println(i.equals(j));
	System.out.println(j.equals(k));
	System.out.println(k.equals(i));
}
}