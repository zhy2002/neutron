package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected PersonApplicantTypeNodeRuleProvider getRuleProvider() {
        return component.getPersonApplicantTypeNodeRuleProvider();
    }

    public PersonApplicantTypeNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

}