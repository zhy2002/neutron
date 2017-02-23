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

public class AccessTelephoneNode extends StringUiNode<AccessNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return AccessTelephoneNode.class;
    }

    private AccessTelephoneNodeComponent component;

    @Inject
    void createComponent(AccessTelephoneNodeComponent.Builder builder) {
        this.component = builder.setAccessTelephoneNodeModule(new AccessTelephoneNodeModule(this)).build();
    }

    @Override
    protected AccessTelephoneNodeRuleProvider getRuleProvider() {
        return component.getAccessTelephoneNodeRuleProvider();
    }

    public AccessTelephoneNode(AccessNode parent, String name) {
        super(parent, name);
    }

}
