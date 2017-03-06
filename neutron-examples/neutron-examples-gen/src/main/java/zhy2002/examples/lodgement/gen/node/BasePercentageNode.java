package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class BasePercentageNode<P extends ParentUiNode<?>> extends BigDecimalUiNode<P> {


    public BasePercentageNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public UnitSymbol getSuffixSymbol() {
        return getStateValue(ApplicationNodeConstants.SUFFIX_SYMBOL, ApplicationNodeConstants.PERCENTAGE);
    }

    @JsMethod
    public void setSuffixSymbol(UnitSymbol value) {
        setStateValue(ApplicationNodeConstants.SUFFIX_SYMBOL, UnitSymbol.class, value);
    }

}
