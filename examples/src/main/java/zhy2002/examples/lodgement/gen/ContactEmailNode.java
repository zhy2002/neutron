package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class ContactEmailNode extends EmailNode<PersonContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ContactEmailNode.class;
    }

    private ContactEmailNodeComponent component;

    @Inject
    void createComponent(ContactEmailNodeComponent.Builder builder) {
        this.component = builder.setContactEmailNodeModule(new ContactEmailNodeModule(this)).build();
    }

    @Override
    protected ContactEmailNodeRuleProvider getRuleProvider() {
        return component.getContactEmailNodeRuleProvider();
    }

    public ContactEmailNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
