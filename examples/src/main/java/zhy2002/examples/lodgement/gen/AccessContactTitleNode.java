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

public class AccessContactTitleNode extends StringUiNode<AccessNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return AccessContactTitleNode.class;
    }

    private AccessContactTitleNodeComponent component;

    @Inject
    void createComponent(AccessContactTitleNodeComponent.Builder builder) {
        this.component = builder.setAccessContactTitleNodeModule(new AccessContactTitleNodeModule(this)).build();
    }

    @Override
    protected AccessContactTitleNodeRuleProvider getRuleProvider() {
        return component.getAccessContactTitleNodeRuleProvider();
    }

    public AccessContactTitleNode(AccessNode parent, String name) {
        super(parent, name);
    }

}
