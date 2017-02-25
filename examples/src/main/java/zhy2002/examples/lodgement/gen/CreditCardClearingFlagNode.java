package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class CreditCardClearingFlagNode extends BooleanUiNode<CreditCardNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardClearingFlagNode.class;
    }

    private CreditCardClearingFlagNodeComponent component;

    @Inject
    void createComponent(CreditCardClearingFlagNodeComponent.Builder builder) {
        this.component = builder.setCreditCardClearingFlagNodeModule(new CreditCardClearingFlagNodeModule(this)).build();
    }

    @Override
    protected CreditCardClearingFlagNodeRuleProvider getRuleProvider() {
        return component.getCreditCardClearingFlagNodeRuleProvider();
    }

    public CreditCardClearingFlagNode(CreditCardNode parent, String name) {
        super(parent, name);
    }

}
