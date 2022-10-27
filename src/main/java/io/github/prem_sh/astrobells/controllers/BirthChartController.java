package io.github.prem_sh.astrobells.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/birthchart")
public class BirthChartController {
	@ApiOperation(value = "Returns Generated Birthchart if exists, else it will generate the birth chart and return it", notes = "${BirthChartController.getBirthChart.notes}")
	@GetMapping("/{userId}")
	public String getBirthChart(@PathVariable Long userId) {
		return "this is your birth chart";
	}
	
	@GetMapping("/regenerate/{userId}")
	@ApiOperation(value = "It will regenerate birthchart from user details (usually after user data update)", notes = "${BirthChartController.regenerateBirthChart.notes}")
	public String regenerateBirthChart(@PathVariable Long userId) {
		return "this is your regenerated birth chart";
	}
}
