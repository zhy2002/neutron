package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class PersonTrustCountryNode extends BaseCountryNode<PersonTrustNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonTrustCountryNode.class;
    }

    private PersonTrustCountryNodeComponent component;

    @Inject
    void createComponent(PersonTrustCountryNodeComponent.Builder builder) {
        this.component = builder.setPersonTrustCountryNodeModule(new PersonTrustCountryNodeModule(this)).build();
    }

    @Override
    protected PersonTrustCountryNodeRuleProvider getRuleProvider() {
        return component.getPersonTrustCountryNodeRuleProvider();
    }

    public PersonTrustCountryNode(@NotNull PersonTrustNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
