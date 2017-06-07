package edu.mum.controller;

import edu.mum.domain.Messages;
import edu.mum.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LogHistoryRestController {
    private final MessageService messageService;

    @Autowired
    public LogHistoryRestController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public ResponseEntity<List<Messages>> postLogin() {
        List<Messages> data = messageService.findAll();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @RequestMapping(value = "/message/{id}", method = RequestMethod.GET)
    public ResponseEntity<List<Messages>> getUsersMessages(@PathVariable(value = "id") Long id) {
        List<Messages> data = messageService.findByUserId(id);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
