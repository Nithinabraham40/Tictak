import java.util.Scanner;

public class Game {
	public static Scanner sc=new Scanner(System.in);

	Board board;
player[]players;
	int turn;
	int noofmovies;
	boolean gameover;
	String zeropattern="";
	String crosspattern="";
	
	public Game(Board board,player[]players){
		this.board=board;
		this.players=players;
		this.turn=0;
		this.noofmovies=0;
		this.gameover=false;
		for(int i=0;i<board.size;i++) {
			zeropattern+="0";
			crosspattern+="X";
		}
		
		
		
	}
	
	public void play() {
		System.out.println(board);
		int n=this.board.size;
		while(noofmovies<n*n) {
			this.noofmovies++;
			int []index=getIndex();
			int row=index[0];
			int col=index[1];
			board.board[row][col]=players[turn].symbol;
			if(this.noofmovies>=2*board.size-1&&checkgameend()==true) {
				
				System.out.println("congrs"+" "+players[turn].name+"is the winner");
				return;
			}turn=(turn+1)%2;
			System.out.println(board);
			
			
		}System.out.println("draw");
		return;
		
	}
	public int[] getIndex() {
		
		while(true) {
		System.out.println(players[turn].name+"s'turn give index");
		
		
		
		int index=sc.nextInt()-1;
		int row=index/this.board.size;
		int col=index%this.board.size;
		if(row<0||col<0||row>=this.board.size||col>=this.board.size) {
			
			System.out.println("out of bound");
			continue;
			
		}
		if(board.board[row][col]!='-') {
			System.out.println("position alredy filled");
			continue;
		}
		int[]arr= {row,col};
		return arr;
			
			
	}}
	
	public boolean checkgameend() {
		
		for(int i=0;i<this.board.size;i++) {
			StringBuilder sb=new StringBuilder();
			for(int j=0;j<this.board.size;j++) {
				sb.append(this.board.board[i][j]);
			}if(sb.toString().endsWith(zeropattern)||sb.toString().endsWith(crosspattern)) {
				return true;
			}
		}
		for(int i=0;i<this.board.size;i++) {
			StringBuilder sb=new StringBuilder();
			for(int j=0;j<this.board.size;j++) {
				sb.append(this.board.board[j][i]);
			}if(sb.toString().endsWith(zeropattern)||sb.toString().endsWith(crosspattern)) {
				return true;
			}
		}
		
		int i=0;int j=0;
		StringBuilder sb=new StringBuilder();
		while(i<this.board.size) {
			sb.append(board.board[i][j]);
			i++;
			j++;
			
		}
		if(sb.toString().endsWith(zeropattern)||sb.toString().endsWith(crosspattern)) {
			return true;
		}
		
		 i=0; j=board.size-1;
		 sb=new StringBuilder();
		while(i<this.board.size) {
			sb.append(board.board[i][j]);
			i++;
			j--;
			
		}
		if(sb.toString().endsWith(zeropattern)||sb.toString().endsWith(crosspattern)) {
			return true;
		}
		return false;
		
	}
	
}
