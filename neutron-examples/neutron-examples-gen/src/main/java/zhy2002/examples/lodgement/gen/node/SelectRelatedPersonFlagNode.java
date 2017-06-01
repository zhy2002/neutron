package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SelectRelatedPersonFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SelectRelatedPersonFlagNode extends BooleanUiNode<SelectRelatedPersonNode> {

    @Inject
    public SelectRelatedPersonFlagNode(@Owner SelectRelatedPersonNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SelectRelatedPersonFlagNode.class;
    }

    protected final SelectRelatedPersonFlagNodeComponent getComponent() {
        return component;
    }


    private SelectRelatedPersonFlagNodeComponent component;

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
