package test;
import java.io.*;
@SuppressWarnings("serial")
public class EmployeeBean implements Serializable{
	private String eId,eName,eDesg;
	private float bSal,hra,da,totsal;
	public EmployeeBean() {}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDesg() {
		return eDesg;
	}
	public void seteDesg(String eDesg) {
		this.eDesg = eDesg;
	}
	public float getbSal() {
		return bSal;
	}
	public void setbSal(float bSal) {
		this.bSal = bSal;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	public float getDa() {
		return da;
	}
	public void setDa(float da) {
		this.da = da;
	}
	public float getTotsal() {
		return totsal;
	}
	public void setTotsal(float totsal) {
		this.totsal = totsal;
	}
	

}
