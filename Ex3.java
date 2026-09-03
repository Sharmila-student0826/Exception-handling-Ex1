class Ex3{
public static void main(String[] ar){
try{
String s1=ar[0];
String s2=ar[1];
System.out.println(s1+s2);
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
System.out.println(a+b);
System.out.println(a/b);
}
catch(ArrayIndexOutOfBoundsException e1){

System.out.println("please enter any two values"+e1);
}
catch(NumberFormatException e2){
System.out.println("please enter numbers"+e2);
}
catch(ArithmeticException e3){
System.out.println("enter non zero number for 2nd value"+e3);
}
finally{
System.out.println("finally block reached");
}
}
}
