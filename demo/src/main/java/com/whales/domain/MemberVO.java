package com.whales.domain;

public class MemberVO {
	private int uid = 0;
	private String platform;
	private String platform_uid;
	private String platform_name;
	private String login_key;
	private String gcm_id;
	private String created_at;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getPlatform_uid() {
		return platform_uid;
	}
	public void setPlatform_uid(String platform_uid) {
		this.platform_uid = platform_uid;
	}
	public String getPlatform_name() {
		return platform_name;
	}
	public void setPlatform_name(String platform_name) {
		this.platform_name = platform_name;
	}
	public String getLogin_key() {
		return login_key;
	}
	public void setLogin_key(String login_key) {
		this.login_key = login_key;
	}
	public String getGcm_id() {
		return gcm_id;
	}
	public void setGcm_id(String gcm_id) {
		this.gcm_id = gcm_id;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	
	
}
