package zhy2002.examples.lodgement.data;


import zhy2002.neutron.data.BigDecimalOption;
import zhy2002.neutron.data.StringOption;
import zhy2002.neutron.util.ValueUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationNodeConstants {
    public static final String OPTIONS = "options";
    public static final String REF = "ref";
    public static final String TOTAL_OWNERSHIP = "total_ownership";
    public static final String CURRENCY_INFO = "currency_info";
    public static final String SUFFIX_SYMBOL = "suffix_symbol";
    public static final String CURRENT_RECORD = "current_record";
    public static final String FOCUS = "focus";
    public static final String MIN_AGE = "min_age";
    public static final String MAX_AGE = "max_age";
    public static final String SHOW_ERROR_LIST = "showErrorList";
    public static final String CONTENT_LEVEL = "contentLevel";
    public static final String NAME_PATTERN = "^[a-zA-Z]+$";

    public static final CurrencyInfo AUD = new CurrencyInfo("AUD", "$");

    public static final UnitSymbol PERCENTAGE = new UnitSymbol("Percentage", "%");

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

    public static final List<StringOption> OTHER_ASSET_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Home Contents"),
            new StringOption("Superannuation"),
            new StringOption("Good Will of Business"),
            new StringOption("Other")
    );

    public static final List<StringOption> EXPENSE_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Ongoing Rent"),
            new StringOption("Household Basic"),
            new StringOption("Family Maintenance"),
            new StringOption("Education Expenses"),
            new StringOption("Insurance"),
            new StringOption("Media"),
            new StringOption("Groceries"),
            new StringOption("Entertainment"),
            new StringOption("Medical"),
            new StringOption("Transport"),
            new StringOption("Other")
    );

    public static final List<StringOption> LIABILITY_LOAN_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Hire Purchase"),
            new StringOption("Lease"),
            new StringOption("Line of Credit"),
            new StringOption("Loan as Guarantor"),
            new StringOption("Other Loan"),
            new StringOption("Overdraft"),
            new StringOption("Personal Loan"),
            new StringOption("Term Loan")
    );

    public static final List<StringOption> GENDER_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Male"),
            new StringOption("Female")
    );

    public static final List<StringOption> SAVINGS_ACCOUNT_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Savings Account"),
            new StringOption("Term Deposit")
    );

    public static final List<StringOption> OTHER_LIABILITY_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Commercial Bill"),
            new StringOption("Contingent Liability"),
            new StringOption("HECS"),
            new StringOption("Maintenance"),
            new StringOption("Other")
    );

    public static final List<StringOption> CREDIT_CARD_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Credit Card"),
            new StringOption("Store Card")
    );

    public static final List<StringOption> APPLICANT_TYPE = Arrays.asList(
            new StringOption("", ""),
            new StringOption("A", "Applicant"),
            new StringOption("G", "Guarantor")
    );

    public static final List<StringOption> AUSTRALIAN_STATES = Arrays.asList(
            new StringOption("", ""),
            new StringOption("NSW"),
            new StringOption("VIC"),
            new StringOption("QLD"),
            new StringOption("WA"),
            new StringOption("SA"),
            new StringOption("TAS"),
            new StringOption("ACT"),
            new StringOption("NT"),
            new StringOption("Other")
    );

    public static final List<StringOption> APPLICATION_TYPE = Arrays.asList(
            new StringOption("", ""),
            new StringOption("Sole", "Sole"),
            new StringOption("Joint", "Joint"),
            new StringOption("Spouse", "Joint with Spouse")
    );

    public static final List<StringOption> COMPANY_APPLICATION_TYPE = Arrays.asList(
            new StringOption("", ""),
            new StringOption("Sole", "Sole"),
            new StringOption("Joint", "Joint")
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

    public static final List<StringOption> YES_NO_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Yes"),
            new StringOption("No")
    );

    public static final List<StringOption> EMPLOYMENT_STATUS = Arrays.asList(
            new StringOption(""),
            new StringOption("Full Time"),
            new StringOption("Part Time"),
            new StringOption("Contract"),
            new StringOption("Casual")
    );

    public static final List<StringOption> STUDENT_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("University Student"),
            new StringOption("School Student")
    );

    public static final List<StringOption> TRUST_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Unit Trust"),
            new StringOption("Family Trust"),
            new StringOption("Hybrid Trust"),
            new StringOption("Simple Trust")
    );

    public static final List<StringOption> RESPONSIBLE_CHANGE_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Large Expenditure"),
            new StringOption("Permanent Decrease Income"),
            new StringOption("Temporary Decrease Income")
    );

    public static final List<StringOption> PERSON_OTHER_INCOME_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Add Back"),
            new StringOption("Bonus"),
            new StringOption("Commission"),
            new StringOption("Government Benefits"),
            new StringOption("Investments"),
            new StringOption("Other Income")
    );

    public static final List<StringOption> COMPANY_OTHER_INCOME_TYPE =  Arrays.asList(
            new StringOption(""),
            new StringOption("Add Back"),
            new StringOption("Company Profit Before Tax")
    );

    public static final List<StringOption> OTHER_INCOME_ADD_BACK_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Depreciation")
    );

    public static final List<StringOption> RESPONSIBLE_MITIGATION_TYPE = Arrays.asList(
            new StringOption(""),
            new StringOption("Secure Additional Income"),
            new StringOption("Use Savings"),
            new StringOption("Sale Assets"),
            new StringOption("Reduce Expenditure"),
            new StringOption("My Application Reflect These Changes")
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
