package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyDobNode extends DobNode<RelatedPartyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyDobNode.class;
    }

    private ThirdPartyDobNodeComponent component;

    @Inject
    void createComponent(ThirdPartyDobNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyDobNodeModule(new ThirdPartyDobNodeModule(this)).build();
    }

    private RuleProvider<ThirdPartyDobNode> getRuleProvider() {
        return component.getThirdPartyDobNodeRuleProvider();
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

    private RuleProvider<ThirdPartyDobNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ThirdPartyDobNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
