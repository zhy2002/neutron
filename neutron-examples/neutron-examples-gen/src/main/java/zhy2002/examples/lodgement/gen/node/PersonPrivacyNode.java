package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PersonPrivacyNode extends BasePrivacyNode<PersonNode> {

    private PersonPrivacyNodeComponent component;

    @Inject
    public PersonPrivacyNode(@Owner PersonNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonPrivacyNode.class;
    }

    @Inject
    void createComponent(PersonPrivacyNodeComponent.Builder builder) {
        this.component = builder.setPersonPrivacyNodeModule(new PersonPrivacyNodeModule(this)).build();
    }

    private RuleProvider<PersonPrivacyNode> getRuleProvider() {
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

}
