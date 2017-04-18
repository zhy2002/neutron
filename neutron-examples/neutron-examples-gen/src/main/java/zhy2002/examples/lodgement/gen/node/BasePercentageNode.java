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


public abstract class BasePercentageNode<P extends ParentUiNode<?>> extends BigDecimalUiNode<P> {


    public BasePercentageNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    public static final PropertyMetadata<UnitSymbol> SUFFIX_SYMBOL_PROPERTY = MetadataRegistry.createProperty(BasePercentageNode.class, "suffixSymbol", UnitSymbol.class, ApplicationNodeConstants.PERCENTAGE);

    @JsMethod
    public UnitSymbol getSuffixSymbol() {
        return getStateValue(SUFFIX_SYMBOL_PROPERTY);
    }

    @JsMethod
    public void setSuffixSymbol(UnitSymbol value) {
        setStateValue(SUFFIX_SYMBOL_PROPERTY, value);
    }

}
