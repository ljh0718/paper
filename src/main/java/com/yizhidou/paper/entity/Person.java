package com.yizhidou.paper.entity;


import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * 用户实体类
 */
@ApiModel(value="用户对象模型")
public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer pid;
	private String username;
	private String password;
	private Integer age;
	private String gender;
	private String tel;
	private String email;
	private String qq;
	private Integer departmentId;

	@Override
	public String toString() {
		return "Person{" +
				"pid=" + pid +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				", tel='" + tel + '\'' +
				", email='" + email + '\'' +
				", qq='" + qq + '\'' +
				", departmentId=" + departmentId +
				'}';
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
}

