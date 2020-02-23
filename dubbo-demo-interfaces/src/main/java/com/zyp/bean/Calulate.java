package com.zyp.bean;

import java.io.Serializable;

public class Calulate implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1793299544897022952L;
	int i;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calulate other = (Calulate) obj;
		if (i != other.i)
			return false;
		return true;
	}
	public Calulate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calulate(int i) {
		super();
		this.i = i;
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	@Override
	public String toString() {
		return "Calulate [i=" + i + "]";
	}
	
}
