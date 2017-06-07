/**
 * 
 */
package edu.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Diana Yamaletdinova
 * May 25, 2017
 */
@Controller
public class MappingController {
	
	@RequestMapping("/")
	public void printMapping(){
		System.out.println("Mapping");
	}
}
