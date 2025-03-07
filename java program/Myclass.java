class Myclass {
	static int Count=0;
	final static double pi = 3.14;
	
	public Myclass(){
	Count++;
}
	public int Count(int objCount){
	System.out.println("the count value of obj"+Count+" is "+Count);
	System.out.println("the pi value is "+pi);
	return Count;
}

	public static void main(String[] args){
		Myclass obj1 = new Myclass();
		obj1.Count(0);
		
		Myclass obj2 = new Myclass();
		obj2.Count(1);
		
		Myclass obj3 = new Myclass();
		obj3.Count(2);
}
}