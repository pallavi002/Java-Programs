class Volume
{
	int length;
	int breadth;
	int height;
	int side;
	Volume(int l,int b,int h,int s)
	{
	length = l;
	breadth = b;
	height = h;
	side = s;
	}
	public static void main(String args[])
	{
	Volume vols = new Volume(10,20,30,0);
	int Vol=vols.length *vols.breadth *vols.height;
	System.out.println("Cuboid is:" +Vol);
	Volume v2 = new Volume(0,0,0,10);
	int Vol2=v2.side *v2.side *v2.side;
	System.out.println("Cube is:" +Vol2);
	Volume V3 = new Volume();
	length=5;
	breadth=15;
	height=10;
	int vol3=V3.length*V3.breadth*V3.height;
	System.out.println("Cuboid2 is:" +vol3);
	}
}