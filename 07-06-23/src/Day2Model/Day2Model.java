package Day2Model;

import java.io.Serializable;
import java.util.Comparator;

public class Day2Model implements Serializable {
	private static Day2Model instance=null;
	public Day2Model(String ename, int eno) {
		super();
		this.ename = ename;
		this.eno = eno;
	}
// instance method
	public static Day2Model getInstance() {
		if(instance == null) {
			instance= new Day2Model();
		}return  instance;
	}

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
    public int compareTo(Day2Model emp) {     //Employee emp=new Employee();

        return this.eno - emp.eno;

    }

 
    public static Comparator<Day2Model> nameComparator = new Comparator<Day2Model>() {

        @Override

        public int compare(Day2Model emp1, Day2Model emp2) {

            return emp1.getEname().compareTo(emp2.getEname());
        }

        };
    }

	

