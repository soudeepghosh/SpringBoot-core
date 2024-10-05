package in.demo.soudeep.bean;

public class EmployeeVo {
	
	private String srNo;
	private String empNo;
	private String ename;
	private String job;
	private String salary;
	private String deptNo;
	private String mgrNo;
	
	
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getMgrNo() {
		return mgrNo;
	}
	public void setMgrNo(String mgrNo) {
		this.mgrNo = mgrNo;
	}
	
	@Override
	public String toString() {
		return "EmployeeVo [srNo=" + srNo + ", empNo=" + empNo + ", ename=" + ename + ", job=" + job + ", salary="
				+ salary + ", deptNo=" + deptNo + ", mgrNo=" + mgrNo + "]";
	}
	public String getSrNo() {
		return srNo;
	}
	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}
	
}
