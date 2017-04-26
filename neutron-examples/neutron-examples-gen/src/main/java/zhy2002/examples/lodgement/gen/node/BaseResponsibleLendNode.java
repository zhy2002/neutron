package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class BaseResponsibleLendNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    private ResponsibleTypeOfChangeNode responsibleTypeOfChangeNode;
    private ResponsibleMitigationMethodNode responsibleMitigationMethodNode;
    private ResponsibleSignificantChangeFlagNode responsibleSignificantChangeFlagNode;
    private ResponsibleRepaymentDifficultyNode responsibleRepaymentDifficultyNode;

    private BaseResponsibleLendNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(BaseResponsibleLendNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }


    public BaseResponsibleLendNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public ResponsibleTypeOfChangeNode getResponsibleTypeOfChangeNode() {
        return responsibleTypeOfChangeNode;
    }

    @JsMethod
    public ResponsibleMitigationMethodNode getResponsibleMitigationMethodNode() {
        return responsibleMitigationMethodNode;
    }

    @JsMethod
    public ResponsibleSignificantChangeFlagNode getResponsibleSignificantChangeFlagNode() {
        return responsibleSignificantChangeFlagNode;
    }

    @JsMethod
    public ResponsibleRepaymentDifficultyNode getResponsibleRepaymentDifficultyNode() {
        return responsibleRepaymentDifficultyNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        responsibleTypeOfChangeNode = childFactory.createResponsibleTypeOfChangeNode();
        children.add(responsibleTypeOfChangeNode);
        responsibleMitigationMethodNode = childFactory.createResponsibleMitigationMethodNode();
        children.add(responsibleMitigationMethodNode);
        responsibleSignificantChangeFlagNode = childFactory.createResponsibleSignificantChangeFlagNode();
        children.add(responsibleSignificantChangeFlagNode);
        responsibleRepaymentDifficultyNode = childFactory.createResponsibleRepaymentDifficultyNode();
        children.add(responsibleRepaymentDifficultyNode);
        return children;
    }

}
