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

public class CreditCardMonthlyRepaymentNode extends BaseCurrencyNode<CreditCardNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardMonthlyRepaymentNode.class;
    }

    private CreditCardMonthlyRepaymentNodeComponent component;

    @Inject
    void createComponent(CreditCardMonthlyRepaymentNodeComponent.Builder builder) {
        this.component = builder.setCreditCardMonthlyRepaymentNodeModule(new CreditCardMonthlyRepaymentNodeModule(this)).build();
    }

    @Override
    protected CreditCardMonthlyRepaymentNodeRuleProvider getRuleProvider() {
        return component.getCreditCardMonthlyRepaymentNodeRuleProvider();
    }

    public CreditCardMonthlyRepaymentNode(CreditCardNode parent, String name) {
        super(parent, name);
    }

}
