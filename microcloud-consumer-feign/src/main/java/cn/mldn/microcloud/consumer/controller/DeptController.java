package cn.mldn.microcloud.consumer.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.mldn.microcloud.service.IDeptService;
import cn.mldn.microcloud.vo.Dept;

@RestController
public class DeptController {
	@Resource
	private IDeptService deptService ;

	@GetMapping("/consumer/dept/list")
	public Object listDeptRest() {
		return this.deptService.list();
	}

	@GetMapping("/consumer/dept/get")
	public Object getDeptRest(long deptno) {
		return this.deptService.get(deptno);
	}

	@GetMapping("/consumer/dept/add")
	public boolean addDeptRest(Dept dept) {
		return this.deptService.add(dept); 
	}
}
