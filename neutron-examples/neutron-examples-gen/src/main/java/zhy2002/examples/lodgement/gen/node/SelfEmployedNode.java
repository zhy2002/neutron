package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SelfEmployedNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SelfEmployedNode extends EmployedNode {

    @Inject
    public SelfEmployedNode(@Owner EmploymentNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SelfEmployedNode.class;
    }

    protected final SelfEmployedNodeComponent getComponent() {
        return component;
    }


    private SelfEmployedNodeComponent component;

    @Inject
    void createComponent(SelfEmployedNodeComponent.Builder builder) {
        this.component = builder.setSelfEmployedNodeModule(new SelfEmployedNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    //region children getters

    @JsMethod
    public BusinessTypeNode getBusinessTypeNode() {
        return (BusinessTypeNode)getChildByName("businessTypeNode");
    }

    @JsMethod
    public ProfitThisYearNode getProfitThisYearNode() {
        return (ProfitThisYearNode)getChildByName("profitThisYearNode");
    }

    @JsMethod
    public ProfitPreviousYearNode getProfitPreviousYearNode() {
        return (ProfitPreviousYearNode)getChildByName("profitPreviousYearNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("businessTypeNode");
        children.add(getComponent().createBusinessTypeNode());
        setChildNodeIdentity("profitThisYearNode");
        children.add(getComponent().createProfitThisYearNode());
        setChildNodeIdentity("profitPreviousYearNode");
        children.add(getComponent().createProfitPreviousYearNode());
        setChildNodeIdentity(null);
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
