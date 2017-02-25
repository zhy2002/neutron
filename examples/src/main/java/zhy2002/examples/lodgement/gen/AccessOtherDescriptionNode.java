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

public class AccessOtherDescriptionNode extends StringUiNode<AccessNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AccessOtherDescriptionNode.class;
    }

    private AccessOtherDescriptionNodeComponent component;

    @Inject
    void createComponent(AccessOtherDescriptionNodeComponent.Builder builder) {
        this.component = builder.setAccessOtherDescriptionNodeModule(new AccessOtherDescriptionNodeModule(this)).build();
    }

    @Override
    protected AccessOtherDescriptionNodeRuleProvider getRuleProvider() {
        return component.getAccessOtherDescriptionNodeRuleProvider();
    }

    public AccessOtherDescriptionNode(AccessNode parent, String name) {
        super(parent, name);
    }

}
