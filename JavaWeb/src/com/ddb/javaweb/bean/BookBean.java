package com.ddb.javaweb.bean;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class BookBean {
	private String bookName;
	private int bookNum;

	public BookBean() {
		// super();
	}
	
	public BookBean(int bookNum) {
		// super();
		this.bookNum =bookNum ;
	}

//	/**
//	 * @return the bookName
//	 */
//	public String getBookName() {
//		return bookName;
//	}
//
//	/**
//	 * @param bookName
//	 *            the bookName to set
//	 */
//	public void setBookName(String bookName) {
//		this.bookName = bookName;
//	}
//
//	/**
//	 * @return the bookNum
//	 */
//	public int getBookNum() {
//		return bookNum;
//	}
//
//	/**
//	 * @param bookNum
//	 *            the bookNum to set
//	 */
//	public void setBookNum(int bookNum) {
//		this.bookNum = bookNum;
//	}

}
