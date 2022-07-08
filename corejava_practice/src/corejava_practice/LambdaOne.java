package corejava_practice;


public class LambdaOne {
	
	public static void main(String[] args)
	{
		int num=456;
		Drawable drawable=new Drawable()
				{
					public void draw() {
						System.out.println("First line" +num);
					}
				};
				
				Drawable d=() -> {System.out.println("Second line"+num);};
				
				
				drawable.draw();
				d.draw();
				
	
	}

}
