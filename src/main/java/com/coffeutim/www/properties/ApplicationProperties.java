package com.coffeutim.www.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:application.properties")
@ConfigurationProperties("security")
public class ApplicationProperties {
	
	private String filterOrder;
	private String signingKey;
	private String encodingStrength;
	private String clientId;
	private String clientSecret;
	private String grantType;
	private String scopeRead;
	private String scopeWrite;
	private String resourceIds;
	
	public String getFilterOrder() {
		return filterOrder;
	}
	public void setFilterOrder(String filterOrder) {
		this.filterOrder = filterOrder;
	}
	public String getSigningKey() {
		return signingKey;
	}
	public void setSigningKey(String signingKey) {
		this.signingKey = signingKey;
	}
	public String getEncodingStrength() {
		return encodingStrength;
	}
	public void setEncodingStrength(String encodingStrength) {
		this.encodingStrength = encodingStrength;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	public String getGrantType() {
		return grantType;
	}
	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}
	public String getScopeRead() {
		return scopeRead;
	}
	public void setScopeRead(String scopeRead) {
		this.scopeRead = scopeRead;
	}
	public String getScopeWrite() {
		return scopeWrite;
	}
	public void setScopeWrite(String scopeWrite) {
		this.scopeWrite = scopeWrite;
	}
	public String getResourceIds() {
		return resourceIds;
	}
	public void setResourceIds(String resourceIds) {
		this.resourceIds = resourceIds;
	}
	
}
