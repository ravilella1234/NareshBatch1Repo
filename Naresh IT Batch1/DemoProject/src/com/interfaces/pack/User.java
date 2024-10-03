package com.interfaces.pack;

public class User 
{

	public static void main(String[] args) 
	{
		Lenovo l = new Lenovo();
		l.copy();
		l.paste();
		l.camera();
		l.security();
		
		Laptop.audio();
		
		HP h = new HP();
		h.printing();
		h.security();
		
		//until java 7

	}

}
