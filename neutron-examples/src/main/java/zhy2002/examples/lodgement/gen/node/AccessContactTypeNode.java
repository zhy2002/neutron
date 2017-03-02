package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class AccessContactTypeNode extends StringUiNode<AccessNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AccessContactTypeNode.class;
    }

    private AccessContactTypeNodeComponent component;

    @Inject
    void createComponent(AccessContactTypeNodeComponent.Builder builder) {
        this.component = builder.setAccessContactTypeNodeModule(new AccessContactTypeNodeModule(this)).build();
    }

    @Override
    protected AccessContactTypeNodeRuleProvider getRuleProvider() {
        return component.getAccessContactTypeNodeRuleProvider();
    }

    public AccessContactTypeNode(@NotNull AccessNode parent, String name) {
        super(parent, name);
    }

}
