package com.chapter_5;

public class SwitchExpressions {

    public static void main(String[] args) {
        var dealStage = Stage.INTERESTED;
        var amount = 8;

        var forecastedAmount = amount * switch (dealStage) {
            case LEAD -> 0.2;
            case EVALUATING -> 0.5;
            case INTERESTED -> 0.8;
            case CLOSED -> 1;
        };

        System.out.println(forecastedAmount);
    }
}
