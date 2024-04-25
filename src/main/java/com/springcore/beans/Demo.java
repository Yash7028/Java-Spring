package com.springcore.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{15+20}")
	private int x;
	@Value("#{15+48+11}")
	private int y;

//	"ctrl shift + T" to find class
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int z;
//	create object of variable
	@Value("#{ new java.lang.String('Yash Batavle')}")
	private String name;
//	boolean expressions by default value false
	@Value("#{8 > 5}")
	private boolean isActive;

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", isActive=" + isActive + ", name=" + name + "]";
	}

}
