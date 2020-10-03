package com.travel_agency.config;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Validator {

    public static void validateAvailableDate(String startDate, String endDate) {
        if (isStartDateBiggerThanEndDate(startDate, endDate)) {
            throw new RuntimeException(
                    "Check out date (" + endDate + ") must be greater than the check-in date (" + startDate + ") !");
        }
    }

    public static boolean isStartDateBiggerThanEndDate(String startDate, String endDate)
            throws RuntimeException {
        Date startDateD = null;
        Date endDateD = null;
        try {
            startDateD = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
            endDateD = new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assert startDateD != null;
        return startDateD.after(endDateD);
    }

}
