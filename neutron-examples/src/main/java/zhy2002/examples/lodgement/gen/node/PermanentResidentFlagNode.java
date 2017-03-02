package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PermanentResidentFlagNode extends BooleanUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PermanentResidentFlagNode.class;
    }

    private PermanentResidentFlagNodeComponent component;

    @Inject
    void createComponent(PermanentResidentFlagNodeComponent.Builder builder) {
        this.component = builder.setPermanentResidentFlagNodeModule(new PermanentResidentFlagNodeModule(this)).build();
    }

    @Override
    protected PermanentResidentFlagNodeRuleProvider getRuleProvider() {
        return component.getPermanentResidentFlagNodeRuleProvider();
    }

    public PermanentResidentFlagNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

}
