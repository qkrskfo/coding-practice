package basicStudy;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	Board board1 = new Board("제목1", "내용1");
	Board board2 = new Board("제목2", "내용2");
	
	public List<Board> getBoardList() {
		List<Board> board = new ArrayList<Board>();
		board.add(board1);
		board.add(board2);
		return board;
	}
	
}
