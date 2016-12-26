package zhy2002.examples.lodgement.data;


import zhy2002.neutron.data.SelectOption;

import java.util.Arrays;
import java.util.List;

public class ApplicationNodeConstants {
    public static final String SELECTED_INDEX = "selectedIndex";
    public static final String OPTIONS = "options";

    public static final List<SelectOption> APPLICANT_TYPE = Arrays.asList(
            new SelectOption("", ""),
            new SelectOption("A", "Applicant"),
            new SelectOption("G", "Guarantor")
    );

    public static final List<SelectOption> APPLICATION_TYPE = Arrays.asList(
            new SelectOption("", ""),
            new SelectOption("Sole", "Sole"),
            new SelectOption("Joint", "Joint"),
            new SelectOption("Spouse", "Joint with Spouse")
    );

    public static final List<SelectOption> MARITAL_STATUS = Arrays.asList(
            new SelectOption("", ""),
            new SelectOption("Single"),
            new SelectOption("Married"),
            new SelectOption("DeFacto"),
            new SelectOption("Separated"),
            new SelectOption("Divorced"),
            new SelectOption("Widowed")
    );

    public static final List<SelectOption> HOUSING_STATUS = Arrays.asList(
            new SelectOption(""),
            new SelectOption("Renting"),
            new SelectOption("Own Home"),
            new SelectOption("Own Home Mortgage"),
            new SelectOption("Lives with Parents"),
            new SelectOption("Boarding"),
            new SelectOption("Supplied by Employer"),
            new SelectOption("Caravan")
    );

}
