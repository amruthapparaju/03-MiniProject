package com.miniproject.three.dto;

public class StateDTO {
	
	
	private int StateId;
	
	private String StateName;
	

	public int getStateId() {
		return StateId;
	}

	public void setStateId(int stateId) {
		StateId = stateId;
	}

	public String getStateName() {
		return StateName;
	}

	public void setStateName(String stateName) {
		StateName = stateName;
	}

	@Override
	public String toString() {
	
				return " " + StateName + "";

	}
	
	

}
