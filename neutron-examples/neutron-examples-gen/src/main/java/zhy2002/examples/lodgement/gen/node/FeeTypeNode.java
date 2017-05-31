package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class FeeTypeNode extends StringUiNode<ProductFeeNode> {
    private FeeTypeNodeComponent component;

    public FeeTypeNode(@NotNull ProductFeeNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return FeeTypeNode.class;
    }

    @Inject
    void createComponent(FeeTypeNodeComponent.Builder builder) {
        this.component = builder.setFeeTypeNodeModule(new FeeTypeNodeModule(this)).build();
    }

    private RuleProvider<FeeTypeNode> getRuleProvider() {
        return component.getFeeTypeNodeRuleProvider();
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

    private RuleProvider<FeeTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
