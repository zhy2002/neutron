package zhy2002.examples.lodgement.data;


import zhy2002.neutron.data.BigDecimalOption;
import zhy2002.neutron.data.StringOption;
import zhy2002.neutron.util.ValueUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationNodeConstants {
    public static final String SELECTED_INDEX = "selectedIndex";
    public static final String SELECTED_NAME = "selectedName";
    public static final String OPTIONS = "options";
    public static final String FOCUS = "focus";
    public static final String SHOW_ERROR_LIST = "showErrorList";
    public static final String NAME_PATTERN = "^[a-zA-Z]+$";

    public static final List<StringOption> TITLE_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Mr"),
            new StringOption("Mrs"),
            new StringOption("Miss"),
            new StringOption("Ms"),
            new StringOption("Dr"),
            new StringOption("Prof"),
            new StringOption("Rev"),
            new StringOption("Other")
    );

    public static final List<StringOption> COUNTRY_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Australia"),
            new StringOption("China"),
            new StringOption("India"),
            new StringOption("US")
    );

    public static final List<StringOption> GENDER_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Male"),
            new StringOption("Female")
    );

    public static final List<StringOption> APPLICANT_TYPE = Arrays.asList(
            new StringOption("", ""),
            new StringOption("A", "Applicant"),
            new StringOption("G", "Guarantor")
    );

    public static final List<StringOption> APPLICATION_TYPE = Arrays.asList(
            new StringOption("", ""),
            new StringOption("Sole", "Sole"),
            new StringOption("Joint", "Joint"),
            new StringOption("Spouse", "Joint with Spouse")
    );

    public static final List<StringOption> EMPLOYMENT_TYPE = Arrays.asList(
            new StringOption("payeEmployedNode"),
            new StringOption("selfEmployedNode"),
            new StringOption("unemployedNode"),
            new StringOption("retiredEmploymentNode")
    );

    public static final List<StringOption> MARITAL_STATUS = Arrays.asList(
            new StringOption("", ""),
            new StringOption("Single"),
            new StringOption("Married"),
            new StringOption("DeFacto"),
            new StringOption("Separated"),
            new StringOption("Divorced"),
            new StringOption("Widowed")
    );

    public static final List<StringOption> HOUSING_STATUS = Arrays.asList(
            new StringOption(""),
            new StringOption("Renting"),
            new StringOption("Own Home"),
            new StringOption("Own Home Mortgage"),
            new StringOption("Lives with Parents"),
            new StringOption("Boarding"),
            new StringOption("Supplied by Employer"),
            new StringOption("Caravan")
    );

    public static final List<BigDecimalOption> MONTH_TYPE = Arrays.asList(
            new BigDecimalOption(null, ""),
            new BigDecimalOption(new BigDecimal("1"), "January"),
            new BigDecimalOption(new BigDecimal("2"), "February"),
            new BigDecimalOption(new BigDecimal("3"), "March"),
            new BigDecimalOption(new BigDecimal("4"), "April"),
            new BigDecimalOption(new BigDecimal("5"), "May"),
            new BigDecimalOption(new BigDecimal("6"), "June"),
            new BigDecimalOption(new BigDecimal("7"), "July"),
            new BigDecimalOption(new BigDecimal("8"), "August"),
            new BigDecimalOption(new BigDecimal("9"), "September"),
            new BigDecimalOption(new BigDecimal("10"), "October"),
            new BigDecimalOption(new BigDecimal("11"), "November"),
            new BigDecimalOption(new BigDecimal("12"), "December")
    );

    public static List<BigDecimalOption> getYearType() {
        List<BigDecimalOption> result = new ArrayList<>();
        result.add(new BigDecimalOption(null, ""));
        int start = ValueUtil.getCurrentYear();
        for (int i = 0; i < 10; i++) {
            String yearValue = String.valueOf(start - i);
            result.add(new BigDecimalOption(new BigDecimal(yearValue), yearValue));
        }
        return result;
    }

}
