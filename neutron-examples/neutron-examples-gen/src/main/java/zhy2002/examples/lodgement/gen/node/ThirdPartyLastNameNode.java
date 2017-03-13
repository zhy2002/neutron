package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyLastNameNode extends StringUiNode<RelatedPartyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ThirdPartyLastNameNode.class;
    }

    private ThirdPartyLastNameNodeComponent component;

    @Inject
    void createComponent(ThirdPartyLastNameNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyLastNameNodeModule(new ThirdPartyLastNameNodeModule(this)).build();
    }

    private ThirdPartyLastNameNodeRuleProvider getRuleProvider() {
        return component.getThirdPartyLastNameNodeRuleProvider();
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

    private RuleProvider<ThirdPartyLastNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ThirdPartyLastNameNode(@NotNull RelatedPartyNode parent, String name) {
        super(parent, name);
    }

}
