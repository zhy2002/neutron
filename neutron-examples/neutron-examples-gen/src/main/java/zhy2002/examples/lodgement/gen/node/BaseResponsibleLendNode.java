package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BaseResponsibleLendNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class BaseResponsibleLendNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    public BaseResponsibleLendNode(P parent) {
        super(parent);
    }

    protected abstract BaseResponsibleLendNodeComponent getComponent();


    //region children getters

    @JsMethod
    public ResponsibleTypeOfChangeNode getResponsibleTypeOfChangeNode() {
        return (ResponsibleTypeOfChangeNode)getChildByName("responsibleTypeOfChangeNode");
    }

    @JsMethod
    public ResponsibleMitigationMethodNode getResponsibleMitigationMethodNode() {
        return (ResponsibleMitigationMethodNode)getChildByName("responsibleMitigationMethodNode");
    }

    @JsMethod
    public ResponsibleSignificantChangeFlagNode getResponsibleSignificantChangeFlagNode() {
        return (ResponsibleSignificantChangeFlagNode)getChildByName("responsibleSignificantChangeFlagNode");
    }

    @JsMethod
    public ResponsibleRepaymentDifficultyNode getResponsibleRepaymentDifficultyNode() {
        return (ResponsibleRepaymentDifficultyNode)getChildByName("responsibleRepaymentDifficultyNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("responsibleTypeOfChangeNode");
        children.add(getComponent().createResponsibleTypeOfChangeNode());
        setChildNodeIdentity("responsibleMitigationMethodNode");
        children.add(getComponent().createResponsibleMitigationMethodNode());
        setChildNodeIdentity("responsibleSignificantChangeFlagNode");
        children.add(getComponent().createResponsibleSignificantChangeFlagNode());
        setChildNodeIdentity("responsibleRepaymentDifficultyNode");
        children.add(getComponent().createResponsibleRepaymentDifficultyNode());
        setChildNodeIdentity(null);
        return children;
    }

}
