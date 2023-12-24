package com.springcore.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{11+12}")
 private int x;
	@Value("#{23+45}")
 private int y;

@Value("#{T(java.lang.Math).sqrt(25)}")	
private double z;

@Value("#{T(java.lang.Math).E}")
private double e;

@Value("#{new java.lang.String('Ravi')}")
private String Name;

@Value("#{8>5}")
private boolean isActive;

public double getE() {
	return e;
}
public void setE(double e) {
	this.e = e;
}
public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
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
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", Name=" + Name + ", isActive=" + isActive + "]";
}



}

