package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class DateLodgedNode extends StringUiNode<ApplicationNode> {
    private DateLodgedNodeComponent component;

    public DateLodgedNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return DateLodgedNode.class;
    }

    @Inject
    void createComponent(DateLodgedNodeComponent.Builder builder) {
        this.component = builder.setDateLodgedNodeModule(new DateLodgedNodeModule(this)).build();
    }

    private RuleProvider<DateLodgedNode> getRuleProvider() {
        return component.getDateLodgedNodeRuleProvider();
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

    private RuleProvider<DateLodgedNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
