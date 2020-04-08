package com.mohanty.secretdoor.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DoorResponseCode {

	
	DOOR_VIP_CODE("La Casa", "VIP memeber only door" ) ,
	DOOR_GENERAL_CODE("Nathula Pass", "GeneraL memeber only door" ) ;
	
	private String passcode ;
	private String description ;
}
