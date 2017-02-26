package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PrimaryApplicantFlagNode extends BooleanUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PrimaryApplicantFlagNode.class;
    }

    private PrimaryApplicantFlagNodeComponent component;

    @Inject
    void createComponent(PrimaryApplicantFlagNodeComponent.Builder builder) {
        this.component = builder.setPrimaryApplicantFlagNodeModule(new PrimaryApplicantFlagNodeModule(this)).build();
    }

    @Override
    protected PrimaryApplicantFlagNodeRuleProvider getRuleProvider() {
        return component.getPrimaryApplicantFlagNodeRuleProvider();
    }

    public PrimaryApplicantFlagNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

}
