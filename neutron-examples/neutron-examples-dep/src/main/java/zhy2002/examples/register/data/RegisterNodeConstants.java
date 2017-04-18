package zhy2002.examples.register.data;

import zhy2002.neutron.data.StringOption;

import java.util.Arrays;
import java.util.List;

public final class RegisterNodeConstants {

    private RegisterNodeConstants() {}

    public static final StringOption[] STATES = {
            new StringOption(""),
            new StringOption("NSW"),
            new StringOption("VIC"),
            new StringOption("QLD"),
            new StringOption("WA"),
            new StringOption("TAS"),
            new StringOption("NT")
    };

    public static final StringOption[] PLANS = {};
}
