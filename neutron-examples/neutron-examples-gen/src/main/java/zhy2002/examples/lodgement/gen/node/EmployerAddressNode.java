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
    public EmployerAddressNode(@Owner EmployedNode parent, @ChildName String name) {
        super(parent, name);
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

    private RuleProvider<EmployerAddressNode> getRuleProvider() {
        return component.getEmployerAddressNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<EmployerAddressNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
