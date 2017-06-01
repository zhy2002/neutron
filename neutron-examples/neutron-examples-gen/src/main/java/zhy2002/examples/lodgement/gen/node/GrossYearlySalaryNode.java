package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.GrossYearlySalaryNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class GrossYearlySalaryNode extends BaseCurrencyNode<PayeEmployedNode> {

    @Inject
    public GrossYearlySalaryNode(@Owner PayeEmployedNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return GrossYearlySalaryNode.class;
    }

    protected final GrossYearlySalaryNodeComponent getComponent() {
        return component;
    }


    private GrossYearlySalaryNodeComponent component;

    @Inject
    void createComponent(GrossYearlySalaryNodeComponent.Builder builder) {
        this.component = builder.setGrossYearlySalaryNodeModule(new GrossYearlySalaryNodeModule(this)).build();
    }

    private RuleProvider<GrossYearlySalaryNode> getRuleProvider() {
        return component.getGrossYearlySalaryNodeRuleProvider();
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

    private RuleProvider<GrossYearlySalaryNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
