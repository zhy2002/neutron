package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonOtherIncomePreviousYearNode extends BooleanUiNode<PersonOtherIncomeNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonOtherIncomePreviousYearNode.class;
    }

    private PersonOtherIncomePreviousYearNodeComponent component;

    @Inject
    void createComponent(PersonOtherIncomePreviousYearNodeComponent.Builder builder) {
        this.component = builder.setPersonOtherIncomePreviousYearNodeModule(new PersonOtherIncomePreviousYearNodeModule(this)).build();
    }

    @Override
    protected PersonOtherIncomePreviousYearNodeRuleProvider getRuleProvider() {
        return component.getPersonOtherIncomePreviousYearNodeRuleProvider();
    }

    public PersonOtherIncomePreviousYearNode(@NotNull PersonOtherIncomeNode parent, String name) {
        super(parent, name);
    }

}
