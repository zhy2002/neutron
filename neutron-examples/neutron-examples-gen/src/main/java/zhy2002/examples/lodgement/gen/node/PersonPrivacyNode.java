package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private PersonPrivacyNodeRuleProvider getRuleProvider() {
        return component.getPersonPrivacyNodeRuleProvider();
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

    private RuleProvider<PersonPrivacyNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public PersonPrivacyNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

}
