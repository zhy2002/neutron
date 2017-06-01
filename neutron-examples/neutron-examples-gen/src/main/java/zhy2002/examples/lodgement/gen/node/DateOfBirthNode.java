package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.DateOfBirthNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class DateOfBirthNode extends DobNode<PersonGeneralNode> {

    @Inject
    public DateOfBirthNode(@Owner PersonGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return DateOfBirthNode.class;
    }

    protected final DateOfBirthNodeComponent getComponent() {
        return component;
    }


    private DateOfBirthNodeComponent component;

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
