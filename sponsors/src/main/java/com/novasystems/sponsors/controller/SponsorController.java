package com.novasystems.sponsors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.novasystems.sponsors.service.SponsorService;

@Controller
public class SponsorController {
	
	@Autowired
	public SponsorService SponsorService;
	
	@GetMapping("/sponsor/{id}")
    public String getSponsor(@PathVariable("id") String sponsorId) {
        return "home";
    }

}
