package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class PersonSignificantChangeFlagNode extends YesNoOptionNode<PersonResponsibleLendNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonSignificantChangeFlagNode.class;
    }

    private PersonSignificantChangeFlagNodeComponent component;

    @Inject
    void createComponent(PersonSignificantChangeFlagNodeComponent.Builder builder) {
        this.component = builder.setPersonSignificantChangeFlagNodeModule(new PersonSignificantChangeFlagNodeModule(this)).build();
    }

    @Override
    protected PersonSignificantChangeFlagNodeRuleProvider getRuleProvider() {
        return component.getPersonSignificantChangeFlagNodeRuleProvider();
    }

    public PersonSignificantChangeFlagNode(@NotNull PersonResponsibleLendNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
