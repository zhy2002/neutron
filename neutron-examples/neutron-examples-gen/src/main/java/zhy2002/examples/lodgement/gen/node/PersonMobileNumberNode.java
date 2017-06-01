package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PersonMobileNumberNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PersonMobileNumberNode extends BaseMobileNumberNode<PersonContactNode> {

    @Inject
    public PersonMobileNumberNode(@Owner PersonContactNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonMobileNumberNode.class;
    }

    protected final PersonMobileNumberNodeComponent getComponent() {
        return component;
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

}
