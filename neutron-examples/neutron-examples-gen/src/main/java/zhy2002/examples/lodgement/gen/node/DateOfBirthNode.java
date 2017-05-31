package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class DateOfBirthNode extends DobNode<PersonGeneralNode> {
    private DateOfBirthNodeComponent component;

    public DateOfBirthNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return DateOfBirthNode.class;
    }

    @Inject
    void createComponent(DateOfBirthNodeComponent.Builder builder) {
        this.component = builder.setDateOfBirthNodeModule(new DateOfBirthNodeModule(this)).build();
    }

    private RuleProvider<DateOfBirthNode> getRuleProvider() {
        return component.getDateOfBirthNodeRuleProvider();
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

    private RuleProvider<DateOfBirthNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
