// A complete implementation of BoxWeight using super.
class Box
{
  private double width;
  private double height;
  private double depth;
  // constructor used when all dimensions specified
  Box(double w, double h, double d)
  {
   	 width = w;
	height = h;
	depth = d;
  }
  // constructor used when cube is created
  Box(double len)
  {
    width = height = depth = len;
  }
  // compute and return volume
  double volume()
  {
    return width * height * depth;
  }
}// end of class Box

// BoxWeight now fully implements all constructors.
class BoxWeight extends Box
{
    double weight; // weight of box
    // constructor when all parameters are specified
    BoxWeight(double w, double h, double d, double m)
    {
    	super(w, h, d); // call superclass constructor
    	weight = m;
  	}
  // constructor used when cube is created
  BoxWeight(double len, double m)
  {
    super(len);
    weight = m;
  }
} // End of subclass BoxWeight

class DemoSuper
{
  public static void main(String args[])
  {
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mycube = new BoxWeight(3.0, 2.0);
	    	double vol;
	    	vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " +
		mybox1.weight);
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
		System.out.println("Weight of mycube is " +
		mycube.weight);
   }
 }
