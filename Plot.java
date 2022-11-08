/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: (Give a brief description for each Class)
 * Due: 11/08/2022
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: __Kaan Sen________
*/
public class Plot extends Object {

	private int x;	// x coordinate of the plot 
	private int y;	// y coordinate of the plot 
	private int width;	// width coordinate of the plot
	private int depth;	// depth coordinate of the plot 
	
	public Plot()
	{
		this.width = 1;
		this.depth = 1; 
	}
	
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public Plot(Plot otherPlot)
	{
	//	otherPlot = new Plot();
		this.x= otherPlot.x;
		this.y= otherPlot.y;
		this.width = otherPlot.width;
		this.depth = otherPlot.depth;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public boolean overlaps(Plot plot)
	{
		if(x<plot.x + plot.width && x + width > plot.x && y < plot.y + plot.depth && y + depth > plot.y)
		{
			return true;
		}
		return false;
	}
	
	public boolean encompasses(Plot plot)
	{
		boolean encompasses = false;
		if(this.x <= plot.getX() && plot.getX() <= x+width && this.y <= plot.getY() && plot.getY() <= plot.getY() + plot.getDepth()
			&& this.x <= x+width && plot.getX() + plot.getWidth() <= x+width && this.y <= plot.getY() + plot.getDepth() &&
			plot.getY() + plot.getDepth() <= y+depth)
		{
			encompasses = true;
		}
			return encompasses;
	}
	
	@Override
	public String toString()
	{
		return x+","+y+","+width+","+depth; 
	}
}
