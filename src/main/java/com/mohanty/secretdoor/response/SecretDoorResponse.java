package com.mohanty.secretdoor.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecretDoorResponse {

	String message;
	private DoorResponseCode responseCode ;

	public ResponseEntity<DoorResponse> createResponse(String message , DoorResponseCode code) {
		
		return new ResponseEntity<>( new DoorResponse(message, code) , HttpStatus.OK) ;
	}

}
