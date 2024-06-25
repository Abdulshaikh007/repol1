class Display{
static int x=20;
static int y=30;
static void show(int x,int y){
System.out.println(x);
System.out.println(y);
}
}
class test{
public static void main(String args[]){
//Display obj=new display();
Display.show(7,8);
System.out.println(Display.x);
System.out.println(Display.y);
}
}

