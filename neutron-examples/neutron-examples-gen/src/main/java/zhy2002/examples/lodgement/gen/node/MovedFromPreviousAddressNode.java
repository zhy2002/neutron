package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class MovedFromPreviousAddressNode extends MonthYearNode<PersonContactNode> {
    private MovedFromPreviousAddressNodeComponent component;

    public MovedFromPreviousAddressNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return MovedFromPreviousAddressNode.class;
    }

    @Inject
    void createComponent(MovedFromPreviousAddressNodeComponent.Builder builder) {
        this.component = builder.setMovedFromPreviousAddressNodeModule(new MovedFromPreviousAddressNodeModule(this)).build();
    }

    private RuleProvider<MovedFromPreviousAddressNode> getRuleProvider() {
        return component.getMovedFromPreviousAddressNodeRuleProvider();
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

    private RuleProvider<MovedFromPreviousAddressNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
