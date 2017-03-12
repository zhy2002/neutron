package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class BaseCurrencyNode<P extends ParentUiNode<?>> extends BigDecimalUiNode<P> {


    public BaseCurrencyNode(@NotNull P parent, String name) {
        super(parent, name);
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
