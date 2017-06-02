package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ContractPriceNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ContractPriceNode extends BigDecimalUiNode<PropertyNode> {

    @Inject
    protected ContractPriceNode(@Owner PropertyNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ContractPriceNode.class;
    }

    protected final ContractPriceNodeComponent getComponent() {
        return component;
    }


    private ContractPriceNodeComponent component;

    @Inject
    void createComponent(ContractPriceNodeComponent.Builder builder) {
        this.component = builder.setContractPriceNodeModule(new ContractPriceNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
