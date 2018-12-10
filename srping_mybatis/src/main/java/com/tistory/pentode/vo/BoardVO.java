package com.tistory.pentode.vo;

import java.util.Date;

public class BoardVO {
	private Integer num;
	private String name;
	private String title;
	private String content;
	private Integer readCount;
	private Date writeDate;
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Integer getReadCount() {
		return readCount;
	}
	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", name=" + name + ", title=" + title + ", content=" + content + ", readCount="
				+ readCount + ", writeDate=" + writeDate + "]";
	}

}
