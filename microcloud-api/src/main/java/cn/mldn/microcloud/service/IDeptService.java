package cn.mldn.microcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.mldn.commons.config.FeignClientConfig;
import cn.mldn.microcloud.consumer.fallback.IDeptServiceFallbackFactory;
import cn.mldn.microcloud.vo.Dept;

@FeignClient(value = "MICROCLOUD-PROVIDER-DEPT", configuration = FeignClientConfig.class, fallbackFactory = IDeptServiceFallbackFactory.class)
public interface IDeptService { 
	@RequestMapping(method=RequestMethod.POST,value="/dept/add")
	public boolean add(Dept dept);
	@RequestMapping(method=RequestMethod.GET,value="/dept/get/{deptno}")
	public Dept get(@PathVariable("deptno") Long deptno); 
	@GetMapping("/dept/list")  
	public List<Dept> list();
}
