package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class TelephoneNode<P extends ParentUiNode<?>> extends LeafUiNode<P,Telephone> {


    public TelephoneNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    @Override
    public final void setValue(Telephone value) {
        setValue(Telephone.class, value);
    }

    public static final PropertyMetadata<Boolean> COUNTRY_CODE_READONLY_PROPERTY = MetadataRegistry.createProperty(TelephoneNode.class, "countryCodeReadonly", Boolean.class, Boolean.FALSE);

    @JsMethod
    public Boolean getCountryCodeReadonly() {
        return getStateValue(COUNTRY_CODE_READONLY_PROPERTY);
    }

    @JsMethod
    public void setCountryCodeReadonly(Boolean value) {
        setStateValue(COUNTRY_CODE_READONLY_PROPERTY, value);
    }

    @Override
    public Telephone getCopyOfValue() {
        Telephone value = getValue();
        if(value == null)
            return new Telephone();
        return new Telephone(value);
    }

    private static Telephone EMPTY_VALUE = new Telephone();

    @Override
    public boolean hasValue() {
        Telephone value = getValue();
        return value != null && !value.equals(EMPTY_VALUE);
    }

    @Override
    public Class<Telephone> getValueClass() {
        return Telephone.class;
    }

}
