package com.kh.spring.board.model.vo;

import java.sql.Date;

import com.kh.spring.member.model.vo.Member;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//필요없는 annotation은 최대한 안쓰는게 좋다.(예를 들어 해쉬코드는 지금 필요없다)
public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardWriter;
	private String boardContent;
	private String originName;
	private String changeName;
	private int count;
	private String createDate;
	private String status;
}