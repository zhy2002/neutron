package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class DateCreatedNode extends StringUiNode<ApplicationNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return DateCreatedNode.class;
    }

    private DateCreatedNodeComponent component;

    @Inject
    void createComponent(DateCreatedNodeComponent.Builder builder) {
        this.component = builder.setDateCreatedNodeModule(new DateCreatedNodeModule(this)).build();
    }

    private RuleProvider<DateCreatedNode> getRuleProvider() {
        return component.getDateCreatedNodeRuleProvider();
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

    private RuleProvider<DateCreatedNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public DateCreatedNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

}
