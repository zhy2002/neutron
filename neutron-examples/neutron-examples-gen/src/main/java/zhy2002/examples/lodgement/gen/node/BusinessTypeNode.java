package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BusinessTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class BusinessTypeNode extends StringUiNode<SelfEmployedNode> {

    @Inject
    protected BusinessTypeNode(@Owner SelfEmployedNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return BusinessTypeNode.class;
    }

    protected final BusinessTypeNodeComponent getComponent() {
        return component;
    }


    private BusinessTypeNodeComponent component;

    @Inject
    void createComponent(BusinessTypeNodeComponent.Builder builder) {
        this.component = builder.setBusinessTypeNodeModule(new BusinessTypeNodeModule(this)).build();
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
