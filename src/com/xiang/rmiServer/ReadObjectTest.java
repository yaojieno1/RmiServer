package com.xiang.rmiServer;

import java.io.*;

public class ReadObjectTest {

	public static void main (String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("payload.txt")));
		in.readObject();
	}
}
