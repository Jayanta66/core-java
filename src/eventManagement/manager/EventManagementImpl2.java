package eventManagement.manager;

import eventManagement.Event;

public class EventManagementImpl2 implements EventManager {

	@Override
	public Event create(long id) {
 		return new Event(id,"Mac Book Launch","New Generation of Mac Books Launch");
	}

}
