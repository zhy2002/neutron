package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class PersonTrustIndustryNode extends StringUiNode<PersonTrustNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonTrustIndustryNode.class;
    }

    private PersonTrustIndustryNodeComponent component;

    @Inject
    void createComponent(PersonTrustIndustryNodeComponent.Builder builder) {
        this.component = builder.setPersonTrustIndustryNodeModule(new PersonTrustIndustryNodeModule(this)).build();
    }

    @Override
    protected PersonTrustIndustryNodeRuleProvider getRuleProvider() {
        return component.getPersonTrustIndustryNodeRuleProvider();
    }

    public PersonTrustIndustryNode(@NotNull PersonTrustNode parent, String name) {
        super(parent, name);
    }

}
