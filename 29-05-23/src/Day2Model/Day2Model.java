package Day2Model;

import java.io.Serializable;

public class Day2Model implements Serializable {
	private String ename;
	private int eno;
	
	public Day2Model() {
		super();	
	}
	public Day2Model(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	@Override
	public String toString() {
		return "Day2Model [ename=" + ename + ", eno=" + eno + "]";
	}
	
	
	
}
