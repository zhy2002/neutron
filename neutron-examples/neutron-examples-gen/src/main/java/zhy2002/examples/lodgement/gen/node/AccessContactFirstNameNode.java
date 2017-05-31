package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class AccessContactFirstNameNode extends StringUiNode<AccessNode> {
    private AccessContactFirstNameNodeComponent component;

    public AccessContactFirstNameNode(@NotNull AccessNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return AccessContactFirstNameNode.class;
    }

    @Inject
    void createComponent(AccessContactFirstNameNodeComponent.Builder builder) {
        this.component = builder.setAccessContactFirstNameNodeModule(new AccessContactFirstNameNodeModule(this)).build();
    }

    private RuleProvider<AccessContactFirstNameNode> getRuleProvider() {
        return component.getAccessContactFirstNameNodeRuleProvider();
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

    private RuleProvider<AccessContactFirstNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
