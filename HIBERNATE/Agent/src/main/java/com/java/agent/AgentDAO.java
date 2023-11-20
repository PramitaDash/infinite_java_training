package com.java.agent;

import java.util.List;

import com.java.agent.Agent;
import com.java.agent.Agent;

public interface AgentDAO {
	
	List<Agent> showAgentDao();
	String addAgentDao(Agent agent);
	Agent searchAgentDao(int AgentID);
	List<Agent> showAgentCr();
	Agent searchAgentCr(int AgentID);

}