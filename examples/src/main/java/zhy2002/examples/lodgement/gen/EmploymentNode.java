package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class EmploymentNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    private EmploymentTypeNode employmentTypeNode;
    private PayeEmployedNode payeEmployedNode;
    private SelfEmployedNode selfEmployedNode;
    private UnemployedNode unemployedNode;
    private RetiredEmploymentNode retiredEmploymentNode;

    private EmploymentNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(EmploymentNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    protected abstract EmploymentNodeRuleProvider getRuleProvider();

    public EmploymentNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public EmploymentTypeNode getEmploymentTypeNode() {
        return employmentTypeNode;
    }

    @JsMethod
    public PayeEmployedNode getPayeEmployedNode() {
        return payeEmployedNode;
    }

    @JsMethod
    public SelfEmployedNode getSelfEmployedNode() {
        return selfEmployedNode;
    }

    @JsMethod
    public UnemployedNode getUnemployedNode() {
        return unemployedNode;
    }

    @JsMethod
    public RetiredEmploymentNode getRetiredEmploymentNode() {
        return retiredEmploymentNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        employmentTypeNode = childFactory.createEmploymentTypeNode();
        children.add(employmentTypeNode);
        payeEmployedNode = childFactory.createPayeEmployedNode();
        children.add(payeEmployedNode);
        selfEmployedNode = childFactory.createSelfEmployedNode();
        children.add(selfEmployedNode);
        unemployedNode = childFactory.createUnemployedNode();
        children.add(unemployedNode);
        retiredEmploymentNode = childFactory.createRetiredEmploymentNode();
        children.add(retiredEmploymentNode);
        return children;
    }

}
