package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonOtherIncomeListNode extends BaseOtherIncomeListNode<PersonNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonOtherIncomeListNode.class;
    }

    private PersonOtherIncomeListNodeComponent component;

    @Inject
    void createComponent(PersonOtherIncomeListNodeComponent.Builder builder) {
        this.component = builder.setPersonOtherIncomeListNodeModule(new PersonOtherIncomeListNodeModule(this)).build();
    }

    @Override
    protected PersonOtherIncomeListNodeRuleProvider getRuleProvider() {
        return component.getPersonOtherIncomeListNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public PersonOtherIncomeListNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

}
