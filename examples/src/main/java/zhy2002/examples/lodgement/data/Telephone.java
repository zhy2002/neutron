package zhy2002.examples.lodgement.data;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import zhy2002.neutron.util.ValueUtil;

@JsType
public class Telephone {

    private String countryCode = "";
    private String areaCode = "";
    private String phoneNumber = "";

    @JsIgnore
    public Telephone() {
    }

    @JsIgnore
    public Telephone(Telephone original) {
        this.countryCode = original.countryCode;
        this.areaCode = original.areaCode;
        this.phoneNumber = original.phoneNumber;
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
