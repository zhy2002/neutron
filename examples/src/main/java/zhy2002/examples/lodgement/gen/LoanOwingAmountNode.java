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

public class LoanOwingAmountNode extends BaseCurrencyNode<LoanNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return LoanOwingAmountNode.class;
    }

    private LoanOwingAmountNodeComponent component;

    @Inject
    void createComponent(LoanOwingAmountNodeComponent.Builder builder) {
        this.component = builder.setLoanOwingAmountNodeModule(new LoanOwingAmountNodeModule(this)).build();
    }

    @Override
    protected LoanOwingAmountNodeRuleProvider getRuleProvider() {
        return component.getLoanOwingAmountNodeRuleProvider();
    }

    public LoanOwingAmountNode(LoanNode parent, String name) {
        super(parent, name);
    }

}
