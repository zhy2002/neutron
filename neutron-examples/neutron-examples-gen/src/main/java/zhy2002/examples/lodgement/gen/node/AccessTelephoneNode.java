package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private AccessTelephoneNodeRuleProvider getRuleProvider() {
        return component.getAccessTelephoneNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public AccessTelephoneNode(@NotNull AccessNode parent, String name) {
        super(parent, name);
    }

}
