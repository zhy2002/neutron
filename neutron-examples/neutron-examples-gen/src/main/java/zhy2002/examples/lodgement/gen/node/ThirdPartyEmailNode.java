package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ThirdPartyEmailNode extends StringUiNode<RelatedPartyNode> {
    private ThirdPartyEmailNodeComponent component;

    public ThirdPartyEmailNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyEmailNode.class;
    }

    @Inject
    void createComponent(ThirdPartyEmailNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyEmailNodeModule(new ThirdPartyEmailNodeModule(this)).build();
    }

    private RuleProvider<ThirdPartyEmailNode> getRuleProvider() {
        return component.getThirdPartyEmailNodeRuleProvider();
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

    private RuleProvider<ThirdPartyEmailNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
