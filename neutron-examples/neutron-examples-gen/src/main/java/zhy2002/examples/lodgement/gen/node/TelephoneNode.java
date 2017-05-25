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

public abstract class TelephoneNode<P extends ParentUiNode<?>> extends LeafUiNode<P,Telephone> {


    public TelephoneNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    public static final PropertyMetadata<Telephone> VALUE_PROPERTY = MetadataRegistry.createProperty(TelephoneNode.class, "value", Telephone.class);
    public static final PropertyMetadata<Telephone> EMPTY_VALUE_PROPERTY = MetadataRegistry.createProperty(TelephoneNode.class, "emptyValue", Telephone.class, new Telephone(), ChangeModeEnum.DIRECT);
    public static final PropertyMetadata<Boolean> COUNTRY_CODE_READONLY_PROPERTY = MetadataRegistry.createProperty(TelephoneNode.class, "countryCodeReadonly", Boolean.class, Boolean.FALSE);
    public static final PropertyMetadata<Boolean> SUPPRESS_TELEPHONE_COMPLETE_RULE_PROPERTY = MetadataRegistry.createProperty(TelephoneNode.class, "suppressTelephoneCompleteRule", Boolean.class, Boolean.FALSE);

    @JsMethod
    public Boolean getCountryCodeReadonly() {
        return getStateValue(COUNTRY_CODE_READONLY_PROPERTY);
    }

    @JsMethod
    public void setCountryCodeReadonly(Boolean value) {
        setStateValue(COUNTRY_CODE_READONLY_PROPERTY, value);
    }


    @JsMethod
    public Boolean getSuppressTelephoneCompleteRule() {
        return getStateValue(SUPPRESS_TELEPHONE_COMPLETE_RULE_PROPERTY);
    }

    @JsMethod
    public void setSuppressTelephoneCompleteRule(Boolean value) {
        setStateValue(SUPPRESS_TELEPHONE_COMPLETE_RULE_PROPERTY, value);
    }

    @JsMethod
    @Override
    public final Telephone getValue() {
        return super.getStateValue(VALUE_PROPERTY);
    }

    @JsMethod
    @Override
    public final void setValue(Telephone value) {
        super.setStateValue(VALUE_PROPERTY, value);
    }

    @Override
    public Telephone getCopyOfValue() {
        Telephone value = getValue();
        if(value == null)
            return new Telephone();
        return new Telephone(value);
    }

    final void setEmptyValue(Telephone value) {
        super.setStateValue(EMPTY_VALUE_PROPERTY, value);
    }

    @Override
    public Telephone getEmptyValue() {
        return super.getStateValue(EMPTY_VALUE_PROPERTY);
    }

    @Override
    public Class<Telephone> getValueClass() {
        return Telephone.class;
    }

    @Override
    protected PropertyMetadata<Telephone> getValuePropertyMetadata() {
        return VALUE_PROPERTY;
    }

}
