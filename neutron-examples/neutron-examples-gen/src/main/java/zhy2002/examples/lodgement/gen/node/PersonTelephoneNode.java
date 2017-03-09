package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonTelephoneNode extends TelephoneNode<PersonContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonTelephoneNode.class;
    }

    private PersonTelephoneNodeComponent component;

    @Inject
    void createComponent(PersonTelephoneNodeComponent.Builder builder) {
        this.component = builder.setPersonTelephoneNodeModule(new PersonTelephoneNodeModule(this)).build();
    }

    private PersonTelephoneNodeRuleProvider getRuleProvider() {
        return component.getPersonTelephoneNodeRuleProvider();
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

    private RuleProvider<PersonTelephoneNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public PersonTelephoneNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

}
