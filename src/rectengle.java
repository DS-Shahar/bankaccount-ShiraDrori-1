package rectangle;

public class rectengle {
	private int length = 1;
	private int width = 1;
	
	public rectengle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public void draw() {
	 for (int i = 0; i < width; i++) { 
         for (int j = 0; j < length; j++) {
             System.out.print("_"); 
         }
         System.out.println();
     }
 }
	
	public int calcArea() {
		return (length*width);
	}
	
    public double calcPerimeter() {
        return 2 * (length + width);
}
    public void scale(int factor) {
    	length *= factor;
    	width *= factor;
    }
    
    public String toString() {
    	return "the length of the rectangle is: " + length + "\n" + "the width of the rectangle is: " + width;
    }
}
