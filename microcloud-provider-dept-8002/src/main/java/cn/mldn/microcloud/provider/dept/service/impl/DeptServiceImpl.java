package cn.mldn.microcloud.provider.dept.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.microcloud.provider.dept.dao.IDeptDAO;
import cn.mldn.microcloud.service.IDeptService;
import cn.mldn.microcloud.vo.Dept;
@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDAO deptDAO ;
	@Override
	public boolean add(Dept dept) {
		return this.deptDAO.doCreate(dept);
	}

	@Override
	public Dept get(Long deptno) {
		return this.deptDAO.findById(deptno);
	}

	@Override
	public List<Dept> list() {
		return this.deptDAO.findAll(); 
	}

}
