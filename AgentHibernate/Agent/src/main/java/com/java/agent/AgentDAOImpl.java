package com.java.agent;

import java.util.List;

import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class AgentDAOImpl implements AgentDAO{
	
	SessionFactory sf;
	Session session;
	
	public List<Agent> showEmployCr() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Agent.class);
		cr.addOrder(Order.asc("Premium"));
		List<Agent> AgentList = cr.list();
		return AgentList;
	}
	
	public Agent searchEmployCr(int AgentId) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Agent.class);
		cr.add(Restrictions.eq("AgentID", AgentId));
		Agent agent = (Agent)cr.uniqueResult();
		return agent;
	}

	@Override
	public List<Agent> showAgentDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Query query = session.createQuery("from Agent");
		List<Agent> AgentList = query.list();
		return AgentList;
		
		
	}

	@Override
	public String addAgentDao(Agent agent) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(agent);
		trans.commit();
		return "UpdateAgent.xhtml?faces-redirect=true";
	}
	
	@Override
	public String searchAgentDao(int AgentID) {
		Map<String, Object> sessionMap=
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
				sf = SessionHelper.getConnection();
				session = sf.openSession();
				Query query = session.createQuery("from Agent where AgentId="+AgentID);
				List<Agent> agentList = query.list();
				Agent agent = agentList.get(0);
				sessionMap.put("editAgent", agent);
				
				
				return "UpdateAgent.xhtml?faces-redirect=true";
	}

	@Override
	public String deleteAgentDao(int AgentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAgentDao(Agent newagent) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.update(newagent);
		trans.commit();
		return "AgentShow.xhtml?facs-redirect=true";
	}

}