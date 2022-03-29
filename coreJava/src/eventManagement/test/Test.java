package eventManagement.test;

import eventManagement.Event;
import eventManagement.Organizer;
import eventManagement.manager.EventManagementImpl2;
import eventManagement.manager.EventManager;
import eventManagement.manager.EventManagerImpl;

public class Test {

	public static void main(String[] args) {

		Organizer organizer = new Organizer();
		organizer.setId(1235);
		organizer.setName("vijay");
		System.out.println(organizer);
		System.out.println();
		System.out.println(organizer.getName());
		System.out.println();

		Event event = new Event(12, "Iphone 100 launch", "Grand Launch");
		System.out.println(event.getDescription());

		EventManager em = new EventManagementImpl2();
		System.out.println(em.create(325).getName());


		
	}

}
