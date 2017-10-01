package zhy2002.neutron.core.util;

import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.i18n.shared.DefaultDateTimeFormatInfo;

public class SharedDateTimeFormat extends DateTimeFormat {

    public SharedDateTimeFormat() {
        this("yyyy-MM-dd'T'HH:mm:ssZ");
    }

    public SharedDateTimeFormat(String pattern) {
        super(pattern, new DefaultDateTimeFormatInfo());

    }
}
