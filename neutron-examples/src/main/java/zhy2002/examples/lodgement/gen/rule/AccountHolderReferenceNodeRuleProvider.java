package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.AccountHolderReferenceNode;


@AccountHolderReferenceNodeScope
public class AccountHolderReferenceNodeRuleProvider
    extends ReferenceUiNodeRuleProvider<AccountHolderReferenceNode> {

    @Inject
    public AccountHolderReferenceNodeRuleProvider() {}

    @Override
    public void initializeState(AccountHolderReferenceNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
