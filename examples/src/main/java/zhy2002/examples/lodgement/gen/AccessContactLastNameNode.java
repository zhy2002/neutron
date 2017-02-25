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

    public AccessContactLastNameNode(AccessNode parent, String name) {
        super(parent, name);
    }

}
