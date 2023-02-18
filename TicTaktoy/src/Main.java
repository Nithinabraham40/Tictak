
public class Main {
public static void main(String[] args) {
	
	player p1=new player("nithin");
	System.out.println(p1);
	player p2=new player("amal");
	System.out.println(p2);
	Board b1=new Board(3);
	//System.out.println(b1);
	player []arr= {p1,p2};
	Game g1=new Game(b1,arr);
	g1.play();
	
	
	
}
}
