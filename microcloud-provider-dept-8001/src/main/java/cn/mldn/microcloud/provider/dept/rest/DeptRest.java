package cn.mldn.microcloud.provider.dept.rest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import cn.mldn.microcloud.service.IDeptService;
import cn.mldn.microcloud.vo.Dept;

@RestController
@Controller
public class DeptRest {
	@Resource
	private IDeptService deptService ;
	@Resource
	private DiscoveryClient client ;
	@GetMapping("/dept/discovery")
	public Object discovery() {
		return this.client ;
	}
	@GetMapping("/dept/sessionId")
	public Object sessionId(HttpServletRequest request) {
		return request.getSession().getId() ;
	}
	
	@PostMapping("/dept/add")
	public Object add(@RequestBody Dept dept) {
		return this.deptService.add(dept) ;
	} 
	@GetMapping("/dept/list")
	public Object list() {
		return this.deptService.list() ;
	}
//	@PostMapping("/dept/get")
//	public Object get(@RequestBody long deptno) {
//		return this.deptService.get(deptno) ;  
//	}
	@GetMapping("/dept/get/{deptno}")
		public Object get(@PathVariable("deptno") long deptno) {
			Dept dept = this.deptService.get(deptno) ;
			if (dept == null) {
				throw new RuntimeException("****** 【没有该部门信息，强制性抛出异常！】 ******") ;
			}
			return dept ; 
	}
}
