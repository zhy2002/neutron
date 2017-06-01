package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AccessOtherDescriptionNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class AccessOtherDescriptionNode extends StringUiNode<AccessNode> {

    @Inject
    public AccessOtherDescriptionNode(@Owner AccessNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AccessOtherDescriptionNode.class;
    }

    protected final AccessOtherDescriptionNodeComponent getComponent() {
        return component;
    }


    private AccessOtherDescriptionNodeComponent component;

    @Inject
    void createComponent(AccessOtherDescriptionNodeComponent.Builder builder) {
        this.component = builder.setAccessOtherDescriptionNodeModule(new AccessOtherDescriptionNodeModule(this)).build();
    }

    private RuleProvider<AccessOtherDescriptionNode> getRuleProvider() {
        return component.getAccessOtherDescriptionNodeRuleProvider();
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

    private RuleProvider<AccessOtherDescriptionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
