package Quiz02;

interface iShape03
{
	public void show();
	public int area();
}
interface iColor extends iShape03
{
	public void showColor();
}
class CWin implements iShape03
{
	protected int width;
	protected int height;
	protected String color;
	public CWin(int w, int h, String str)
	{
		width = w;
		height = h;
		color = str;
	}
	public  void showColor()
	{
		System.out.println("color="+color);
	}
	public void show()
	{
		System.out.println("width="+width);
		System.out.println("height="+height);
		System.out.println("area="+width*height);
	}
	
	@Override
	public int area() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class J2 {
	public static void main(String args[]) {
		CWin win = new CWin(5,7,"Green");
		win.showColor();
		win.show();
	}

}
