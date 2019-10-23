class Over
{
 void test()
 {
  System.out.println("No Parameter");
 }
 int test(int a)
 {
  return (a+a);
 }
 double test(double a)
 {
  System.out.println("a is "+a);
  return 0;
 }
 int test(int a,int b)
 {
 System.out.println("a is "+a+"b is "+b);
 return 1;
 }
}
class Demo
{
 public static void main(String args[])
 {
 Over o1=new Over();
 o1.test();
 o1.test(2);
 o1.test(2.5);
 o1.test(3,4);
 }
}
