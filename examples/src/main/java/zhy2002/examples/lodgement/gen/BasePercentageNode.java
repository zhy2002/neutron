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

public abstract class BasePercentageNode<P extends ParentUiNode<?>> extends BigDecimalUiNode<P>
{
    public BasePercentageNode(P parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setMinValue(new BigDecimal("0"));
        setMaxValue(new BigDecimal("100"));
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
