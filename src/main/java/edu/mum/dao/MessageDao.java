package edu.mum.dao;

import org.springframework.stereotype.Component;

import edu.mum.domain.Messages;
import edu.mum.domain.User;
/**
 * @author Diana Yamaletdinova
 * May 21, 2017
 */
public interface MessageDao extends GenericDao<Messages> {
    
	public Messages findByUserId(String id);

}
