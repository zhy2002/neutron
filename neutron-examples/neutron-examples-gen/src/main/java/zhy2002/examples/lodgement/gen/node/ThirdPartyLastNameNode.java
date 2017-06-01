package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ThirdPartyLastNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ThirdPartyLastNameNode extends StringUiNode<RelatedPartyNode> {

    @Inject
    public ThirdPartyLastNameNode(@Owner RelatedPartyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ThirdPartyLastNameNode.class;
    }

    protected final ThirdPartyLastNameNodeComponent getComponent() {
        return component;
    }


    private ThirdPartyLastNameNodeComponent component;

    @Inject
    void createComponent(ThirdPartyLastNameNodeComponent.Builder builder) {
        this.component = builder.setThirdPartyLastNameNodeModule(new ThirdPartyLastNameNodeModule(this)).build();
    }

    private RuleProvider<ThirdPartyLastNameNode> getRuleProvider() {
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

}
