package com.dcs.edu;

public class Launch {
	public static void main(String[] args) {
		Parent p=new Parent();
		Child c=new Child();
		p.main();
		c.test();
		c.main();
	}

}
