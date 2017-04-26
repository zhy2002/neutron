package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PersonEmailNode extends EmailNode<PersonContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonEmailNode.class;
    }

    private PersonEmailNodeComponent component;

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


    public PersonEmailNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

}
