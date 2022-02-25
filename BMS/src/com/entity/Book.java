package com.entity;

import java.io.Serializable;

public class Book implements Serializable {
	
	
	private int Bid;
	private String Btitle;
	private float Bprice;
	private String Bgrade;
	
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBtitle() {
		return Btitle;
	}
	public void setBtitle(String btitle) {
		Btitle = btitle;
	}
	public float getBprice() {
		return Bprice;
	}
	public void setBprice(float bprice) {
		Bprice = bprice;
	}
	public String getBgrade() {
		return Bgrade;
	}
	public void setBgrade(String bgrade) {
		Bgrade = bgrade;
	}	

}