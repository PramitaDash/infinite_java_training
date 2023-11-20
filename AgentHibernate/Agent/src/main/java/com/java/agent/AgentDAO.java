package com.java.agent;


	import java.sql.SQLException;

	import java.util.List;



	public interface AgentDAO {
		
		List<Agent> showAgentDao() ;
		String addAgentDao(Agent agent) ;
		String searchAgentDao(int AgentID) ;
		String deleteAgentDao(int AgentID) ;
		String updateAgentDao(Agent newagent);
	}





