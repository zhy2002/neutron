package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.FeeDescriptionNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class FeeDescriptionNode extends StringUiNode<ProductFeeNode> {

    @Inject
    public FeeDescriptionNode(@Owner ProductFeeNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return FeeDescriptionNode.class;
    }

    protected final FeeDescriptionNodeComponent getComponent() {
        return component;
    }


    private FeeDescriptionNodeComponent component;

    @Inject
    void createComponent(FeeDescriptionNodeComponent.Builder builder) {
        this.component = builder.setFeeDescriptionNodeModule(new FeeDescriptionNodeModule(this)).build();
    }

    private RuleProvider<FeeDescriptionNode> getRuleProvider() {
        return component.getFeeDescriptionNodeRuleProvider();
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

    private RuleProvider<FeeDescriptionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
