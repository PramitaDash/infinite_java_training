package com.java.hms;

public class Room {
	
	private String room_no;
	private String room_type;
	public String getRoom_no() {
		return room_no;
	}
	public void setRoom_no(String room_no) {
		this.room_no = room_no;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public Room(String room_no, String room_type) {
		super();
		this.room_no = room_no;
		this.room_type = room_type;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
