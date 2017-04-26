package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class FeePayFromNode extends StringUiNode<ProductFeeNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return FeePayFromNode.class;
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


    public FeePayFromNode(@NotNull ProductFeeNode parent, String name) {
        super(parent, name);
    }

}
