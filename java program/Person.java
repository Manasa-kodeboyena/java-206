class Person{
//private field
private int age;
//getter method
public int getAge(){
return age;
}
//setter method
public void setAge(int age){
this.age=age;
}
}
class main {
public static void main(string[] args){
//create an object of person
Person p1 = new Person();
//Change age using setter
p1.setAge(24);
//acess age using getter
System.out.println("My age is" +p1.getAge());