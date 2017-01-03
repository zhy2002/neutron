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
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class TelephoneNode<P extends ParentUiNode<?>> extends LeafUiNode<P,Telephone>
{
    protected TelephoneNode(P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    @Override
    public final void setValue(Telephone value) {
        setValue(Telephone.class, value);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules()
            .and(getContext().createUiNodeRule(TelephoneCompleteRule.class, this))
        ;
    }

    @Override
    public Telephone getCopyOfValue() {
        Telephone value = getValue();
        if(value == null)
            return new Telephone();
        return new Telephone(value);
    }
}
