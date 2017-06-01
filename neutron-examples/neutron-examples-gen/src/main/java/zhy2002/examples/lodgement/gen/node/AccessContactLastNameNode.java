package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AccessContactLastNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AccessContactLastNameNode extends StringUiNode<AccessNode> {

    @Inject
    public AccessContactLastNameNode(@Owner AccessNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AccessContactLastNameNode.class;
    }

    protected final AccessContactLastNameNodeComponent getComponent() {
        return component;
    }


    private AccessContactLastNameNodeComponent component;

    @Inject
    void createComponent(AccessContactLastNameNodeComponent.Builder builder) {
        this.component = builder.setAccessContactLastNameNodeModule(new AccessContactLastNameNodeModule(this)).build();
    }

    private RuleProvider<AccessContactLastNameNode> getRuleProvider() {
        return component.getAccessContactLastNameNodeRuleProvider();
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

    private RuleProvider<AccessContactLastNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
