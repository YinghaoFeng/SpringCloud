package cn.mldn.microcloud.provider.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
@Configuration
@EnableWebSecurity	// 启用WEB安全配置
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// 定义两个用户的信息，一个是mldnjava/hello、admin/hello
		auth.inMemoryAuthentication().withUser("mldnjava").password("hello").roles("USER").and().withUser("admin")
				.password("hello").roles("USER", "ADMIN");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 进行WEB认证启用，由Spring内部负责实现认证处理机制，所有的访问都需要进行认证处理
		http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated() ; 
		// 采用无状态的形式来定义Session的管理
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) ;
	}
}
