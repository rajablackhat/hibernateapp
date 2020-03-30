package org.College;

import javax.swing.JOptionPane;


import org.junit.Test;

import junit.framework.Assert;

public class UnitTest {
	public DisplayData obj =new DisplayData();
	@Test
	public void test() {
		
		obj.roll=12345;
	    /*obj.getRollno();
		obj.getName();
		obj.getCourse();
		obj.getFees();*/
		if(obj.roll != 0)
		{
		System.out.println(obj.roll);
		//Assert.assertEquals(8875,obj.roll);
		
		}
		  else
		{
		Assert.fail("Enter rollno");
			//JOptionPane.showMessageDialog(null,"Enter your roll no",null,JOptionPane.INFORMATION_MESSAGE);
		}
	}
		
		@Test
		public void testname() {
			obj.stname="Nive";
			if(obj.stname != "")
			{
				System.out.println(obj.stname);
			}
			else
			{
			Assert.fail("Enter Name");
			}	
		}
		@Test
		public void testCourse() {
			obj.course="MCA";
			if(obj.course != "")
			{
				System.out.println(obj.course);
			}
			else
			{
			Assert.fail("Enter Course name");
			}			
		}
		@Test
		public void testfees() {
			obj.fees=50000;
			if(obj.fees != 0)
			{
				System.out.println(obj.fees);
			}
			else
			{
			Assert.fail("Enter Fees");
			}	
		}

		}
	



