package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class AccessContactFirstNameNode extends StringUiNode<AccessNode>
{
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

    public AccessContactFirstNameNode(AccessNode parent, String name) {
        super(parent, name);
    }

}
