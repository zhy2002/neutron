package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonContactNode extends BaseContactNode<PersonNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonContactNode.class;
    }

    private PersonContactNodeComponent component;

    @Inject
    void createComponent(PersonContactNodeComponent.Builder builder) {
        this.component = builder.setPersonContactNodeModule(new PersonContactNodeModule(this)).build();
    }

    @Override
    protected PersonContactNodeRuleProvider getRuleProvider() {
        return component.getPersonContactNodeRuleProvider();
    }

    public PersonContactNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

}
