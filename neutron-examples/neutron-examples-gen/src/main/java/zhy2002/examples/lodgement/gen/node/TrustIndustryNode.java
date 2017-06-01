package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustIndustryNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class TrustIndustryNode extends StringUiNode<BaseTrustNode<?>> {

    @Inject
    public TrustIndustryNode(@Owner BaseTrustNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustIndustryNode.class;
    }

    protected final TrustIndustryNodeComponent getComponent() {
        return component;
    }


    private TrustIndustryNodeComponent component;

    @Inject
    void createComponent(TrustIndustryNodeComponent.Builder builder) {
        this.component = builder.setTrustIndustryNodeModule(new TrustIndustryNodeModule(this)).build();
    }

    private RuleProvider<TrustIndustryNode> getRuleProvider() {
        return component.getTrustIndustryNodeRuleProvider();
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

    private RuleProvider<TrustIndustryNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
