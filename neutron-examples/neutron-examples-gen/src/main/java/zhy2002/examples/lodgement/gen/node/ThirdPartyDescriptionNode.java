package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ThirdPartyDescriptionNode extends StringUiNode<RelatedPartyNode> {

    private ThirdPartyDescriptionNodeComponent component;

    @Inject
    public ThirdPartyDescriptionNode(@Owner RelatedPartyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyDescriptionNode.class;
    }

    @Inject
    void createComponent(ThirdPartyDescriptionNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyDescriptionNodeModule(new ThirdPartyDescriptionNodeModule(this)).build();
    }

    private RuleProvider<ThirdPartyDescriptionNode> getRuleProvider() {
        return component.getThirdPartyDescriptionNodeRuleProvider();
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

    private RuleProvider<ThirdPartyDescriptionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
