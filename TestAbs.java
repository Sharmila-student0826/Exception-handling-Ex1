class TestAbs extends Abs{
void sub(int a, int b){
System.out.println(a-b);

}
void div(int a, int b){
System.out.println(a/b);

}

public static void main(String[]args){
Abs a=new TestAbs();
a.add(1);
a.sub(12,2);
a.div(36,9);
}
}