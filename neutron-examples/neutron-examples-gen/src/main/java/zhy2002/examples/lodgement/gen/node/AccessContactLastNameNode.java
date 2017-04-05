package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AccessContactLastNameNode extends StringUiNode<AccessNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AccessContactLastNameNode.class;
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

    public AccessContactLastNameNode(@NotNull AccessNode parent, String name) {
        super(parent, name);
    }

}
