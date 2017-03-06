package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TotalLiabilityNode extends BaseCurrencyNode<FinancialPositionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return TotalLiabilityNode.class;
    }

    private TotalLiabilityNodeComponent component;

    @Inject
    void createComponent(TotalLiabilityNodeComponent.Builder builder) {
        this.component = builder.setTotalLiabilityNodeModule(new TotalLiabilityNodeModule(this)).build();
    }

    private TotalLiabilityNodeRuleProvider getRuleProvider() {
        return component.getTotalLiabilityNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public TotalLiabilityNode(@NotNull FinancialPositionNode parent, String name) {
        super(parent, name);
    }

}
