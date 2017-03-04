package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected PersonEmailNodeRuleProvider getRuleProvider() {
        return component.getPersonEmailNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public PersonEmailNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
