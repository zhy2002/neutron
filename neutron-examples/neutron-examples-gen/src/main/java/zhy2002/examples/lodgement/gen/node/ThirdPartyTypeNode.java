package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ThirdPartyTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyTypeNode extends StringUiNode<RelatedPartyNode> {

    @Inject
    public ThirdPartyTypeNode(@Owner RelatedPartyNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyTypeNode.class;
    }

    protected final ThirdPartyTypeNodeComponent getComponent() {
        return component;
    }


    private ThirdPartyTypeNodeComponent component;

    @Inject
    void createComponent(ThirdPartyTypeNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyTypeNodeModule(new ThirdPartyTypeNodeModule(this)).build();
    }

    private RuleProvider<ThirdPartyTypeNode> getRuleProvider() {
        return component.getThirdPartyTypeNodeRuleProvider();
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

    private RuleProvider<ThirdPartyTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
