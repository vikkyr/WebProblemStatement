package com.project.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@RestController
@RequestMapping("/api/numberoperations")
@Consumes("application/json")
@Produces("application/json")
public interface ProblemStatements {

	@POST
	Response getSumAndAverage(String[] arr);

}
