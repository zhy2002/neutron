package zhy2002.examples.register.data;

import java.util.Arrays;
import java.util.List;

public final class RegisterNodeConstants {

    private RegisterNodeConstants() {}

    public static final List<AustralianState> STATES = Arrays.asList(
            new AustralianState("", ""),
            new AustralianState("NSW", "NSW"),
            new AustralianState("VIC", "VIC"),
            new AustralianState("QLD", "QLD"),
            new AustralianState("WA", "WA"),
            new AustralianState("TAS", "TAS"),
            new AustralianState("NT", "NT")
    );

    public static final String OPTIONS = "options";
    public static final String TOOLTIP = "tooltip";
    public static final String TRIGGERED_BY = "triggered_by";
    public static final String MESSAGE = "message";
    public static final String HAS_ERROR = "has_error";
}
