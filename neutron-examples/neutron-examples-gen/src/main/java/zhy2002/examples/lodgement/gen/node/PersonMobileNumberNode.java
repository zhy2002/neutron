package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonMobileNumberNode extends BaseMobileNumberNode<PersonContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonMobileNumberNode.class;
    }

    private PersonMobileNumberNodeComponent component;

    @Inject
    void createComponent(PersonMobileNumberNodeComponent.Builder builder) {
        this.component = builder.setPersonMobileNumberNodeModule(new PersonMobileNumberNodeModule(this)).build();
    }

    private RuleProvider<PersonMobileNumberNode> getRuleProvider() {
        return component.getPersonMobileNumberNodeRuleProvider();
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

    private RuleProvider<PersonMobileNumberNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public PersonMobileNumberNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

}
