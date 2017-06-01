package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustRegistrationDateNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class TrustRegistrationDateNode extends StringUiNode<BaseTrustNode<?>> {

    @Inject
    public TrustRegistrationDateNode(@Owner BaseTrustNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustRegistrationDateNode.class;
    }

    protected final TrustRegistrationDateNodeComponent getComponent() {
        return component;
    }


    private TrustRegistrationDateNodeComponent component;

    @Inject
    void createComponent(TrustRegistrationDateNodeComponent.Builder builder) {
        this.component = builder.setTrustRegistrationDateNodeModule(new TrustRegistrationDateNodeModule(this)).build();
    }

    private RuleProvider<TrustRegistrationDateNode> getRuleProvider() {
        return component.getTrustRegistrationDateNodeRuleProvider();
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

    private RuleProvider<TrustRegistrationDateNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
