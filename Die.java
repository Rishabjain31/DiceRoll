import java.util.Random;
public class Dice {

	int faces;
	public Dice(int faces){
		this.faces = faces;
		
	}
	
	public String roll(){
		Random r = new Random();
		String[] HT = {"Head" , "Tail"};
		String[] other = {"One", "Two", "Three", "Four","Five","Six"};
		
		if(this.faces == 2){
			int  output = r.nextInt(this.faces);
			return HT[output];
		}
		else{
			int  output = r.nextInt(this.faces);
			return(other[output]);
		}
	}
	
	public static void main(String[] args) {
		Dice d = new Dice(6);
		System.out.println("Face of dice is -> " + d.roll());
	}
}