package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class DateUpdatedNode extends StringUiNode<ApplicationNode> {
    private DateUpdatedNodeComponent component;

    public DateUpdatedNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return DateUpdatedNode.class;
    }

    @Inject
    void createComponent(DateUpdatedNodeComponent.Builder builder) {
        this.component = builder.setDateUpdatedNodeModule(new DateUpdatedNodeModule(this)).build();
    }

    private RuleProvider<DateUpdatedNode> getRuleProvider() {
        return component.getDateUpdatedNodeRuleProvider();
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

    private RuleProvider<DateUpdatedNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
