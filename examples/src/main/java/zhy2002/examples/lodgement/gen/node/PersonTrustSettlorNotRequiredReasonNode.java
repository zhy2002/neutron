package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonTrustSettlorNotRequiredReasonNode extends StringUiNode<PersonTrustNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonTrustSettlorNotRequiredReasonNode.class;
    }

    private PersonTrustSettlorNotRequiredReasonNodeComponent component;

    @Inject
    void createComponent(PersonTrustSettlorNotRequiredReasonNodeComponent.Builder builder) {
        this.component = builder.setPersonTrustSettlorNotRequiredReasonNodeModule(new PersonTrustSettlorNotRequiredReasonNodeModule(this)).build();
    }

    @Override
    protected PersonTrustSettlorNotRequiredReasonNodeRuleProvider getRuleProvider() {
        return component.getPersonTrustSettlorNotRequiredReasonNodeRuleProvider();
    }

    public PersonTrustSettlorNotRequiredReasonNode(@NotNull PersonTrustNode parent, String name) {
        super(parent, name);
    }

}
