package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonOtherIncomeAmountNode extends BaseCurrencyNode<PersonOtherIncomeNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonOtherIncomeAmountNode.class;
    }

    private PersonOtherIncomeAmountNodeComponent component;

    @Inject
    void createComponent(PersonOtherIncomeAmountNodeComponent.Builder builder) {
        this.component = builder.setPersonOtherIncomeAmountNodeModule(new PersonOtherIncomeAmountNodeModule(this)).build();
    }

    @Override
    protected PersonOtherIncomeAmountNodeRuleProvider getRuleProvider() {
        return component.getPersonOtherIncomeAmountNodeRuleProvider();
    }

    public PersonOtherIncomeAmountNode(@NotNull PersonOtherIncomeNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
