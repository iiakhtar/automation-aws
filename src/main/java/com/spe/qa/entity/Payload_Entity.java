package com.spe.qa.entity;

import java.util.List;
/**
 * @author IAkhtar
 *
 */
public class Payload_Entity {
	String repo_name;
	String branch_name;
	String browser;
	String environment;
	List<String> modules;
	Integer coldstart;
	String reference;
	String tool;
	String base_taskdef;
	String ecr_image_tag;
	public String getRepo_name() {
		return repo_name;
	}
	public void setRepo_name(String repo_name) {
		this.repo_name = repo_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public List<String> getModules() {
		return modules;
	}
	public void setModules(List<String> modules) {
		this.modules = modules;
	}
	public Integer getColdstart() {
		return coldstart;
	}
	public void setColdstart(Integer coldstart) {
		this.coldstart = coldstart;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	public String getBase_taskdef() {
		return base_taskdef;
	}
	public void setBase_taskdef(String base_taskdef) {
		this.base_taskdef = base_taskdef;
	}
	public String getEcr_image_tag() {
		return ecr_image_tag;
	}
	public void setEcr_image_tag(String ecr_image_tag) {
		this.ecr_image_tag = ecr_image_tag;
	}
}
