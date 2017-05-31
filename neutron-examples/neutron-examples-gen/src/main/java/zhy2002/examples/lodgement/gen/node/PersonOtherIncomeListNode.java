package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PersonOtherIncomeListNode extends BaseOtherIncomeListNode<PersonNode> {
    private PersonOtherIncomeListNodeComponent component;

    public PersonOtherIncomeListNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PersonOtherIncomeListNode.class;
    }

    @Inject
    void createComponent(PersonOtherIncomeListNodeComponent.Builder builder) {
        this.component = builder.setPersonOtherIncomeListNodeModule(new PersonOtherIncomeListNodeModule(this)).build();
    }

    private RuleProvider<PersonOtherIncomeListNode> getRuleProvider() {
        return component.getPersonOtherIncomeListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<PersonOtherIncomeListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
