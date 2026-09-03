//throw key word
class Ex4{
void div(int a,int b){
try{
System.out.println(a/b);
}catch(ArithmeticException e1){
System.out.println("div():divide by zero -exception"+e1);
throw e1;
}}
public static void main(String[] ar){
int a=10;
int b=2;//if zero it will throw ArithmeticException
Ex4 e=new Ex4();
try{
e.div(a,b);
}catch(ArithmeticException ee){

System.out.println("main():divide by zero -exception"+ee);
}}}