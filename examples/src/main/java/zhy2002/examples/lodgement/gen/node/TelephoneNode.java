package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class TelephoneNode<P extends ParentUiNode<?>> extends LeafUiNode<P,Telephone> {

    @Override
    protected abstract TelephoneNodeRuleProvider<?> getRuleProvider();

    public TelephoneNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    @Override
    public final void setValue(Telephone value) {
        setValue(Telephone.class, value);
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
