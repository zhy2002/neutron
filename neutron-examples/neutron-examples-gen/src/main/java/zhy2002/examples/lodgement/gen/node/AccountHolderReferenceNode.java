package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AccountHolderReferenceNode extends ReferenceUiNode<SelectAccountHolderNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AccountHolderReferenceNode.class;
    }

    private AccountHolderReferenceNodeComponent component;

    @Inject
    void createComponent(AccountHolderReferenceNodeComponent.Builder builder) {
        this.component = builder.setAccountHolderReferenceNodeModule(new AccountHolderReferenceNodeModule(this)).build();
    }

    private AccountHolderReferenceNodeRuleProvider getRuleProvider() {
        return component.getAccountHolderReferenceNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public AccountHolderReferenceNode(@NotNull SelectAccountHolderNode parent, String name) {
        super(parent, name);
    }

}
