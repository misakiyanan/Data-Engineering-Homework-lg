import java.util.Scanner;


public class Question2 {
	public static Scanner sc = new Scanner(System.in);
	public static int LENGTH = 15;
	public static String[][] chessBoard = new String[LENGTH][LENGTH];
	public static int chessMan = 1; // black=1, white=-1
	public static boolean continueGame= true;

	public static final String INITSYMBOL = "+";
	public static final String BLACK_CHESS = "●";
	public static final String WHITE_CHESS = "○";

	public static String newGame = "y";



	// board set up (init with '+')
	public static void boardSetup() {
		for (int row=0; row<LENGTH; row++) {
			for (int col=0; col<LENGTH; col++) {
				chessBoard[row][col] = "+";
			}
		}
	}


	// display board 
	public static void boardDisplay() {
		for (int row=0; row<=LENGTH; row++) {
				for (int col=0; col<=LENGTH; col++) {
					if (col==0 && row==0) {
						System.out.print("  ");
					} else if (row==0 && col>0) {
						System.out.print("" + String.format("%x ", col));
					} else if (col==0 && row>0) {
						System.out.print("" + String.format("%x ", row));
					} else {
						System.out.print(chessBoard[row-1][col-1]+" ");
					}
				}
				System.out.println();
			}
	}


	// chess board update
	public static void updateBoard(int chessMan) {

		boolean notValid = true;
		System.out.println("请选择放置位置");

		while(notValid) {
			System.out.println("请输入行序号：");
			int rowInput = sc.nextInt();
			System.out.println("请输入列序号：");
			int colInput = sc.nextInt();

			int rowIndex = rowInput - 1;
			int colIndex = colInput - 1; 

			if (rowInput<1 || colInput<1 || rowInput>15 || colInput>15) {
				System.out.println("输入不合法，要求1～15之内的整数，请重新选择放置位置");
				continue;
			} 
			if (chessBoard[rowIndex][colIndex].equals(BLACK_CHESS) 
				|| chessBoard[rowIndex][colIndex].equals(WHITE_CHESS)) {
				System.out.println("此位置已有棋子，请重新选择放置位置");
				continue;
			} 

			if (chessMan == 1) {
				chessBoard[rowIndex][colIndex] = BLACK_CHESS;
				notValid = false;
			}
			if (chessMan == -1) {
				chessBoard[rowIndex][colIndex] = WHITE_CHESS;
				notValid = false;
			}
		}
	}



   // check if current chessman wins
	public static boolean checkIfWin(int chessMan) {
		String currentChess = chessMan==1? BLACK_CHESS: WHITE_CHESS;
		// String currentColorName = chessMan==1? "黑": "白";

		// horizontal
		for (int row=0; row<=14; row++) {
			for (int col=0; col<=10; col++) {
				if ((currentChess.equals(chessBoard[row][col]))
					&& (currentChess.equals(chessBoard[row][col+1]))
					&& (currentChess.equals(chessBoard[row][col+2]))
					&& (currentChess.equals(chessBoard[row][col+3]))
					&& (currentChess.equals(chessBoard[row][col+4]))) {
				    // System.out.println(currentColorName+"方获胜，本局结束");
				    return true;
				}
			}
		}

		// vertical
		for (int row=0; row<=10; row++) {
			for (int col=0; col<=14; col++) {
				if ((currentChess.equals(chessBoard[row][col]))
					&& (currentChess.equals(chessBoard[row+1][col]))
					&& (currentChess.equals(chessBoard[row+2][col]))
					&& (currentChess.equals(chessBoard[row+3][col]))
					&& (currentChess.equals(chessBoard[row+4][col]))) {
				    // System.out.println(currentColorName+"方获胜，本局结束");
				    return true;
				}
			}
		}


		// upper left --> bottom right
		for (int row=0; row<=10; row++) {
			for (int col=0; col<=10; col++) {
				if ((currentChess.equals(chessBoard[row][col]))
					&& (currentChess.equals(chessBoard[row+1][col+1]))
					&& (currentChess.equals(chessBoard[row+2][col+2]))
					&& (currentChess.equals(chessBoard[row+3][col+3]))
					&& (currentChess.equals(chessBoard[row+4][col+4]))) {
				    // System.out.println(currentColorName+"方获胜，本局结束");
				    return true;
				}
			}
		}

		// upper right --> bottom left
		for (int row=0; row<=10; row++) {
			for (int col=4; col<=14; col++) {
				if ((currentChess.equals(chessBoard[row][col]))
					&& (currentChess.equals(chessBoard[row+1][col-1]))
					&& (currentChess.equals(chessBoard[row+2][col-2]))
					&& (currentChess.equals(chessBoard[row+3][col-3]))
					&& (currentChess.equals(chessBoard[row+4][col-4]))) {
				    
				    return true;
				}
			}
		}

		return false;
	}

	// main game
	private static void playGame() {
		while (continueGame) {
		    if (chessMan == 1) {
		    	System.out.println("【当前棋手：黑方 " + BLACK_CHESS +"】");
		    } 
		    if (chessMan == -1) { 
		    	System.out.println("【当前棋手：白方 " + WHITE_CHESS +"】");
		    }
		    updateBoard(chessMan);
		    System.out.println("当前棋盘如下");
		    boardDisplay();

		    if (checkIfWin(chessMan)) {
		    	continueGame = false;
		    	String currentColorName = chessMan==1? "黑": "白";
		    	System.out.println(currentColorName+"方获胜，本局结束");

		    	break;
		    } else {
		    	chessMan = -chessMan;
		        System.out.println("尚未决出胜负，游戏继续...");
		    }
		}
	}


	public static void main(String[] args) {
		do {
			continueGame = true;
			chessMan = 1;
			System.out.println("【欢迎进入五子棋游戏,加载中...】");
			boardSetup();
			boardDisplay();
			playGame();
			System.out.println("是否开始新游戏？ y/n");
			newGame = sc.next();
		} while (newGame.equals("y"));

		System.out.println("游戏结束，退出系统");
	}
}