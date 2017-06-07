/**
 *
 */
package edu.mum.service.impl;

import edu.mum.dao.MessageDao;
import edu.mum.domain.Messages;
import edu.mum.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Diana Yamaletdinova
 *         May 22, 2017
 */
@Service
@Transactional
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageDao messageDao;

    @Override
    public void save(Messages msg) {
        messageDao.save(msg);
    }

    @Override
    public List<Messages> findByUserId(Long id) {
        List<Messages> all = findAll();
        all.removeIf(next -> !next.getReceiverids().contains(id));
        return all;
    }


    @Override
    public Messages update(Messages msgToBeAdded) {
        return messageDao.update(msgToBeAdded);
    }

    @Override
    public List<Messages> findAll() {
        return (List<Messages>) messageDao.findAll();
    }

}
