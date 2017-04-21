package zhy2002.neutron.data;

import jsinterop.annotations.JsIgnore;

import javax.validation.constraints.NotNull;

public class BooleanOption extends SelectOption<Boolean> {

    @JsIgnore
    public BooleanOption(@NotNull Boolean value) {
        this(value, String.valueOf(value));
    }

    public BooleanOption(Boolean value, String text) {
        super(value, text);
    }
}
