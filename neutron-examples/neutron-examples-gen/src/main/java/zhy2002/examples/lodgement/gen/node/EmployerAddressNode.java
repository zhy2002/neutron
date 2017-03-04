package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected EmployerAddressNodeRuleProvider getRuleProvider() {
        return component.getEmployerAddressNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public EmployerAddressNode(@NotNull EmployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
