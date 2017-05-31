package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class SelectAccountHolderFlagNode extends BooleanUiNode<SelectAccountHolderNode> {
    private SelectAccountHolderFlagNodeComponent component;

    public SelectAccountHolderFlagNode(@NotNull SelectAccountHolderNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return SelectAccountHolderFlagNode.class;
    }

    @Inject
    void createComponent(SelectAccountHolderFlagNodeComponent.Builder builder) {
        this.component = builder.setSelectAccountHolderFlagNodeModule(new SelectAccountHolderFlagNodeModule(this)).build();
    }

    private RuleProvider<SelectAccountHolderFlagNode> getRuleProvider() {
        return component.getSelectAccountHolderFlagNodeRuleProvider();
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

    private RuleProvider<SelectAccountHolderFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
