import javax.swing.*;

class DrawFrame extends JFrame
{
	public DrawFrame()
	{
		add(new DrawComponent());
		pack();
	}	
}