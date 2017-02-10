package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public class PayeEmployedNode extends EmployedNode
{
    private GrossYearlySalaryNode grossYearlySalaryNode;

    private PayeEmployedNodeChildFactory childFactory;

    @Inject
    void receiveProviders(PayeEmployedNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PayeEmployedNode> config = classRegistry.getUiNodeConfig(PayeEmployedNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public PayeEmployedNode(EmploymentNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public GrossYearlySalaryNode getGrossYearlySalaryNode() {
        return grossYearlySalaryNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        grossYearlySalaryNode = childFactory.createGrossYearlySalaryNode();
        children.add(grossYearlySalaryNode);
        return children;
    }




    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
