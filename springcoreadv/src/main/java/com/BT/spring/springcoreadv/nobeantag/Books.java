package com.BT.spring.springcoreadv.nobeantag;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Books {
	
	@Value("#{authors}")
	private List<String> authors;
	
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	private int bno;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	private String bname;

	@Override
	public String toString() {
		return "Books [authors=" + authors + ", bno=" + bno + ", bname=" + bname + "]";
	}
	
	

}
