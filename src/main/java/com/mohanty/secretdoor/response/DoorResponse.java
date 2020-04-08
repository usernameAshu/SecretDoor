package com.mohanty.secretdoor.response;

import lombok.Data;

@Data
public class DoorResponse {

	private String doorMessage ;
	private String responsePassCode ;
	private String responseCodeDesc ;
	private DoorResponseCode resposneCode ;
	private String source = "DoorResponse Class";
	
	public DoorResponse(String doorMessage, DoorResponseCode resposneCode) {
		this.doorMessage = doorMessage;
		this.responsePassCode = resposneCode.getPasscode();
		this.responseCodeDesc = resposneCode.getDescription();
		this.resposneCode = resposneCode;
	}
	
	
	
}
