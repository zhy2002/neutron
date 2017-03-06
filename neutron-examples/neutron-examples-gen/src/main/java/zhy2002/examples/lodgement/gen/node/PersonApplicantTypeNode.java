package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonApplicantTypeNode extends BaseApplicantTypeNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonApplicantTypeNode.class;
    }

    private PersonApplicantTypeNodeComponent component;

    @Inject
    void createComponent(PersonApplicantTypeNodeComponent.Builder builder) {
        this.component = builder.setPersonApplicantTypeNodeModule(new PersonApplicantTypeNodeModule(this)).build();
    }

    private PersonApplicantTypeNodeRuleProvider getRuleProvider() {
        return component.getPersonApplicantTypeNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public PersonApplicantTypeNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

}
