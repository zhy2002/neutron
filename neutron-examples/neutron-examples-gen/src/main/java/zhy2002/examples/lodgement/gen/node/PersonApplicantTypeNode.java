package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PersonApplicantTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PersonApplicantTypeNode extends BaseApplicantTypeNode<PersonGeneralNode> {

    @Inject
    public PersonApplicantTypeNode(@Owner PersonGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonApplicantTypeNode.class;
    }

    protected final PersonApplicantTypeNodeComponent getComponent() {
        return component;
    }


    private PersonApplicantTypeNodeComponent component;

    @Inject
    void createComponent(PersonApplicantTypeNodeComponent.Builder builder) {
        this.component = builder.setPersonApplicantTypeNodeModule(new PersonApplicantTypeNodeModule(this)).build();
    }

    private RuleProvider<PersonApplicantTypeNode> getRuleProvider() {
        return component.getPersonApplicantTypeNodeRuleProvider();
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

    private RuleProvider<PersonApplicantTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
