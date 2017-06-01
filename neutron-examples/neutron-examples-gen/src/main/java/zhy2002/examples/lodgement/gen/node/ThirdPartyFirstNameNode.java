package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ThirdPartyFirstNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ThirdPartyFirstNameNode extends StringUiNode<RelatedPartyNode> {

    @Inject
    public ThirdPartyFirstNameNode(@Owner RelatedPartyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyFirstNameNode.class;
    }

    protected final ThirdPartyFirstNameNodeComponent getComponent() {
        return component;
    }


    private ThirdPartyFirstNameNodeComponent component;

    @Inject
    void createComponent(ThirdPartyFirstNameNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyFirstNameNodeModule(new ThirdPartyFirstNameNodeModule(this)).build();
    }

    private RuleProvider<ThirdPartyFirstNameNode> getRuleProvider() {
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

}
