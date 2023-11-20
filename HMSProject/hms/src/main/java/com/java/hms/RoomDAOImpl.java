package com.java.hms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RoomDAOImpl implements RoomDAO{
	SessionFactory sf;
	Session session;

	@Override
	public List<Room> showRoomDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Room.class);
		List<Room> RoomList = criteria.list();
		return RoomList;
	
	}




}
