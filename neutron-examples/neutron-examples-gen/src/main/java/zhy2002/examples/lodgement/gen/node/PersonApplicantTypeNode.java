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
    protected PersonApplicantTypeNode(@Owner PersonGeneralNode parent) {
        super(parent);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
