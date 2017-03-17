package com.ltt.entiry;

public class Book {

	private int bid;
	private String bname;
	private double bprice;
	private String btype;
	private String btime;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
	}
	public String getBtime() {
		return btime;
	}
	public void setBtime(String btime) {
		this.btime = btime;
	}
	public Book(int bid, String bname, double bprice, String btype, String btime) {
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
		this.btype = btype;
		this.btime = btime;
	}
	public Book() {
	}
	@Override
	public String toString() {
		return bprice+"\t"+btype;

	}
	
}
