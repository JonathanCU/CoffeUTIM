package com.coffeutim.www.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

import com.coffeutim.www.properties.ApplicationProperties;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter{
	@Autowired
	private ResourceServerTokenServices tokenServices;
	
	@Autowired
	private ApplicationProperties applicationProperties;
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
	    resources.resourceId("testjwtresourceid").tokenServices(tokenServices);
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
	            http
	            .requestMatchers()
	            .and()
	            .authorizeRequests()
	            .antMatchers("/", "/home", "/resource").permitAll()
	            .antMatchers("/user/**", "/admin/**","/products/**").authenticated();
	}
}
