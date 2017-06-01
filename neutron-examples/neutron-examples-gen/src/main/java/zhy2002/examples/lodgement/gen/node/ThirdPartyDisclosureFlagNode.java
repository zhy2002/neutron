package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ThirdPartyDisclosureFlagNode extends BooleanUiNode<BasePrivacyNode<?>> {

    private ThirdPartyDisclosureFlagNodeComponent component;

    @Inject
    public ThirdPartyDisclosureFlagNode(@Owner BasePrivacyNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyDisclosureFlagNode.class;
    }

    @Inject
    void createComponent(ThirdPartyDisclosureFlagNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyDisclosureFlagNodeModule(new ThirdPartyDisclosureFlagNodeModule(this)).build();
    }

    private RuleProvider<ThirdPartyDisclosureFlagNode> getRuleProvider() {
        return component.getThirdPartyDisclosureFlagNodeRuleProvider();
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

    private RuleProvider<ThirdPartyDisclosureFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
