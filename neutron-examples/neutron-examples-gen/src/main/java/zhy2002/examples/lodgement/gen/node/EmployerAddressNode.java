package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.EmployerAddressNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class EmployerAddressNode extends AddressNode<EmployedNode> {

    @Inject
    protected EmployerAddressNode(@Owner EmployedNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return EmployerAddressNode.class;
    }

    protected final EmployerAddressNodeComponent getComponent() {
        return component;
    }


    private EmployerAddressNodeComponent component;

    @Inject
    void createComponent(EmployerAddressNodeComponent.Builder builder) {
        this.component = builder.setEmployerAddressNodeModule(new EmployerAddressNodeModule(this)).build();
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
