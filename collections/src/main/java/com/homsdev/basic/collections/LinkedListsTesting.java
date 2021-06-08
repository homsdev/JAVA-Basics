package com.homsdev.basic.collections;

import java.util.LinkedList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.homsdev.basic.exampleclases.Client;

/*
 * 			COLLECTION LINKED LIST
 * 
 * ++VENTAJAS:
 * 
 * 	Acceso aleatorio
 * 	Estan ordenadas
 * 	Añadir/Remover sin restriccion
 * 	ListIterator modifica en cualquier dirección
 * 	Sintaxis Similar a arrays
 * 
 *++Clases:
 *++++ArrayList (Poco Eficiente)
 *++++LinkedList (Mas eficiente trabaja con nodos)
 *++++Vector
 *++++CopyOnWriteArrayList
 */
public class LinkedListsTesting {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		Logger logger= Logger.getLogger(LinkedListsTesting.class);
		
		Client cl1 = new Client("HomS", "201899323", 20000);
		Client cl2 = new Client("Serah", "2018333002", 15000);
		Client cl3 = new Client("Abnia", "2019777329", 13000);
		Client cl4 = new Client("Nexux", "889777123", 5000);
		Client cl5 = new Client("Nexus", "8897771231", 5000);
		// TODO Auto-generated method stub
		LinkedList<Client> clientsList= new LinkedList<Client>();
		clientsList.add(cl1);
		clientsList.add(cl2);
		clientsList.add(cl3);
		clientsList.add(cl4);
		clientsList.add(cl5);
			
		for(Client client: clientsList) {
			logger.info(client);
		}
	}

}
