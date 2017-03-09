package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyDisclosureFlagNode extends BooleanUiNode<BasePrivacyNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyDisclosureFlagNode.class;
    }

    private ThirdPartyDisclosureFlagNodeComponent component;

    @Inject
    void createComponent(ThirdPartyDisclosureFlagNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyDisclosureFlagNodeModule(new ThirdPartyDisclosureFlagNodeModule(this)).build();
    }

    private ThirdPartyDisclosureFlagNodeRuleProvider getRuleProvider() {
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

    public ThirdPartyDisclosureFlagNode(@NotNull BasePrivacyNode<?> parent, String name) {
        super(parent, name);
    }

}
