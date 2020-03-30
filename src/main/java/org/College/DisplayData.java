package org.College;


import java.io.Serializable;

public class DisplayData implements Serializable{
	private static final long serialVersionUID = 1L;
	public String stname,course;
	public int roll,fees;
	public String getName()
	{
		return stname;
	}
	public void setName(String stname)
	{
		this.stname=stname;
	}
	public int getRollno()
	{
		return roll;
	}
	public int setRollno(int roll)
	{
		this.roll=roll;
		return roll;
	}
	public String getCourse()
	{
		return course;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public int getFees()
	{
		return fees;
	}
	public int setFees(int fees)
	{
		this.fees=fees;
		return fees;
	}       
       public DisplayData() {
        super();
        // TODO Auto-generated constructor stub
    }

}
