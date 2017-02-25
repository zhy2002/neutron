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

public class CreditCardLimitAmountNode extends BaseCurrencyNode<CreditCardNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardLimitAmountNode.class;
    }

    private CreditCardLimitAmountNodeComponent component;

    @Inject
    void createComponent(CreditCardLimitAmountNodeComponent.Builder builder) {
        this.component = builder.setCreditCardLimitAmountNodeModule(new CreditCardLimitAmountNodeModule(this)).build();
    }

    @Override
    protected CreditCardLimitAmountNodeRuleProvider getRuleProvider() {
        return component.getCreditCardLimitAmountNodeRuleProvider();
    }

    public CreditCardLimitAmountNode(CreditCardNode parent, String name) {
        super(parent, name);
    }

}
