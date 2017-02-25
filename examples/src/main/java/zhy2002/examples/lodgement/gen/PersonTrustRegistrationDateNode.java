package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class PersonTrustRegistrationDateNode extends StringUiNode<PersonTrustNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonTrustRegistrationDateNode.class;
    }

    private PersonTrustRegistrationDateNodeComponent component;

    @Inject
    void createComponent(PersonTrustRegistrationDateNodeComponent.Builder builder) {
        this.component = builder.setPersonTrustRegistrationDateNodeModule(new PersonTrustRegistrationDateNodeModule(this)).build();
    }

    @Override
    protected PersonTrustRegistrationDateNodeRuleProvider getRuleProvider() {
        return component.getPersonTrustRegistrationDateNodeRuleProvider();
    }

    public PersonTrustRegistrationDateNode(@NotNull PersonTrustNode parent, String name) {
        super(parent, name);
    }

}
