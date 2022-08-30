package com.quynh.dateprocessing;

import java.time.DayOfWeek;
import java.time.Month;

public class Example1 {
    public static void main(String[] args) {
        final DayOfWeek sunday = DayOfWeek.SUNDAY;
        final Month february = Month.FEBRUARY;

        System.out.println(sunday.plus(5));
        System.out.println(february.plus(13));
    }
}
