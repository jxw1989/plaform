package com.csair.common.type;

public enum Status {
	OK("1", "成功"), Fail("401", "失败");
	String value;
	String name;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Status(String value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public String toString()
	{
		return name;
	}
	
	
}
