package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class YearNode extends BigDecimalUiNode<MonthYearNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return YearNode.class;
    }

    private YearNodeComponent component;

    @Inject
    void createComponent(YearNodeComponent.Builder builder) {
        this.component = builder.setYearNodeModule(new YearNodeModule(this)).build();
    }

    private RuleProvider<YearNode> getRuleProvider() {
        return component.getYearNodeRuleProvider();
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

    private RuleProvider<YearNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public YearNode(@NotNull MonthYearNode<?> parent, String name) {
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
