package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class BaseCurrencyNode<P extends ParentUiNode<?>> extends BigDecimalUiNode<P> {

    @Override
    protected abstract BaseCurrencyNodeRuleProvider getRuleProvider();

    public BaseCurrencyNode(@NotNull P parent, String name) {
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
