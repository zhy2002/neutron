package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.EmployerPhoneNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class EmployerPhoneNode extends TelephoneNode<EmployedNode> {

    @Inject
    protected EmployerPhoneNode(@Owner EmployedNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return EmployerPhoneNode.class;
    }

    protected final EmployerPhoneNodeComponent getComponent() {
        return component;
    }


    private EmployerPhoneNodeComponent component;

    @Inject
    void createComponent(EmployerPhoneNodeComponent.Builder builder) {
        this.component = builder.setEmployerPhoneNodeModule(new EmployerPhoneNodeModule(this)).build();
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
