package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PayeEmployedNode extends EmployedNode {

    private GrossYearlySalaryNode grossYearlySalaryNode;

    private PayeEmployedNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PayeEmployedNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PayeEmployedNode.class;
    }

    private PayeEmployedNodeComponent component;

    @Inject
    void createComponent(PayeEmployedNodeComponent.Builder builder) {
        this.component = builder.setPayeEmployedNodeModule(new PayeEmployedNodeModule(this)).build();
    }

    private PayeEmployedNodeRuleProvider getRuleProvider() {
        return component.getPayeEmployedNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public PayeEmployedNode(@NotNull EmploymentNode<?> parent, String name) {
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
