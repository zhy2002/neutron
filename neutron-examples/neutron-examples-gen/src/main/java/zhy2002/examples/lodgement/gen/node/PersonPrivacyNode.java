package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonPrivacyNode extends BasePrivacyNode<PersonNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonPrivacyNode.class;
    }

    private PersonPrivacyNodeComponent component;

    @Inject
    void createComponent(PersonPrivacyNodeComponent.Builder builder) {
        this.component = builder.setPersonPrivacyNodeModule(new PersonPrivacyNodeModule(this)).build();
    }

    @Override
    protected PersonPrivacyNodeRuleProvider getRuleProvider() {
        return component.getPersonPrivacyNodeRuleProvider();
    }

    public PersonPrivacyNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

}
