package zhy2002.examples.lodgement.data;


import zhy2002.neutron.data.BooleanOption;
import zhy2002.neutron.data.DoubleOption;
import zhy2002.neutron.data.StringOption;
import zhy2002.neutron.util.ValueUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationNodeConstants {

    public static final String NAME_PATTERN = "^[a-zA-Z ]+$";

    public static final Telephone AUS_DEFAULT = new Telephone("+61");

    public static final CurrencyInfo AUD = new CurrencyInfo("AUD", "$");

    public static final UnitSymbol PERCENTAGE = new UnitSymbol("Percentage", "%");

    public static final UnitSymbol YEAR = new UnitSymbol("Year", "Year(s)");

    public static final StringOption[] OPT_OUT_REASON = {
            new StringOption(""),
            new StringOption("Not Interested"),
            new StringOption("Not Eligible"),
            new StringOption("Existing Customer")
    };

    public static final StringOption[] REPAYMENT_FREQUENCY = {
            new StringOption(""),
            new StringOption("Weekly"),
            new StringOption("Fortnightly"),
            new StringOption("Monthly")
    };

    public static final StringOption[] NAB_PACKAGE_TYPES = {
            new StringOption(""),
            new StringOption("No Package"),
            new StringOption("Choice Package")
    };

    public static final StringOption[] PRODUCT_LOAN_TYPE = {
            new StringOption(""),
            new StringOption("NewLoan", "New Loan"),
            new StringOption("PrincipleIncrease", "Principle Increase")
    };

    public static final StringOption[] TITLE_TYPE = {
            new StringOption(""),
            new StringOption("Mr"),
            new StringOption("Mrs"),
            new StringOption("Miss"),
            new StringOption("Ms"),
            new StringOption("Dr"),
            new StringOption("Prof"),
            new StringOption("Rev"),
            new StringOption("Other")
    };

    public static final StringOption[] COUNTRY_TYPE = {
            new StringOption(""),
            new StringOption("Australia"),
            new StringOption("China"),
            new StringOption("India"),
            new StringOption("US")
    };

    public static final StringOption[] THIRD_PARTY_TYPE = {
            new StringOption(""),
            new StringOption("Accountant"),
            new StringOption("Beneficiary"),
            new StringOption("Solicitor"),
            new StringOption("Next of Kin"),
            new StringOption("Trust Beneficiary"),
            new StringOption("Trust Settlor")
    };

    public static final StringOption[] LENDER_CHARGE_POSITION = {
            new StringOption(""),
            new StringOption("First"),
            new StringOption("Second"),
            new StringOption("Third"),
            new StringOption("Fourth"),
            new StringOption("Guarantee"),
            new StringOption("Unregistered Mortgage")
    };

    public static final StringOption[] ACCESS_CONTACT_TYPE = {
            new StringOption(""),
            new StringOption("Selling Agent"),
            new StringOption("Customer"),
            new StringOption("Tenant")
    };

    public static final StringOption[] PROPERTY_TYPE = {
            new StringOption(""),
            new StringOption("Residential")
    };

    public static final StringOption[] NAB_PRODUCT_GROUP = {
            new StringOption(""),
            new StringOption("PeakPerformance", "Peak Performance Equity Mortgage"),
            new StringOption("Homeplus", "Homeplus Home Loan"),
            new StringOption("BaseVariable", "NAB Base Variable Home Loan"),
            new StringOption("Tailored", "NAB Tailored Home Loan"),
            new StringOption("FlexiPlus", "NAB FlexiPlus Mortgage")
    };

    public static final StringOption[] NAB_PRODUCT_NAME = {
            new StringOption("")
    };

    public static final Map<String, StringOption[]> NAB_PRODUCT_NAME_MAP = new HashMap<>();

    public static final StringOption[] NAB_PRIMARY_PURPOSE = {
            new StringOption(""),
            new StringOption("OWNER_OCCUPY", "Owner Occupy"),
            new StringOption("INVESTMENT", "Investment")
    };

    public static final StringOption INTEREST_ONLY_OPTION = new StringOption("IO", "Interest Only");
    public static final StringOption PRINCIPAL_AND_INTEREST_OPTION = new StringOption("PI", "Principal and Interest");

    public static final StringOption[] PAYMENT_TYPE = {
            new StringOption(""),
            INTEREST_ONLY_OPTION,
            PRINCIPAL_AND_INTEREST_OPTION
    };

    public static final StringOption[] NAB_LENDING_PURPOSE = {
            new StringOption(""),
            new StringOption("BUILD_FIRST", "Build First Home"),
            new StringOption("CONSTRUCTION", "Construction"),
            new StringOption("PURCHASE", "Purchase")
    };

    public static final StringOption[] FEE_FROM_TYPE = {
            new StringOption(""),
            new StringOption("Account"),
            new StringOption("Loan Account")
    };

    public static final StringOption[] PRODUCT_FEE_TYPE = {
            new StringOption(""),
            new StringOption("Account"),
            new StringOption("Additional Legal"),
            new StringOption("Additional Valuation"),
            new StringOption("Application"),
            new StringOption("Discharge"),
            new StringOption("Establishment"),
            new StringOption("Govt & Sec"),
            new StringOption("Inspection"),
            new StringOption("LMI"),
            new StringOption("Legal"),
            new StringOption("Other")
    };

    public static final StringOption[] PROPERTY_SUB_TYPE = {
            new StringOption(""),
            new StringOption("Apartment/Unit/Flat"),
            new StringOption("Fully Detached House"),
            new StringOption("Strata Title Unit"),
            new StringOption("Townhouse"),
            new StringOption("Duplex"),
            new StringOption("Vacant Land"),
            new StringOption("Rural")
    };

    public static final StringOption[] CUSTOMER_CONTRIBUTION_TYPE = {
            new StringOption(""),
            new StringOption("First Home Buyers Grant"),
            new StringOption("Net Proceeds from Sale of Property"),
            new StringOption("Cash"),
            new StringOption("Savings"),
            new StringOption("Gift"),
            new StringOption("Other")
    };

    public static final StringOption[] NEXT_KIN_TYPE = {
            new StringOption(""),
            new StringOption("Mother"),
            new StringOption("Mother-in-law"),
            new StringOption("Father"),
            new StringOption("Father-in-law"),
            new StringOption("Brother"),
            new StringOption("Brother-in-law"),
            new StringOption("Sister"),
            new StringOption("Sister-in-law"),
            new StringOption("Cousin"),
            new StringOption("Son"),
            new StringOption("Daughter"),
            new StringOption("Uncle"),
            new StringOption("Aunt"),
            new StringOption("Friend"),
            new StringOption("Grandmother"),
            new StringOption("Grandfather")
    };

    public static final StringOption[] OTHER_ASSET_TYPE = {
            new StringOption(""),
            new StringOption("Home Contents"),
            new StringOption("Superannuation"),
            new StringOption("Good Will of Business"),
            new StringOption("Other")
    };

    public static final StringOption[] EXPENSE_TYPE = {
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
    };

    public static final StringOption[] LIABILITY_LOAN_TYPE = {
            new StringOption(""),
            new StringOption("Hire Purchase"),
            new StringOption("Lease"),
            new StringOption("Line of Credit"),
            new StringOption("Loan as Guarantor"),
            new StringOption("Other Loan"),
            new StringOption("Overdraft"),
            new StringOption("Personal Loan"),
            new StringOption("Term Loan")
    };

    public static final StringOption[] GENDER_TYPE = {
            new StringOption(""),
            new StringOption("Male"),
            new StringOption("Female")
    };

    public static final StringOption[] SAVINGS_ACCOUNT_TYPE = {
            new StringOption(""),
            new StringOption("Savings Account"),
            new StringOption("Term Deposit")
    };

    public static final StringOption[] OTHER_LIABILITY_TYPE = {
            new StringOption(""),
            new StringOption("Commercial Bill"),
            new StringOption("Contingent Liability"),
            new StringOption("HECS"),
            new StringOption("Maintenance"),
            new StringOption("Other")
    };

    public static final StringOption[] CREDIT_CARD_TYPE = {
            new StringOption(""),
            new StringOption("Credit Card"),
            new StringOption("Store Card")
    };

    public static final StringOption[] APPLICANT_TYPE = {
            new StringOption("", ""),
            new StringOption("A", "Applicant"),
            new StringOption("G", "Guarantor")
    };

    public static final StringOption[] AUSTRALIAN_STATES = {
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
    };

    public static final StringOption[] APPLICATION_TYPE = {
            new StringOption("", ""),
            new StringOption("Sole", "Sole"),
            new StringOption("Joint", "Joint"),
            new StringOption("Spouse", "Joint with Spouse")
    };

    public static final StringOption[] COMPANY_APPLICATION_TYPE = {
            new StringOption("", ""),
            new StringOption("Sole", "Sole"),
            new StringOption("Joint", "Joint")
    };

    public static final StringOption[] EMPLOYMENT_TYPE = {
            new StringOption("payeEmployedNode"),
            new StringOption("selfEmployedNode"),
            new StringOption("unemployedNode"),
            new StringOption("retiredEmploymentNode")
    };

    public static final StringOption[] MARITAL_STATUS = {
            new StringOption("", ""),
            new StringOption("Single"),
            new StringOption("Married"),
            new StringOption("DeFacto"),
            new StringOption("Separated"),
            new StringOption("Divorced"),
            new StringOption("Widowed")
    };

    public static final StringOption[] HOUSING_STATUS = {
            new StringOption(""),
            new StringOption("Renting"),
            new StringOption("Own Home"),
            new StringOption("Own Home Mortgage"),
            new StringOption("Lives with Parents"),
            new StringOption("Boarding"),
            new StringOption("Supplied by Employer"),
            new StringOption("Caravan")
    };

    public static final StringOption[] YES_NO_TYPE = {
            new StringOption(""),
            new StringOption("Yes"),
            new StringOption("No")
    };

    public static final StringOption[] EMPLOYMENT_STATUS = {
            new StringOption(""),
            new StringOption("Full Time"),
            new StringOption("Part Time"),
            new StringOption("Contract"),
            new StringOption("Casual")
    };

    public static final StringOption[] STUDENT_TYPE = {
            new StringOption(""),
            new StringOption("University Student"),
            new StringOption("School Student")
    };

    public static final StringOption[] TRUST_TYPE = {
            new StringOption(""),
            new StringOption("Unit Trust"),
            new StringOption("Family Trust"),
            new StringOption("Hybrid Trust"),
            new StringOption("Simple Trust")
    };

    public static final StringOption[] RESPONSIBLE_CHANGE_TYPE = {
            new StringOption(""),
            new StringOption("Large Expenditure"),
            new StringOption("Permanent Decrease Income"),
            new StringOption("Temporary Decrease Income")
    };

    public static final StringOption[] PERSON_OTHER_INCOME_TYPE = {
            new StringOption(""),
            new StringOption("Add Back"),
            new StringOption("Bonus"),
            new StringOption("Commission"),
            new StringOption("Government Benefits"),
            new StringOption("Investments"),
            new StringOption("Other Income")
    };

    public static final StringOption[] COMPANY_OTHER_INCOME_TYPE = {
            new StringOption(""),
            new StringOption("Add Back"),
            new StringOption("Company Profit Before Tax"),
            new StringOption("Other Income")
    };

    public static final StringOption[] OTHER_INCOME_ADD_BACK_TYPE = {
            new StringOption(""),
            new StringOption("Depreciation")
    };

    public static final StringOption[] RESPONSIBLE_MITIGATION_TYPE = {
            new StringOption(""),
            new StringOption("Secure Additional Income"),
            new StringOption("Use Savings"),
            new StringOption("Sale Assets"),
            new StringOption("Reduce Expenditure"),
            new StringOption("My Application Reflect These Changes")
    };

    public static final BooleanOption[] PROPERTY_PURPOSE = {
            new BooleanOption(Boolean.TRUE, "Owner Occupied"),
            new BooleanOption(Boolean.FALSE, "Investment")
    };

    public static final DoubleOption[] MONTH_TYPE = {
            new DoubleOption(null, ""),
            new DoubleOption(new Double("1"), "January"),
            new DoubleOption(new Double("2"), "February"),
            new DoubleOption(new Double("3"), "March"),
            new DoubleOption(new Double("4"), "April"),
            new DoubleOption(new Double("5"), "May"),
            new DoubleOption(new Double("6"), "June"),
            new DoubleOption(new Double("7"), "July"),
            new DoubleOption(new Double("8"), "August"),
            new DoubleOption(new Double("9"), "September"),
            new DoubleOption(new Double("10"), "October"),
            new DoubleOption(new Double("11"), "November"),
            new DoubleOption(new Double("12"), "December")
    };

    public static DoubleOption[] getYearType() {
        List<DoubleOption> result = new ArrayList<>();
        result.add(new DoubleOption(null, ""));
        int start = ValueUtil.getCurrentYear();
        for (int i = 0; i < 20; i++) {
            String yearValue = String.valueOf(start - i);
            result.add(new DoubleOption(new Double(yearValue), yearValue));
        }
        return result.toArray(new DoubleOption[result.size()]);
    }

    static {
        NAB_PRODUCT_NAME_MAP.put("PeakPerformance", new StringOption[]{
                new StringOption(""),
                new StringOption("PeakPerformance", "Peak Performance Equity Mortgage")
        });

        NAB_PRODUCT_NAME_MAP.put("Homeplus", new StringOption[]{
                new StringOption(""),
                new StringOption("HomeplusVariable", "Homeplus, Variable Rate"),
                new StringOption("HomeplusFixed", "Homeplus, Fixed Term")

        });

        NAB_PRODUCT_NAME_MAP.put("BaseVariable", new StringOption[]{
                new StringOption(""),
                new StringOption("NAB Base Variable Home Loan")
        });

        NAB_PRODUCT_NAME_MAP.put("Tailored", new StringOption[]{
                new StringOption(""),
                new StringOption("TailoredVariable", "NAB Tailored Variable Home Loan"),
                new StringOption("TailoredFixed", "NAB Tailored Fixed Home Loan")
        });

        NAB_PRODUCT_NAME_MAP.put("FlexiPlus", new StringOption[]{
                new StringOption(""),
                new StringOption("FlexiPlus", "NAB FlexiPlus Mortgage")
        });
    }

}
