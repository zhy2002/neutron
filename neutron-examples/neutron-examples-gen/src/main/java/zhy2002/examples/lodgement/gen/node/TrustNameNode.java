package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustNameNode extends StringUiNode<BaseTrustNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return TrustNameNode.class;
    }

    private TrustNameNodeComponent component;

    @Inject
    void createComponent(TrustNameNodeComponent.Builder builder) {
        this.component = builder.setTrustNameNodeModule(new TrustNameNodeModule(this)).build();
    }

    private TrustNameNodeRuleProvider getRuleProvider() {
        return component.getTrustNameNodeRuleProvider();
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

    private RuleProvider<TrustNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public TrustNameNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

}
