package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		//Board-1. 스프링 컨테이너 생성 및 호출 (applicationContext.xml 설정 파일을 토대로 컨테이너 생성)
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		/* Board-2. 스프링 컨테이너에 의해 자동으로 생성 된 컨텍스트 중, boardService로 명명된 컨텍스트를 호출한다. (BoardServiceImpl.java)
		 * 이 때, @Autowired로 연결 된 객체(BoardDAO)를 찾아 반환한다.
		 */
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		//Board-3. 빈즈 객체를 생성하고 리터럴을 설정한 후, boardService 변수를 사용하여 비즈니스 로직을 실행한다.
		BoardVO vo = new BoardVO();
		vo.setTitle("임시 제목");
		vo.setWriter("홍길동");
		vo.setContent("임시 내용..........");
		boardService.insertBoard(vo);
		
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		container.close();
	}

}
