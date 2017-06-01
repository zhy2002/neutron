package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.OwnInvestmentPropertyNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class OwnInvestmentPropertyNode extends BooleanUiNode<RegisterNode> {

    @Inject
    public OwnInvestmentPropertyNode(@Owner RegisterNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OwnInvestmentPropertyNode.class;
    }

    protected final OwnInvestmentPropertyNodeComponent getComponent() {
        return component;
    }


    private OwnInvestmentPropertyNodeComponent component;

    @Inject
    void createComponent(OwnInvestmentPropertyNodeComponent.Builder builder) {
        this.component = builder.setOwnInvestmentPropertyNodeModule(new OwnInvestmentPropertyNodeModule(this)).build();
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
