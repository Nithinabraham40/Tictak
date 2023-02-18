
public class player {
	String name;
	char symbol;
	static int playercount=0;
	player(String name){
		
		this.name=name;
		this.symbol=playercount==0?'X':'0';
		playercount++;
		
		
	}
	
	@Override
	public String toString() {
	
		StringBuilder sb=new StringBuilder();
		sb.append("name: ").append(this.name+" ").append("Symbol: ").append(this.symbol).append("\n");
		return sb.toString();
	}

}
