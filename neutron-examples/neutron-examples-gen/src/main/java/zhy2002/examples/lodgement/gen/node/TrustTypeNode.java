package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class TrustTypeNode extends StringUiNode<BaseTrustNode<?>> {

    @Inject
    public TrustTypeNode(@Owner BaseTrustNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustTypeNode.class;
    }

    protected final TrustTypeNodeComponent getComponent() {
        return component;
    }


    private TrustTypeNodeComponent component;

    @Inject
    void createComponent(TrustTypeNodeComponent.Builder builder) {
        this.component = builder.setTrustTypeNodeModule(new TrustTypeNodeModule(this)).build();
    }

    private RuleProvider<TrustTypeNode> getRuleProvider() {
        return component.getTrustTypeNodeRuleProvider();
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

    private RuleProvider<TrustTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
