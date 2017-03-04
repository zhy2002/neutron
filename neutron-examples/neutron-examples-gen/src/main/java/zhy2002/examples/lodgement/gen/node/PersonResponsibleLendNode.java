package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonResponsibleLendNode extends BaseResponsibleLendNode<PersonNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonResponsibleLendNode.class;
    }

    private PersonResponsibleLendNodeComponent component;

    @Inject
    void createComponent(PersonResponsibleLendNodeComponent.Builder builder) {
        this.component = builder.setPersonResponsibleLendNodeModule(new PersonResponsibleLendNodeModule(this)).build();
    }

    @Override
    protected PersonResponsibleLendNodeRuleProvider getRuleProvider() {
        return component.getPersonResponsibleLendNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public PersonResponsibleLendNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

}
