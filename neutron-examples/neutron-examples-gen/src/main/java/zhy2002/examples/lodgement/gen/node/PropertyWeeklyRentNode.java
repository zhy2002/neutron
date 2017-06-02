package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PropertyWeeklyRentNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PropertyWeeklyRentNode extends BigDecimalUiNode<PropertyNode> {

    @Inject
    protected PropertyWeeklyRentNode(@Owner PropertyNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PropertyWeeklyRentNode.class;
    }

    protected final PropertyWeeklyRentNodeComponent getComponent() {
        return component;
    }


    private PropertyWeeklyRentNodeComponent component;

    @Inject
    void createComponent(PropertyWeeklyRentNodeComponent.Builder builder) {
        this.component = builder.setPropertyWeeklyRentNodeModule(new PropertyWeeklyRentNodeModule(this)).build();
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
