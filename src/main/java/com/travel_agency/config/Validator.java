package com.travel_agency.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validator {
    public void validateAvailableDate(String startDate, String endDate) {
        if (isStartDateBiggerThanEndDate(startDate, endDate)) {
            throw new RuntimeException(
                    "Check out date (" + endDate + ") must be greater than the check-in date (" + startDate + ") !");
        }
    }

    public void validateDateForStatistic(String startDate, String endDate) {
        if (isStartDateBiggerThanEndDate(startDate, endDate)) {
            throw new RuntimeException(
                    "End date ("
                            + endDate
                            + ")of statistics should be less than start date ("
                            + startDate
                            + ") !");
        }
    }

    public boolean isStartDateBiggerThanEndDate(String startDate, String endDate)
            throws RuntimeException {
        Date startDateD = null;
        Date endDateD = null;

        try {
            startDateD = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
            endDateD = new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return startDateD.after(endDateD);
    }
}
