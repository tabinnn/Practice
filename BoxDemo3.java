// This program includes a method inside the box class.
class Box {
 double width; double height; double depth;
 double volume() {
 return (width * height * depth);
 }
}
class BoxDemo3 {
public static void main(String args[]) {
 Box mybox1 = new Box();
 Box mybox2 = new Box();
 mybox1.width = 10; mybox1.height = 20; mybox1.depth = 15;
 mybox2.width = 3; mybox2.height = 6; mybox2.depth = 9;
 System.out.println(“Volume is = “+mybox1.volume());
 System.out.println(“Volume is = “+mybox2.volume());
}
}