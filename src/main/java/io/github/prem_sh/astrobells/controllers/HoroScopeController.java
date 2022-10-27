package io.github.prem_sh.astrobells.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.prem_sh.astrobells.dto.PredictionContentDto;


@RestController
@RequestMapping("/horoscope")
public class HoroScopeController {
	
	@GetMapping("/daily/moon-sign/today/{moonSign}")
	public ResponseEntity<PredictionContentDto> getMoonSignToday(@PathVariable String moonSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/daily/moon-sign/tomorrow/{moonSign}")
	public ResponseEntity<PredictionContentDto> getMoonSignTomorrow(@PathVariable String moonSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/daily/sun-sign/today/{sunSign}")
	public ResponseEntity<PredictionContentDto> getSunSignToday(@PathVariable String sunSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/daily/sun-sign/tomorrow/{sunSign}")
	public ResponseEntity<PredictionContentDto> getSunSignTomorrow(@PathVariable String sunSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/daily/personalized/today/{userId}")
	public ResponseEntity<PredictionContentDto> getPersonalizedToday (@PathVariable Long userId){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/daily/personalized/tomorrow/{userId}")
	public ResponseEntity<PredictionContentDto> getPersonalizedTomorrow(@PathVariable Long userId){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}

	@GetMapping("/weekly/moon-sign/current/{moonSign}")
	public ResponseEntity<PredictionContentDto> getMoonSignThisWeek(@PathVariable String moonSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/weekly/moon-sign/nextweek/{moonSign}")
	public ResponseEntity<PredictionContentDto> getMoonSignNextWeek(@PathVariable String moonSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/weekly/sun-sign/current/{sunSign}")
	public ResponseEntity<PredictionContentDto> getSunSignThisWeek(@PathVariable String sunSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/weekly/sun-sign/nextweek/{sunSign}")
	public ResponseEntity<PredictionContentDto> getSunSignNextWeek(@PathVariable String sunSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/weekly/personalized/current/{userId}")
	public ResponseEntity<PredictionContentDto> getPersonalizedThisWeek(@PathVariable Long userId){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/weekly/personalized/nextweek/{userId}")
	public ResponseEntity<PredictionContentDto> getPersonalizedNextWeek(@PathVariable Long userId){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/monthly/moon-sign/current/{moonSign}")
	public ResponseEntity<PredictionContentDto> getMoonSignCurrentMonth(@PathVariable String moonSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/monthly/moon-sign/nextmonth/{moonSign}")
	public ResponseEntity<PredictionContentDto> getMoonSignNextMonth(@PathVariable String moonSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/monthly/sun-sign/current/{sunSign}")
	public ResponseEntity<PredictionContentDto> getSunSignCurrentMonth(@PathVariable String sunSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/monthly/sun-sign/nextmonth/{sunSign}")
	public ResponseEntity<PredictionContentDto> getSunSignNextMonth(@PathVariable String sunSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/monthly/personalized/current/{userId}")
	public ResponseEntity<PredictionContentDto> getPersonalizedCurrentMonth (@PathVariable Long userId){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/monthly/personalized/nextmonth/{userId}")
	public ResponseEntity<PredictionContentDto> getPersonalizedNextMonth(@PathVariable Long userId){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}

	@GetMapping("/annual/moon-sign/current/{moonSign}")
	public ResponseEntity<PredictionContentDto> getMoonSignCurrentYear(@PathVariable String moonSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/annual/moon-sign/nextyear/{moonSign}")
	public ResponseEntity<PredictionContentDto> getMoonSignNextYear(@PathVariable String moonSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/annual/sun-sign/current/{sunSign}")
	public ResponseEntity<PredictionContentDto> getSunSignCurrentYear(@PathVariable String sunSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/annual/sun-sign/nextyear/{sunSign}")
	public ResponseEntity<PredictionContentDto> getSunSignNextYear(@PathVariable String sunSign){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/annual/personalized/current/{userId}")
	public ResponseEntity<PredictionContentDto> getPersonalizedCurrentYear (@PathVariable Long userId){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/annual/personalized/nextyear/{userId}")
	public ResponseEntity<PredictionContentDto> getPersonalizedNextYear(@PathVariable Long userId){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}

	@GetMapping("/transit-prediction/moon-sign/{title}")
	public ResponseEntity<PredictionContentDto> getMoonSignTransit(@PathVariable String title){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/transit-prediction/sun-sign/{title}")
	public ResponseEntity<PredictionContentDto> getSunSignTransit(@PathVariable String title){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
	@GetMapping("/transit-prediction/personalized/{title}")
	public ResponseEntity<PredictionContentDto> getPersonalizedTransit(@PathVariable String title){
		PredictionContentDto content = new PredictionContentDto();
		return new ResponseEntity<PredictionContentDto>(content, HttpStatus.OK);
	}
}
