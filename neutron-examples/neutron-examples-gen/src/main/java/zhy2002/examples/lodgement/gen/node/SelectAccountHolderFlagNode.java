package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class SelectAccountHolderFlagNode extends BooleanUiNode<SelectAccountHolderNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return SelectAccountHolderFlagNode.class;
    }

    private SelectAccountHolderFlagNodeComponent component;

    @Inject
    void createComponent(SelectAccountHolderFlagNodeComponent.Builder builder) {
        this.component = builder.setSelectAccountHolderFlagNodeModule(new SelectAccountHolderFlagNodeModule(this)).build();
    }

    @Override
    protected SelectAccountHolderFlagNodeRuleProvider getRuleProvider() {
        return component.getSelectAccountHolderFlagNodeRuleProvider();
    }

    public SelectAccountHolderFlagNode(@NotNull SelectAccountHolderNode parent, String name) {
        super(parent, name);
    }

}
