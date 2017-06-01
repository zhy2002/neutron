package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class AccessContactTitleNode extends StringUiNode<AccessNode> {

    @Inject
    public AccessContactTitleNode(@Owner AccessNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AccessContactTitleNode.class;
    }

    private AccessContactTitleNodeComponent component;

    @Inject
    void createComponent(AccessContactTitleNodeComponent.Builder builder) {
        this.component = builder.setAccessContactTitleNodeModule(new AccessContactTitleNodeModule(this)).build();
    }

    private RuleProvider<AccessContactTitleNode> getRuleProvider() {
        return component.getAccessContactTitleNodeRuleProvider();
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

    private RuleProvider<AccessContactTitleNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
