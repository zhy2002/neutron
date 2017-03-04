package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class SelectRelatedPersonNode extends ObjectUiNode<SelectRelatedPersonListNode<?>> {

    private RelatedPersonReferenceNode relatedPersonReferenceNode;
    private SelectRelatedPersonFlagNode selectRelatedPersonFlagNode;

    private SelectRelatedPersonNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(SelectRelatedPersonNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return SelectRelatedPersonNode.class;
    }

    private SelectRelatedPersonNodeComponent component;

    @Inject
    void createComponent(SelectRelatedPersonNodeComponent.Builder builder) {
        this.component = builder.setSelectRelatedPersonNodeModule(new SelectRelatedPersonNodeModule(this)).build();
    }

    @Override
    protected SelectRelatedPersonNodeRuleProvider getRuleProvider() {
        return component.getSelectRelatedPersonNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public SelectRelatedPersonNode(@NotNull SelectRelatedPersonListNode<?> parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public RelatedPersonReferenceNode getRelatedPersonReferenceNode() {
        return relatedPersonReferenceNode;
    }

    @JsMethod
    public SelectRelatedPersonFlagNode getSelectRelatedPersonFlagNode() {
        return selectRelatedPersonFlagNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        relatedPersonReferenceNode = childFactory.createRelatedPersonReferenceNode();
        children.add(relatedPersonReferenceNode);
        selectRelatedPersonFlagNode = childFactory.createSelectRelatedPersonFlagNode();
        children.add(selectRelatedPersonFlagNode);
        return children;
    }

}
