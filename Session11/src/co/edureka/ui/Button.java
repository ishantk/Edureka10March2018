package co.edureka.ui;

// Bean (POJO or Model)
public class Button {
	
	// Attributes for a Button
	int width;
	int height;
	String text;
	String textColor;
	String backgroundColor;
	
	public Button(){
		System.out.println("Button Object Constructed..");
	}
	
	public Button(int width, int height, String text, String textColor, String backgroundColor) {
		System.out.println("Button Object Constructed with Inputs..");
		this.width = width;
		this.height = height;
		this.text = text;
		this.textColor = textColor;
		this.backgroundColor = backgroundColor;
	}
	
	public void myInit(){
		//...
		System.out.println("--Button myInit--");
	}
	
	public void myDestroy(){
		//..
		System.out.println("--Button myDestroy--");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	@Override
	public String toString() {
		return "Button [width=" + width + ", height=" + height + ", text=" + text + ", textColor=" + textColor
				+ ", backgroundColor=" + backgroundColor + "]";
	}
}
