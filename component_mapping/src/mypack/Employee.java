package mypack;

public class Employee {
	private int eid;
	private String ename;
	private Address eaddress;		//dependent object
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getEaddress() {
		return eaddress;
	}
	public void setEaddress(Address eaddress) {
		this.eaddress = eaddress;
	}
}