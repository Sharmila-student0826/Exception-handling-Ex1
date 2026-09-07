interface Inter1{
void add(int a,int b);

}
interface Inter2{
void sub(int a,int b);

}

class UseInter1 implements Inter1,Inter2{
public void add(int a,int b){
System.out.println(a+b);
}
public void sub(int a,int b){
System.out.println(a-b);
}
public static void main(String[] args){
Inter1 i=new UseInter1();
i.add(12,23);
Inter2 i2=new UseInter1();
i2.sub(12,2);
UseInter1 u=new UseInter1();
u.add(12,23);
u.sub(12,1);
}
}