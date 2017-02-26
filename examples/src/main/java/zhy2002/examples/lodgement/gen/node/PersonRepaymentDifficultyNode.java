package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonRepaymentDifficultyNode extends YesNoOptionNode<PersonResponsibleLendNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonRepaymentDifficultyNode.class;
    }

    private PersonRepaymentDifficultyNodeComponent component;

    @Inject
    void createComponent(PersonRepaymentDifficultyNodeComponent.Builder builder) {
        this.component = builder.setPersonRepaymentDifficultyNodeModule(new PersonRepaymentDifficultyNodeModule(this)).build();
    }

    @Override
    protected PersonRepaymentDifficultyNodeRuleProvider getRuleProvider() {
        return component.getPersonRepaymentDifficultyNodeRuleProvider();
    }

    public PersonRepaymentDifficultyNode(@NotNull PersonResponsibleLendNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
