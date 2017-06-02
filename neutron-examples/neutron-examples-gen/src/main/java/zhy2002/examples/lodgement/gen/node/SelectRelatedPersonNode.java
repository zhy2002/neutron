package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SelectRelatedPersonNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SelectRelatedPersonNode extends ObjectUiNode<SelectRelatedPersonListNode<?>> {

    @Inject
    protected SelectRelatedPersonNode(@Owner SelectRelatedPersonListNode<?> parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SelectRelatedPersonNode.class;
    }

    protected final SelectRelatedPersonNodeComponent getComponent() {
        return component;
    }


    private SelectRelatedPersonNodeComponent component;

    @Inject
    void createComponent(SelectRelatedPersonNodeComponent.Builder builder) {
        this.component = builder.setSelectRelatedPersonNodeModule(new SelectRelatedPersonNodeModule(this)).build();
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
    public RelatedPersonReferenceNode getRelatedPersonReferenceNode() {
        return (RelatedPersonReferenceNode)getChildByName("relatedPersonReferenceNode");
    }

    @JsMethod
    public SelectRelatedPersonFlagNode getSelectRelatedPersonFlagNode() {
        return (SelectRelatedPersonFlagNode)getChildByName("selectRelatedPersonFlagNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("relatedPersonReferenceNode");
        children.add(getComponent().createRelatedPersonReferenceNode());
        setChildNodeIdentity("selectRelatedPersonFlagNode");
        children.add(getComponent().createSelectRelatedPersonFlagNode());
        setChildNodeIdentity(null);
        return children;
    }

}
