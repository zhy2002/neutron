package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class AccessTelephoneNode extends StringUiNode<AccessNode> {

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

    public AccessTelephoneNode(@NotNull AccessNode parent, String name) {
        super(parent, name);
    }

}
