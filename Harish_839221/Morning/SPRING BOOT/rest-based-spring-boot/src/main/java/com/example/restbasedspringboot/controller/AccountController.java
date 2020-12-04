package com.example.restbasedspringboot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restbasedspringboot.model.Account;

@RestController
@RequestMapping("/api")
public class AccountController {

	@RequestMapping(method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public Account getBalance() {
		Account account = new Account();
		account.setAccno(12345);
		account.setAmount(500000);
		return account;
	}
	@GetMapping(value="{accountNo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getBalance(@PathVariable("accountNo") int accountNo) {
		System.out.println("GET");
		Account account = new Account();
		account.setAccno(accountNo);
		account.setAmount(new Double(Math.random() * accountNo).doubleValue());
		return account;
	}

	@PostMapping(value="{accountNo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getBalance2(@PathVariable("accountNo") int accountNo) {
		System.out.println("POST");
		Account account = new Account();
		account.setAccno(accountNo);
		account.setAmount(new Double(Math.random() * accountNo).doubleValue());
		return account;
	}

	@PutMapping(value="{accountNo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getBalance3(@PathVariable("accountNo") int accountNo) {
		System.out.println("PUT");
		Account account = new Account();
		account.setAccno(accountNo);
		account.setAmount(new Double(Math.random() * accountNo).doubleValue());
		return account;
	}
	
	@DeleteMapping(value="{accountNo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getBalance4(@PathVariable("accountNo") int accountNo) {
		System.out.println("DELETE");
		Account account = new Account();
		account.setAccno(accountNo);
		account.setAmount(new Double(Math.random() * accountNo).doubleValue());
		return account;
	}
}
