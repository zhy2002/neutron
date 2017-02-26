package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class AdditionalNode extends ObjectUiNode<ApplicationNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AdditionalNode.class;
    }

    private AdditionalNodeComponent component;

    @Inject
    void createComponent(AdditionalNodeComponent.Builder builder) {
        this.component = builder.setAdditionalNodeModule(new AdditionalNodeModule(this)).build();
    }

    @Override
    protected AdditionalNodeRuleProvider getRuleProvider() {
        return component.getAdditionalNodeRuleProvider();
    }

    public AdditionalNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

}
