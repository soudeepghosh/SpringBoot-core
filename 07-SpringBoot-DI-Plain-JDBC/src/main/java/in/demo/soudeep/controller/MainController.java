package in.demo.soudeep.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.demo.soudeep.bean.EmployeeDto;
import in.demo.soudeep.bean.EmployeeVo;
import in.demo.soudeep.service.IEmployeeMgmtService;

@Component("controller")
public class MainController {
	
	@Autowired
	private IEmployeeMgmtService service;
	
	public List<EmployeeVo> showEmpByDesg(String[] desg) throws Exception{
		List<EmployeeDto> listDto = service.fetchEmpByDesg(desg);
		List<EmployeeVo> listVo = new ArrayList<>();
		
		/*
		for(int i=0;i<listDto.size();i++) {
			EmployeeDto dto = listDto.get(i);
			
			EmployeeVo vo = new EmployeeVo();
			vo.setEmpNo(String.valueOf(dto.getEmpNo()));
			vo.setEname(String.valueOf(dto.getEname()));
			vo.setJob(String.valueOf(dto.getJob()));
			vo.setSalary(String.valueOf(dto.getSalary().toString()));
			vo.setDeptNo(String.valueOf(dto.getDeptNo().toString()));
			vo.setMgrNo(String.valueOf(dto.getMgrNo().toString()));
			vo.setSrNo(String.valueOf(dto.getSrNo()));
			
			listVo.add(vo);
		}
		*/
		
		listDto.forEach(
				dto -> {
					EmployeeVo vo = new EmployeeVo();
					
					// copy such properties whose datatypes and fieldnames should be  same
					BeanUtils.copyProperties(dto, vo);
					
					// setting the properties whose datatypes are not same
					vo.setSrNo(String.valueOf(dto.getSrNo()));
					vo.setEmpNo(String.valueOf(dto.getEmpNo()));
					vo.setSalary(String.valueOf(dto.getSalary().toString()));
					vo.setDeptNo(String.valueOf(dto.getDeptNo().toString()));
					vo.setMgrNo(String.valueOf(dto.getMgrNo().toString()));
					
					// keep in list object
					listVo.add(vo);
				}
			);
		
		return listVo;
	}
}
