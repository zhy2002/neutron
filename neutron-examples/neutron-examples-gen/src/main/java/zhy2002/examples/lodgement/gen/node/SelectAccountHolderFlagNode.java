package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SelectAccountHolderFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SelectAccountHolderFlagNode extends BooleanUiNode<SelectAccountHolderNode> {

    @Inject
    protected SelectAccountHolderFlagNode(@Owner SelectAccountHolderNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SelectAccountHolderFlagNode.class;
    }

    protected final SelectAccountHolderFlagNodeComponent getComponent() {
        return component;
    }


    private SelectAccountHolderFlagNodeComponent component;

    @Inject
    void createComponent(SelectAccountHolderFlagNodeComponent.Builder builder) {
        this.component = builder.setSelectAccountHolderFlagNodeModule(new SelectAccountHolderFlagNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
