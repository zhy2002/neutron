package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PersonEmailNode extends EmailNode<PersonContactNode> {

    private PersonEmailNodeComponent component;

    @Inject
    public PersonEmailNode(@Owner PersonContactNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonEmailNode.class;
    }

    @Inject
    void createComponent(PersonEmailNodeComponent.Builder builder) {
        this.component = builder.setPersonEmailNodeModule(new PersonEmailNodeModule(this)).build();
    }

    private RuleProvider<PersonEmailNode> getRuleProvider() {
        return component.getPersonEmailNodeRuleProvider();
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

    private RuleProvider<PersonEmailNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
