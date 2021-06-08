package com.homsdev.basic.collections;

import java.util.HashSet;
import java.util.Set;



import com.homsdev.basic.exampleclases.Client;


/*
 * COLLECTION SET (HashSet,LinkedHashSet,TreeSet,EnumSet,CopyOnWriteSet,ConcurringSkipistSet) 
 * Ventajas:
 * +No duplicados
 * Desventajas
 * +Baja eficiencia al ordenar
 * +No acceso Aleatorio
*/

public class SetsTestingJAVA {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client cl1 = new Client("HomS", "201899323", 20000);
		Client cl2 = new Client("Serah", "2018333002", 15000);
		Client cl3 = new Client("Abnia", "2019777329", 13000);
		Client cl4 = new Client("Nexux", "889777123", 5000);

		/*
		 * HashSet No ordenacion No acceso aleatorio
		 */

		Set<Client> clientsSet = new HashSet<Client>();
		clientsSet.add(cl1);
		clientsSet.add(cl2);
		clientsSet.add(cl3);
		clientsSet.add(cl4);
		
		for (Client client : clientsSet) {
			System.out.println(client);
		}
		
	}

}
