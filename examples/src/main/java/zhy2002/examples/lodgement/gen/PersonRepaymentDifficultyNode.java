package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
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

    public PersonRepaymentDifficultyNode(PersonResponsibleLendNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
