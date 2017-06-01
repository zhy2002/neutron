package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OwnedOutrightFlagNode extends BooleanUiNode<UsageNode> {

    private OwnedOutrightFlagNodeComponent component;

    @Inject
    public OwnedOutrightFlagNode(@Owner UsageNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OwnedOutrightFlagNode.class;
    }

    @Inject
    void createComponent(OwnedOutrightFlagNodeComponent.Builder builder) {
        this.component = builder.setOwnedOutrightFlagNodeModule(new OwnedOutrightFlagNodeModule(this)).build();
    }

    private RuleProvider<OwnedOutrightFlagNode> getRuleProvider() {
        return component.getOwnedOutrightFlagNodeRuleProvider();
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

    private RuleProvider<OwnedOutrightFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
