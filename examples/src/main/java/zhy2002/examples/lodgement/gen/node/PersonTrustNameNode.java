package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonTrustNameNode extends StringUiNode<PersonTrustNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonTrustNameNode.class;
    }

    private PersonTrustNameNodeComponent component;

    @Inject
    void createComponent(PersonTrustNameNodeComponent.Builder builder) {
        this.component = builder.setPersonTrustNameNodeModule(new PersonTrustNameNodeModule(this)).build();
    }

    @Override
    protected PersonTrustNameNodeRuleProvider getRuleProvider() {
        return component.getPersonTrustNameNodeRuleProvider();
    }

    public PersonTrustNameNode(@NotNull PersonTrustNode parent, String name) {
        super(parent, name);
    }

}
