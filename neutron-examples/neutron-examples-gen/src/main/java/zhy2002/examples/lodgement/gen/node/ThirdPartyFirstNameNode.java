package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyFirstNameNode extends StringUiNode<RelatedPartyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyFirstNameNode.class;
    }

    private ThirdPartyFirstNameNodeComponent component;

    @Inject
    void createComponent(ThirdPartyFirstNameNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyFirstNameNodeModule(new ThirdPartyFirstNameNodeModule(this)).build();
    }

    private ThirdPartyFirstNameNodeRuleProvider getRuleProvider() {
        return component.getThirdPartyFirstNameNodeRuleProvider();
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

    private RuleProvider<ThirdPartyFirstNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ThirdPartyFirstNameNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
