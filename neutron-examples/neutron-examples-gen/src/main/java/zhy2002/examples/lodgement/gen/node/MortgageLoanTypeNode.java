package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MortgageLoanTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MortgageLoanTypeNode extends StringUiNode<ExistingMortgageNode> {

    @Inject
    protected MortgageLoanTypeNode(@Owner ExistingMortgageNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MortgageLoanTypeNode.class;
    }

    protected final MortgageLoanTypeNodeComponent getComponent() {
        return component;
    }


    private MortgageLoanTypeNodeComponent component;

    @Inject
    void createComponent(MortgageLoanTypeNodeComponent.Builder builder) {
        this.component = builder.setMortgageLoanTypeNodeModule(new MortgageLoanTypeNodeModule(this)).build();
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
