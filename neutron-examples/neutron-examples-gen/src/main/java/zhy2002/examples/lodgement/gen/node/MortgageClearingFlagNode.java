package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MortgageClearingFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MortgageClearingFlagNode extends BooleanUiNode<ExistingMortgageNode> {

    @Inject
    public MortgageClearingFlagNode(@Owner ExistingMortgageNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MortgageClearingFlagNode.class;
    }

    protected final MortgageClearingFlagNodeComponent getComponent() {
        return component;
    }


    private MortgageClearingFlagNodeComponent component;

    @Inject
    void createComponent(MortgageClearingFlagNodeComponent.Builder builder) {
        this.component = builder.setMortgageClearingFlagNodeModule(new MortgageClearingFlagNodeModule(this)).build();
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
