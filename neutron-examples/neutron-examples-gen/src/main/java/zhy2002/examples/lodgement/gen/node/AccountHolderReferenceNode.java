package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AccountHolderReferenceNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AccountHolderReferenceNode extends ReferenceUiNode<SelectAccountHolderNode> {

    @Inject
    protected AccountHolderReferenceNode(@Owner SelectAccountHolderNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AccountHolderReferenceNode.class;
    }

    protected final AccountHolderReferenceNodeComponent getComponent() {
        return component;
    }


    private AccountHolderReferenceNodeComponent component;

    @Inject
    void createComponent(AccountHolderReferenceNodeComponent.Builder builder) {
        this.component = builder.setAccountHolderReferenceNodeModule(new AccountHolderReferenceNodeModule(this)).build();
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
