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

public abstract class BaseCurrencyNode<P extends ParentUiNode<?>> extends BigDecimalUiNode<P>
{
    protected BaseCurrencyNode(P parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setMinValue(new BigDecimal("0.01"));
    }

    @JsMethod
    public CurrencyInfo getCurrencyInfo() {
        return getStateValue(ApplicationNodeConstants.CURRENCY_INFO, ApplicationNodeConstants.AUD);
    }

    @JsMethod
    public void setCurrencyInfo(CurrencyInfo value) {
        setStateValue(ApplicationNodeConstants.CURRENCY_INFO, CurrencyInfo.class, value);
    }



}
