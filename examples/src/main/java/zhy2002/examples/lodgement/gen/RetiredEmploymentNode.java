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

public class RetiredEmploymentNode extends ObjectUiNode<EmploymentNode<?>>
{
    private RetiredOnBenefitFlagNode retiredOnBenefitFlagNode;
    private RetiredSinceNode retiredSinceNode;

    private RetiredEmploymentNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(RetiredEmploymentNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<RetiredEmploymentNode> config = classRegistry.getUiNodeConfig(RetiredEmploymentNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public RetiredEmploymentNode(EmploymentNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public RetiredOnBenefitFlagNode getRetiredOnBenefitFlagNode() {
        return retiredOnBenefitFlagNode;
    }

    @JsMethod
    public RetiredSinceNode getRetiredSinceNode() {
        return retiredSinceNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        retiredOnBenefitFlagNode = childFactory.createRetiredOnBenefitFlagNode();
        children.add(retiredOnBenefitFlagNode);
        retiredSinceNode = childFactory.createRetiredSinceNode();
        children.add(retiredSinceNode);
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
