package zhy2002.mortgage.application.data;

import jsinterop.annotations.JsProperty;
import zhy2002.neutron.util.ValueUtil;


public final class Telephone {

    public static Telephone fromJs(TelephoneJs telephoneJs) {
        return telephoneJs == null ? null : new Telephone(telephoneJs.getCountryCode(), telephoneJs.getAreaCode(), telephoneJs.getPhoneNumber());
    }

    @JsProperty
    private String countryCode = "";
    @JsProperty
    private String areaCode = "";
    @JsProperty
    private String phoneNumber = "";

    public Telephone() {
    }

    public Telephone(String countryCode, String areaCode, String phoneNumber) {
        setCountryCode(countryCode);
        setAreaCode(areaCode);
        setPhoneNumber(phoneNumber);
    }

    public Telephone(Telephone original) {
        if (original != null) {
            setCountryCode(original.getCountryCode());
            setAreaCode(original.getAreaCode());
            setPhoneNumber(original.getPhoneNumber());
        }
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = ValueUtil.ifNull(countryCode, "");
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = ValueUtil.ifNull(areaCode, "");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = ValueUtil.ifNull(phoneNumber, "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Telephone telephone = (Telephone) o;

        if (countryCode != null ? !countryCode.equals(telephone.countryCode) : telephone.countryCode != null)
            return false;
        if (areaCode != null ? !areaCode.equals(telephone.areaCode) : telephone.areaCode != null) return false;
        return phoneNumber != null ? phoneNumber.equals(telephone.phoneNumber) : telephone.phoneNumber == null;
    }

    @Override
    public int hashCode() {
        int result = countryCode != null ? countryCode.hashCode() : 0;
        result = 31 * result + (areaCode != null ? areaCode.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }
}
