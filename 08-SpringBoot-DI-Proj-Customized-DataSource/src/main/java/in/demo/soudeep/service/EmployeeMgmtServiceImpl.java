package in.demo.soudeep.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.demo.soudeep.bean.EmployeeBo;
import in.demo.soudeep.bean.EmployeeDto;
import in.demo.soudeep.dao.IEmployeeDao;

@Service("service")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeDao dao;
	
	@Override
	public List<EmployeeDto> fetchEmpByDesg(String[] desg) throws Exception {

		System.out.println(dao.getClass().getName());
		
		StringBuilder temp = new StringBuilder("(");
		for(int i=0;i<desg.length;i++) {
			if(i==desg.length-1) {
				temp.append("'"+desg[i]+"')");
			} else {
				temp.append("'"+desg[i]+"', ");
			}
		}
		
		String condition = temp.toString();
		List<EmployeeBo> listBo = dao.fetchEmpByDesg(condition);
		
		List<EmployeeDto> listDto = new ArrayList<>();
		
		listBo.forEach(
				bo -> {
					EmployeeDto dto = new EmployeeDto();
					BeanUtils.copyProperties(bo, dto);
					
					// Extra field srNo
					dto.setSrNo(listDto.size()+1);
					
					listDto.add(dto);
				}
			);
		
		return listDto;
	}

}
