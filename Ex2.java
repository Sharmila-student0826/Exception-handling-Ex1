//exception handling using try catch finally block
//finally block will execute whether error comes or not
class Ex2{
public static void main(String[] ar){
try{
String s1=ar[0];
String s2=ar[1];
System.out.println(s1+s2);
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
System.out.println(a+b);
System.out.println(a/b);
}catch(Exception e){

System.out.println("please enter two numbers to add and divide"+e);
}
finally{
System.out.println("finally block reached");
}
}}
