package in.demo.soudeep.service;

import java.util.List;

import in.demo.soudeep.bean.EmployeeDto;

public interface IEmployeeMgmtService {
	public List<EmployeeDto> fetchEmpByDesg(String[] desg) throws Exception;
}
