package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class BaseCurrencyNode<P extends ParentUiNode<?>> extends BigDecimalUiNode<P> {


    public BaseCurrencyNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    public static final PropertyMetadata<CurrencyInfo> CURRENCY_INFO_PROPERTY = MetadataRegistry.createProperty(BaseCurrencyNode.class, "currencyInfo", CurrencyInfo.class, ApplicationNodeConstants.AUD);

    @JsMethod
    public CurrencyInfo getCurrencyInfo() {
        return getStateValue(CURRENCY_INFO_PROPERTY);
    }

    @JsMethod
    public void setCurrencyInfo(CurrencyInfo value) {
        setStateValue(CURRENCY_INFO_PROPERTY, value);
    }

}
