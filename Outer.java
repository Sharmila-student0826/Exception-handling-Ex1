class Outer{
void createInner(){
Inner i1=new Inner();
i1.add(26,65);
}
class Inner{
void add(int a, int b){
System.out.println(a+b);
}
}
public static void main(String[] args){
Outer o=new Outer();
o.createInner();
}
}
// Outer.class Outer$Inner.class