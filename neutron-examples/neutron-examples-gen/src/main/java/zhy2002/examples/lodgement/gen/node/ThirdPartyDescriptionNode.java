package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ThirdPartyDescriptionNode extends StringUiNode<RelatedPartyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyDescriptionNode.class;
    }

    private ThirdPartyDescriptionNodeComponent component;

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


    public ThirdPartyDescriptionNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
