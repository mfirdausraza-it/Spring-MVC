package com.journaldev.spring.model;

public class Addition {
	
	private int i,j;

	public Addition(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
		
	public int sum() {
		return this.i+this.j;
	}
	
	}


