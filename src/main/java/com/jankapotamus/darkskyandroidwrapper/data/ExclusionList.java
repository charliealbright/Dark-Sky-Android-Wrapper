package com.jankapotamus.darkskyandroidwrapper.data;

/**
 * Created by Charlie on 10/22/16.
 */

public class ExclusionList {

    public Exclusion[] exclusions;

    public ExclusionList(Exclusion...exclusions) {
        this.exclusions = exclusions;
    }

    @Override
    public String toString() {
        String returnString = "";
        for (Exclusion exclusion : exclusions) {
            returnString += exclusion.toString() + ",";
        }
        // Remove last comma
        returnString = returnString.substring(0, returnString.length()-1);
        return returnString;

    }

    public enum Exclusion {
        CURRENTLY("currently"),
        MINUTELY("minutely"),
        HOURLY("hourly"),
        DAILY("daily"),
        ALERTS("alerts"),
        FLAGS("flags");

        private String text;

        Exclusion(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }
}
