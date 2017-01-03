package zhy2002.examples.lodgement.data;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

@JsType
public class Telephone {

    private String countryCode;
    private String areaCode;
    private String phoneNumber;

    @JsIgnore
    public Telephone() {}

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
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
