package in.demo.soudeep.dao;

import java.util.List;

import in.demo.soudeep.bean.EmployeeBo;

public interface IEmployeeDao {
	public List<EmployeeBo> fetchEmpByDesg(String condition) throws Exception;
}
