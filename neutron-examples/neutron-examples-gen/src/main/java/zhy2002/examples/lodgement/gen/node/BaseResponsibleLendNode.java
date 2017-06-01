package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class BaseResponsibleLendNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    public BaseResponsibleLendNode(P parent, String name) {
        super(parent, name);
    }

    private BaseResponsibleLendNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(BaseResponsibleLendNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("responsibleTypeOfChangeNode");
        children.add(childFactory.createResponsibleTypeOfChangeNode());
        setChildNodeIdentity("responsibleMitigationMethodNode");
        children.add(childFactory.createResponsibleMitigationMethodNode());
        setChildNodeIdentity("responsibleSignificantChangeFlagNode");
        children.add(childFactory.createResponsibleSignificantChangeFlagNode());
        setChildNodeIdentity("responsibleRepaymentDifficultyNode");
        children.add(childFactory.createResponsibleRepaymentDifficultyNode());
        setChildNodeIdentity(null);
        return children;
    }

}
