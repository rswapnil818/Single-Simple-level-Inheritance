package com.tnsif.singleinheritance;

public class Student extends Citizen  {
	
	private int rollNo;
	private String collegeName;
	
	public Student()
	{
		super();
	}
	
	
	
	public Student(int rollNo, String collegeName)  //this constructor is use for accessing the objects of Student only
	{
		super();
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}



	public Student( String name,String aadharno,String address,long phno,int rollNo,String collegeName) //by using this constructor we are able to access all the data of citizen as well as student class
	{
		
		super(name,aadharno,address,phno);  ///accessing parent class constructor
		this.rollNo=rollNo;
		this.collegeName=collegeName;
		
		}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()
				+ ", Adhaar Number=" + getAadharno() + ", Address=" + getAddress() + ", Phone No.=" + getPhno()
				+ "]";
	}
	
	

	
	
	
	

}
