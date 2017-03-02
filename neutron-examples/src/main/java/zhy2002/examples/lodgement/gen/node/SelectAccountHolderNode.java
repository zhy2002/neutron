package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class SelectAccountHolderNode extends ObjectUiNode<SelectAccountHolderListNode<?>> {

    private AccountHolderReferenceNode accountHolderReferenceNode;
    private SelectAccountHolderFlagNode selectAccountHolderFlagNode;

    private SelectAccountHolderNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(SelectAccountHolderNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return SelectAccountHolderNode.class;
    }

    private SelectAccountHolderNodeComponent component;

    @Inject
    void createComponent(SelectAccountHolderNodeComponent.Builder builder) {
        this.component = builder.setSelectAccountHolderNodeModule(new SelectAccountHolderNodeModule(this)).build();
    }

    @Override
    protected SelectAccountHolderNodeRuleProvider getRuleProvider() {
        return component.getSelectAccountHolderNodeRuleProvider();
    }

    public SelectAccountHolderNode(@NotNull SelectAccountHolderListNode<?> parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public AccountHolderReferenceNode getAccountHolderReferenceNode() {
        return accountHolderReferenceNode;
    }

    @JsMethod
    public SelectAccountHolderFlagNode getSelectAccountHolderFlagNode() {
        return selectAccountHolderFlagNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        accountHolderReferenceNode = childFactory.createAccountHolderReferenceNode();
        children.add(accountHolderReferenceNode);
        selectAccountHolderFlagNode = childFactory.createSelectAccountHolderFlagNode();
        children.add(selectAccountHolderFlagNode);
        return children;
    }

}
