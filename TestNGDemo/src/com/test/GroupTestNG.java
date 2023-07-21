package com.test;

import org.testng.annotations.Test;

public class GroupTestNG {

	@Test(groups = { "red" })
	public void red1() {
		System.out.println("red1");
	}
	@Test(groups = { "red" })
	public void red2() {
		System.out.println("red2");
	}
	@Test(groups = { "red" })
	public void red3() {
		System.out.println("red3");
	}
	
	@Test(groups = { "green" })
	public void green1() {
		System.out.println("green1");
	}
	@Test(groups = { "green" })
	public void green2() {
		System.out.println("green2");
	}
	@Test(groups = { "green" })
	public void green3() {
		System.out.println("green3");
	}
	
	@Test(groups = { "green","red" })
	public void green_red() {
		System.out.println("green_red");
	}

}
