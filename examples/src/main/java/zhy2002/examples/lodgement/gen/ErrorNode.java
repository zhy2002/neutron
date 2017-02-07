package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public  class ErrorNode extends LeafUiNode<ErrorListNode,ValidationError>
{
    public ErrorNode(ErrorListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    @Override
    public final void setValue(ValidationError value) {
        setValue(ValidationError.class, value);
    }

    @JsMethod
    public UiNode<?> getSource() {
        return getValue().getOrigin();
    }

    @JsMethod
    public void setSource(UiNode<?> value) {
        getValue().setOrigin(value);
    }
    @JsMethod
    public String getMessage() {
        return getValue().getMessage();
    }

    @JsMethod
    public void setMessage(String value) {
        getValue().setMessage(value);
    }
    @JsIgnore
    public UiNodeRule<?> getRule() {
        return getValue().getRule();
    }

    @JsIgnore
    public void setRule(UiNodeRule<?> value) {
        getValue().setRule(value);
    }

    @Override
    public ValidationError getCopyOfValue() {
        ValidationError value = getValue();
        if(value == null)
            return new ValidationError();
        return new ValidationError(value);
    }

    private static ValidationError EMPTY_VALUE = new ValidationError();

    @Override
    public boolean hasValue() {
        ValidationError value = getValue();
        return value != null && !value.equals(EMPTY_VALUE);
    }

    @Override
    public Class<ValidationError> getValueClass() {
    return ValidationError.class;
    }


}
