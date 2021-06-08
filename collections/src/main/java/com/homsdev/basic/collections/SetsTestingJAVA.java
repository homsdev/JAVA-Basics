package com.homsdev.basic.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.homsdev.basic.exampleclases.Client;


/*
 * COLLECTION SET (HashSet,LinkedHashSet,TreeSet,EnumSet,CopyOnWriteSet,ConcurringSkipistSet) 
 * Ventajas:
 * +No admite objetos duplicados usa Equals
 * Desventajas
 * +Baja eficiencia al ordenar
 * +No acceso Aleatorio
*/

public class SetsTestingJAVA {

	
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Logger logger= Logger.getLogger(SetsTestingJAVA.class);
		// TODO Auto-generated method stub
		Client cl1 = new Client("HomS", "201899323", 20000);
		Client cl2 = new Client("Serah", "2018333002", 15000);
		Client cl3 = new Client("Abnia", "2019777329", 13000);
		Client cl4 = new Client("Nexux", "889777123", 5000);
		Client cl5 = new Client("Nexus", "8897771231", 5000);

		/*
		 * HashSet No ordenacion No acceso aleatorio
		 */

		Set<Client> clientsSet = new HashSet<Client>();
		clientsSet.add(cl1);
		clientsSet.add(cl2);
		clientsSet.add(cl3);
		clientsSet.add(cl4);
		clientsSet.add(cl5);
		

		/* 
		 * Iterar sobre collecciones
		 * +hasNext() verifica que hay un objeto a continuación
		 * +next() avanza al siguiente elemento
		 * +remueve el elemento
		 */
		
		Iterator<Client> it= clientsSet.iterator();
		
		while(it.hasNext()) {
			if(it.next().getName().equals("Nexux")) {
				it.remove();
			}	
		}
		
		for(Client client : clientsSet) {
			logger.info(client);
		}
		
	}

}
