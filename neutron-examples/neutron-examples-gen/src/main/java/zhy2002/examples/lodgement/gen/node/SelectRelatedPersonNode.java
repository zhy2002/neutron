package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class SelectRelatedPersonNode extends ObjectUiNode<SelectRelatedPersonListNode<?>> {
    private SelectRelatedPersonNodeChildFactory childFactory;
    private SelectRelatedPersonNodeComponent component;

    public SelectRelatedPersonNode(@NotNull SelectRelatedPersonListNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return SelectRelatedPersonNode.class;
    }

    @Inject
    void receiveNodeProvider(SelectRelatedPersonNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(SelectRelatedPersonNodeComponent.Builder builder) {
        this.component = builder.setSelectRelatedPersonNodeModule(new SelectRelatedPersonNodeModule(this)).build();
    }

    private RuleProvider<SelectRelatedPersonNode> getRuleProvider() {
        return component.getSelectRelatedPersonNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

    @JsMethod
    public RelatedPersonReferenceNode getRelatedPersonReferenceNode() {
        return (RelatedPersonReferenceNode)getChildByName("relatedPersonReferenceNode");
    }

    @JsMethod
    public SelectRelatedPersonFlagNode getSelectRelatedPersonFlagNode() {
        return (SelectRelatedPersonFlagNode)getChildByName("selectRelatedPersonFlagNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("relatedPersonReferenceNode");
        children.add(childFactory.createRelatedPersonReferenceNode());
        setChildNodeIdentity("selectRelatedPersonFlagNode");
        children.add(childFactory.createSelectRelatedPersonFlagNode());
        setChildNodeIdentity(null);
        return children;
    }

}
