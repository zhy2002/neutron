package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.RentedFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class RentedFlagNode extends BooleanUiNode<PropertyNode> {

    @Inject
    protected RentedFlagNode(@Owner PropertyNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return RentedFlagNode.class;
    }

    protected final RentedFlagNodeComponent getComponent() {
        return component;
    }


    private RentedFlagNodeComponent component;

    @Inject
    void createComponent(RentedFlagNodeComponent.Builder builder) {
        this.component = builder.setRentedFlagNodeModule(new RentedFlagNodeModule(this)).build();
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
