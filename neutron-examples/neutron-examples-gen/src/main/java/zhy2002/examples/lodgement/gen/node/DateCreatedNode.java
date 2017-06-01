package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.DateCreatedNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class DateCreatedNode extends StringUiNode<ApplicationNode> {

    @Inject
    public DateCreatedNode(@Owner ApplicationNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return DateCreatedNode.class;
    }

    protected final DateCreatedNodeComponent getComponent() {
        return component;
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

}
