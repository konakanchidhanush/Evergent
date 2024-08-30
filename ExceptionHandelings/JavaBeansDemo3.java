package com.evergent.CoreJAVA.ExceptionHandelings;

public class JavaBeansDemo3 {
private int eno;
public void setEno(int eno) {
	this.eno = eno;
}


public void setEname(String ename) {
	this.ename = ename;
}


public void setSal(double sal) {
	this.sal = sal;
}


private String ename;
private double sal;


public String toString()
{
	return sal+" "+ename+"  "+eno;
}

}



