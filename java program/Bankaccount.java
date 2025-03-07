class Bankaccount {
    private String AccName;
    private int AccNo;
    private float currentbalance;
    private float finalamount;
	public Bankaccount(String AccName,int AccNo,float currentbalance){
	this.AccName=AccName;
	this.AccNo=AccNo;
	this.currentbalance=currentbalance;
	this.finalamount=currentbalance;
	System.out.println("the customer details are "+AccName+","+AccNo+","+currentbalance);
      }
	public void withdraw(int amount){
	if(amount< currentbalance){
	currentbalance=currentbalance-amount;
	System.out.println("the currentbalance is "+currentbalance);     
          }
	else{
	System.out.println("Insufficient funds");
	}
      }
	public float deposit(int amount){
	currentbalance=currentbalance+amount;
	finalamount=currentbalance;
	return finalamount;
      }	
        public static void main(String[] args){
	Bankaccount p1 = new Bankaccount("Manasa",12072007,10000000);
	p1.withdraw(700000);
	p1.deposit(500000);
	System.out.println("the final amount in the account is "+p1.finalamount);
      }
}


