package com.sandboxworms.doby.model;

import java.time.LocalDate;

public class DateInterval {
	
    private LocalDate startDate;
    private LocalDate endDate;
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
    
    

}
