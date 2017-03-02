package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected AccessContactLastNameNodeRuleProvider getRuleProvider() {
        return component.getAccessContactLastNameNodeRuleProvider();
    }

    public AccessContactLastNameNode(@NotNull AccessNode parent, String name) {
        super(parent, name);
    }

}
