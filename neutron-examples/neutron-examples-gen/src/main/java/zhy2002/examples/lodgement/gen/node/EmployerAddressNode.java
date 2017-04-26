package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class EmployerAddressNode extends AddressNode<EmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return EmployerAddressNode.class;
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


    public EmployerAddressNode(@NotNull EmployedNode parent, String name) {
        super(parent, name);
    }

}
