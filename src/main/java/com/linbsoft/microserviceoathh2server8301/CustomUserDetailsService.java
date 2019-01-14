package com.linbsoft.microserviceoathh2server8301;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
			
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 System.out.println("当前的用户名是："+username);
	        //这里为了方便测试，就直接返回一个用户信息，实际当中这里修改为查询数据库或者调用服务什么的来获取用户信息
           //根据登录名 到数据库取出用户信息
		 User user = mockUser();
			 return user;
	}		
	// BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	private User mockUser() {
		Collection<GrantedAuthority> authorities = new HashSet<>();
		authorities.add(new SimpleGrantedAuthority("admin-role"));//用户所拥有的角色信息
		User user = new User("admin",new BCryptPasswordEncoder().encode("123456"),authorities);
	//	User user = new User("admin","12345",authorities);
		return user;
		}
}