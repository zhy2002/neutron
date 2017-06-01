package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PersonPrivacyNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonPrivacyNode extends BasePrivacyNode<PersonNode> {

    @Inject
    public PersonPrivacyNode(@Owner PersonNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonPrivacyNode.class;
    }

    protected final PersonPrivacyNodeComponent getComponent() {
        return component;
    }


    private PersonPrivacyNodeComponent component;

    @Inject
    void createComponent(PersonPrivacyNodeComponent.Builder builder) {
        this.component = builder.setPersonPrivacyNodeModule(new PersonPrivacyNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
