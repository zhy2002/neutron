package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class TrustSettlorListNode extends SelectRelatedPersonListNode<BaseTrustNode<?>> {

    @Inject
    public TrustSettlorListNode(@Owner BaseTrustNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustSettlorListNode.class;
    }

    private TrustSettlorListNodeComponent component;

    @Inject
    void createComponent(TrustSettlorListNodeComponent.Builder builder) {
        this.component = builder.setTrustSettlorListNodeModule(new TrustSettlorListNodeModule(this)).build();
    }

    private RuleProvider<TrustSettlorListNode> getRuleProvider() {
        return component.getTrustSettlorListNodeRuleProvider();
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

    private RuleProvider<TrustSettlorListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
