package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class DateOfBirthNode extends DobNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return DateOfBirthNode.class;
    }

    private DateOfBirthNodeComponent component;

    @Inject
    void createComponent(DateOfBirthNodeComponent.Builder builder) {
        this.component = builder.setDateOfBirthNodeModule(new DateOfBirthNodeModule(this)).build();
    }

    @Override
    protected DateOfBirthNodeRuleProvider getRuleProvider() {
        return component.getDateOfBirthNodeRuleProvider();
    }

    public DateOfBirthNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}