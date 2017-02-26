package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonOtherIncomeDescriptionNode extends StringUiNode<PersonOtherIncomeNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonOtherIncomeDescriptionNode.class;
    }

    private PersonOtherIncomeDescriptionNodeComponent component;

    @Inject
    void createComponent(PersonOtherIncomeDescriptionNodeComponent.Builder builder) {
        this.component = builder.setPersonOtherIncomeDescriptionNodeModule(new PersonOtherIncomeDescriptionNodeModule(this)).build();
    }

    @Override
    protected PersonOtherIncomeDescriptionNodeRuleProvider getRuleProvider() {
        return component.getPersonOtherIncomeDescriptionNodeRuleProvider();
    }

    public PersonOtherIncomeDescriptionNode(@NotNull PersonOtherIncomeNode parent, String name) {
        super(parent, name);
    }

}