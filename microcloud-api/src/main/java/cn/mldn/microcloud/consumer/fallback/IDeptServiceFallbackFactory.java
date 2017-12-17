package cn.mldn.microcloud.consumer.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cn.mldn.microcloud.service.IDeptService;
import cn.mldn.microcloud.vo.Dept;
import feign.hystrix.FallbackFactory;
@Component
public class IDeptServiceFallbackFactory implements FallbackFactory<IDeptService> {

	@Override
	public IDeptService create(Throwable exception) {
		return new IDeptService() {

			@Override
			public boolean add(Dept dept) {
				return false;
			}

			@Override
			public Dept get(Long deptno) {
				Dept vo = new Dept() ;
				vo.setDeptno(-1L);
				vo.setDname("错误的名称");
				vo.setLoc("错误的位置");
				return vo;
			}

			@Override
			public List<Dept> list() {
				return new ArrayList<Dept>() ;
			}};
	}

}
