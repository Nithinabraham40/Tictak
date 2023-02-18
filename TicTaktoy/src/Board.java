
public class Board {

	int size;
	char[][]board;
	
	Board(int size){
		
		this.size=size;
		this.board=new char[this.size][this.size];
		
		for(int i=0;i<this.size;i++) {
			for(int j=0;j<this.size;j++) {
				this.board[i][j]='-';
			}
		}
		
	}
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		for(char[]oned:this.board) {
			for(char a:oned) {
				sb.append(a).append("\t");
			}sb.append("\n");
		}
		return new String(sb);
	//return sb.toString();
		
		
	}
	
	
}
