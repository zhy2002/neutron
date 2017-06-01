package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.FeeTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class FeeTypeNode extends StringUiNode<ProductFeeNode> {

    @Inject
    public FeeTypeNode(@Owner ProductFeeNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return FeeTypeNode.class;
    }

    protected final FeeTypeNodeComponent getComponent() {
        return component;
    }


    private FeeTypeNodeComponent component;

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
