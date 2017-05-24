package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class MonthNode extends BigDecimalUiNode<MonthYearNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return MonthNode.class;
    }

    private MonthNodeComponent component;

    @Inject
    void createComponent(MonthNodeComponent.Builder builder) {
        this.component = builder.setMonthNodeModule(new MonthNodeModule(this)).build();
    }

    private RuleProvider<MonthNode> getRuleProvider() {
        return component.getMonthNodeRuleProvider();
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

    private RuleProvider<MonthNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public MonthNode(@NotNull MonthYearNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
