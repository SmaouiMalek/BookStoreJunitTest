package org.polytec.vermeg.controller;


import java.util.List;

import org.polytec.vermeg.mapping.Commande;
import org.polytec.vermeg.model.Book;

import org.polytec.vermeg.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
	@RestController
	@RequestMapping("/commande")
public class CommandeController {

		@Autowired
		CommandeService commandeService;
		
		
	
		
		@RequestMapping(value = "/getSommeTotal", method = RequestMethod.POST, produces = "application/json")
		
			public double getSommeTotal(@RequestBody Commande commande) {
				return commandeService.getSommeTotal(commande);
		}
		
		}
