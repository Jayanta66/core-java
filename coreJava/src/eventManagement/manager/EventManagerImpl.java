package eventManagement.manager;

import eventManagement.Event;

public class EventManagerImpl implements EventManager {

	@Override
	public Event create(long id) {

		return new Event(id, null, null);
		
	}

}
