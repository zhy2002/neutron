package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class SelectRelatedPersonFlagNode extends BooleanUiNode<SelectRelatedPersonNode> {

    private SelectRelatedPersonFlagNodeComponent component;

    @Inject
    public SelectRelatedPersonFlagNode(@Owner SelectRelatedPersonNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SelectRelatedPersonFlagNode.class;
    }

    @Inject
    void createComponent(SelectRelatedPersonFlagNodeComponent.Builder builder) {
        this.component = builder.setSelectRelatedPersonFlagNodeModule(new SelectRelatedPersonFlagNodeModule(this)).build();
    }

    private RuleProvider<SelectRelatedPersonFlagNode> getRuleProvider() {
        return component.getSelectRelatedPersonFlagNodeRuleProvider();
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

    private RuleProvider<SelectRelatedPersonFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
