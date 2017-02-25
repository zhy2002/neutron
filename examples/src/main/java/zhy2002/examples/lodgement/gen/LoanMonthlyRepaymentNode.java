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

public class LoanMonthlyRepaymentNode extends BaseCurrencyNode<LoanNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return LoanMonthlyRepaymentNode.class;
    }

    private LoanMonthlyRepaymentNodeComponent component;

    @Inject
    void createComponent(LoanMonthlyRepaymentNodeComponent.Builder builder) {
        this.component = builder.setLoanMonthlyRepaymentNodeModule(new LoanMonthlyRepaymentNodeModule(this)).build();
    }

    @Override
    protected LoanMonthlyRepaymentNodeRuleProvider getRuleProvider() {
        return component.getLoanMonthlyRepaymentNodeRuleProvider();
    }

    public LoanMonthlyRepaymentNode(LoanNode parent, String name) {
        super(parent, name);
    }

}
