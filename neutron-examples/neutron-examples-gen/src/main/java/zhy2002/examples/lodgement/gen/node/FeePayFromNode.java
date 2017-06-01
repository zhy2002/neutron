package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.FeePayFromNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class FeePayFromNode extends StringUiNode<ProductFeeNode> {

    @Inject
    public FeePayFromNode(@Owner ProductFeeNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return FeePayFromNode.class;
    }

    protected final FeePayFromNodeComponent getComponent() {
        return component;
    }


    private FeePayFromNodeComponent component;

    @Inject
    void createComponent(FeePayFromNodeComponent.Builder builder) {
        this.component = builder.setFeePayFromNodeModule(new FeePayFromNodeModule(this)).build();
    }

    private RuleProvider<FeePayFromNode> getRuleProvider() {
        return component.getFeePayFromNodeRuleProvider();
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

    private RuleProvider<FeePayFromNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
