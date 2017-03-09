package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ContractPriceNode extends BigDecimalUiNode<PropertyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ContractPriceNode.class;
    }

    private ContractPriceNodeComponent component;

    @Inject
    void createComponent(ContractPriceNodeComponent.Builder builder) {
        this.component = builder.setContractPriceNodeModule(new ContractPriceNodeModule(this)).build();
    }

    private ContractPriceNodeRuleProvider getRuleProvider() {
        return component.getContractPriceNodeRuleProvider();
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

    private RuleProvider<ContractPriceNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ContractPriceNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}
