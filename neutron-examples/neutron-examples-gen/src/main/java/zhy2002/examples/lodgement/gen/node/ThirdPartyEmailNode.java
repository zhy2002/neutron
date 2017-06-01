package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ThirdPartyEmailNode extends StringUiNode<RelatedPartyNode> {

    @Inject
    public ThirdPartyEmailNode(@Owner RelatedPartyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyEmailNode.class;
    }

    private ThirdPartyEmailNodeComponent component;

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
