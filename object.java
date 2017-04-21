package vasu007;
class vis {
	void dom(float x,float y){
		
		if (x==y)
			System.out.println("both are equal");
		else if(x<y)
		System.out.println("y is greater");
		else
			System.out.println("x is greater");
	}
}
public class object {
	public static void main(String args[]){
		float x=2.3f,y=5.7f;
		vis man=new vis();
		man.dom(0.9f, 0.7f);
	}

}
