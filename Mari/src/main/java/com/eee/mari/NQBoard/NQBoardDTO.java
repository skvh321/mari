package com.eee.mari.NQBoard;

import java.util.Arrays;
import java.util.Date;

public class NQBoardDTO {
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int viewcnt;
	private String name;
	private int cnt;
	private String useYN;
	private String[] files;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getUseYN() {
		return useYN;
	}
	public void setUseYN(String useYN) {
		this.useYN = useYN;
	}
	public String[] getFiles() {
		return files;
	}
	public void setFiles(String[] files) {
		this.files = files;
	}
	public NQBoardDTO(int bno, String title, String content, String writer, Date regDate, int viewcnt, String name,
			int cnt, String useYN, String[] files) {
		
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
		this.viewcnt = viewcnt;
		this.name = name;
		this.cnt = cnt;
		this.useYN = useYN;
		this.files = files;
	}
	@Override
	public String toString() {
		return "NQBoardDTO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", regDate=" + regDate + ", viewcnt=" + viewcnt + ", name=" + name + ", cnt=" + cnt + ", useYN="
				+ useYN + ", files=" + Arrays.toString(files) + "]";
	}
	
}
