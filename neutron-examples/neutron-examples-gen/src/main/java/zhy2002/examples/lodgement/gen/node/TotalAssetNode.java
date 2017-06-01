package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class TotalAssetNode extends BaseCurrencyNode<FinancialPositionNode> {

    private TotalAssetNodeComponent component;

    @Inject
    public TotalAssetNode(@Owner FinancialPositionNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TotalAssetNode.class;
    }

    @Inject
    void createComponent(TotalAssetNodeComponent.Builder builder) {
        this.component = builder.setTotalAssetNodeModule(new TotalAssetNodeModule(this)).build();
    }

    private RuleProvider<TotalAssetNode> getRuleProvider() {
        return component.getTotalAssetNodeRuleProvider();
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

    private RuleProvider<TotalAssetNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
