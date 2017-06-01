package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MortgageLoanTermExpiryDateNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MortgageLoanTermExpiryDateNode extends StringUiNode<ExistingMortgageNode> {

    @Inject
    public MortgageLoanTermExpiryDateNode(@Owner ExistingMortgageNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MortgageLoanTermExpiryDateNode.class;
    }

    protected final MortgageLoanTermExpiryDateNodeComponent getComponent() {
        return component;
    }


    private MortgageLoanTermExpiryDateNodeComponent component;

    @Inject
    void createComponent(MortgageLoanTermExpiryDateNodeComponent.Builder builder) {
        this.component = builder.setMortgageLoanTermExpiryDateNodeModule(new MortgageLoanTermExpiryDateNodeModule(this)).build();
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
