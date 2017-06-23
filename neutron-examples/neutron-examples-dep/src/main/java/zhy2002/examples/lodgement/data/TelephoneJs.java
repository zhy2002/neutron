package zhy2002.examples.lodgement.data;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface TelephoneJs {

    @JsProperty
    String getCountryCode();

    @JsProperty
    void setCountryCode(String countryCode);

    @JsProperty
    String getAreaCode();

    @JsProperty
    void setAreaCode(String areaCode);

    @JsProperty
    String getPhoneNumber();

    @JsProperty
    void setPhoneNumber(String phoneNumber);
}
