package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class AccessContactFirstNameNode extends StringUiNode<AccessNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AccessContactFirstNameNode.class;
    }

    private AccessContactFirstNameNodeComponent component;

    @Inject
    void createComponent(AccessContactFirstNameNodeComponent.Builder builder) {
        this.component = builder.setAccessContactFirstNameNodeModule(new AccessContactFirstNameNodeModule(this)).build();
    }

    @Override
    protected AccessContactFirstNameNodeRuleProvider getRuleProvider() {
        return component.getAccessContactFirstNameNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public AccessContactFirstNameNode(@NotNull AccessNode parent, String name) {
        super(parent, name);
    }

}
