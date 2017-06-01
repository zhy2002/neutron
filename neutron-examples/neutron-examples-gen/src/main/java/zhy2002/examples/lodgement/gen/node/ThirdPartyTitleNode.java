package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ThirdPartyTitleNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyTitleNode extends StringUiNode<RelatedPartyNode> {

    @Inject
    public ThirdPartyTitleNode(@Owner RelatedPartyNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyTitleNode.class;
    }

    protected final ThirdPartyTitleNodeComponent getComponent() {
        return component;
    }


    private ThirdPartyTitleNodeComponent component;

    @Inject
    void createComponent(ThirdPartyTitleNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyTitleNodeModule(new ThirdPartyTitleNodeModule(this)).build();
    }

    private RuleProvider<ThirdPartyTitleNode> getRuleProvider() {
        return component.getThirdPartyTitleNodeRuleProvider();
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

    private RuleProvider<ThirdPartyTitleNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
