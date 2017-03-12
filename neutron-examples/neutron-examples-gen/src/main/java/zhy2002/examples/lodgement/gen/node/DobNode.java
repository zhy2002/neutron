package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class DobNode<P extends ParentUiNode<?>> extends StringUiNode<P> {


    public DobNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public Integer getMinAge() {
        return getStateValue(ApplicationNodeConstants.MIN_AGE);
    }

    @JsMethod
    public void setMinAge(Integer value) {
        setStateValue(ApplicationNodeConstants.MIN_AGE, Integer.class, value);
    }

    @JsMethod
    public Integer getMaxAge() {
        return getStateValue(ApplicationNodeConstants.MAX_AGE);
    }

    @JsMethod
    public void setMaxAge(Integer value) {
        setStateValue(ApplicationNodeConstants.MAX_AGE, Integer.class, value);
    }

}
