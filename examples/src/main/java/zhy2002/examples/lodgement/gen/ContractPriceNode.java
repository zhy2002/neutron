package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

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

    @Override
    protected ContractPriceNodeRuleProvider getRuleProvider() {
        return component.getContractPriceNodeRuleProvider();
    }

    public ContractPriceNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}
