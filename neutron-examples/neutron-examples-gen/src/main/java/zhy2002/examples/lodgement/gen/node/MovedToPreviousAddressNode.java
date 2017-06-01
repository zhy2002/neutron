package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class MovedToPreviousAddressNode extends MonthYearNode<PersonContactNode> {

    @Inject
    public MovedToPreviousAddressNode(@Owner PersonContactNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MovedToPreviousAddressNode.class;
    }

    private MovedToPreviousAddressNodeComponent component;

    @Inject
    void createComponent(MovedToPreviousAddressNodeComponent.Builder builder) {
        this.component = builder.setMovedToPreviousAddressNodeModule(new MovedToPreviousAddressNodeModule(this)).build();
    }

    private RuleProvider<MovedToPreviousAddressNode> getRuleProvider() {
        return component.getMovedToPreviousAddressNodeRuleProvider();
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

    private RuleProvider<MovedToPreviousAddressNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
