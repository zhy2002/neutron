package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OtherLiabilityMonthlyRepaymentNode extends BaseCurrencyNode<OtherLiabilityNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityMonthlyRepaymentNode.class;
    }

    private OtherLiabilityMonthlyRepaymentNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityMonthlyRepaymentNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityMonthlyRepaymentNodeModule(new OtherLiabilityMonthlyRepaymentNodeModule(this)).build();
    }

    private RuleProvider<OtherLiabilityMonthlyRepaymentNode> getRuleProvider() {
        return component.getOtherLiabilityMonthlyRepaymentNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<OtherLiabilityMonthlyRepaymentNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public OtherLiabilityMonthlyRepaymentNode(@NotNull OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
