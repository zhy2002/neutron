package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CreditCheckFlagNode extends BooleanUiNode<BasePrivacyNode<?>> {

    private CreditCheckFlagNodeComponent component;

    @Inject
    public CreditCheckFlagNode(@Owner BasePrivacyNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditCheckFlagNode.class;
    }

    @Inject
    void createComponent(CreditCheckFlagNodeComponent.Builder builder) {
        this.component = builder.setCreditCheckFlagNodeModule(new CreditCheckFlagNodeModule(this)).build();
    }

    private RuleProvider<CreditCheckFlagNode> getRuleProvider() {
        return component.getCreditCheckFlagNodeRuleProvider();
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

    private RuleProvider<CreditCheckFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
