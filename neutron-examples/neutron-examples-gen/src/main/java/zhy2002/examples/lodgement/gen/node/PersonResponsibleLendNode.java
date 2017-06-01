package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PersonResponsibleLendNode extends BaseResponsibleLendNode<PersonNode> {

    private PersonResponsibleLendNodeComponent component;

    @Inject
    public PersonResponsibleLendNode(@Owner PersonNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonResponsibleLendNode.class;
    }

    @Inject
    void createComponent(PersonResponsibleLendNodeComponent.Builder builder) {
        this.component = builder.setPersonResponsibleLendNodeModule(new PersonResponsibleLendNodeModule(this)).build();
    }

    private RuleProvider<PersonResponsibleLendNode> getRuleProvider() {
        return component.getPersonResponsibleLendNodeRuleProvider();
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

    private RuleProvider<PersonResponsibleLendNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
