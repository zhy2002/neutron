package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.AccountHolderReferenceNode;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@AccountHolderReferenceNodeScope
public class AccountHolderReferenceNodeRuleProvider implements RuleProvider<AccountHolderReferenceNode> {

    @Inject
    ReferenceUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AccountHolderReferenceNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccountHolderReferenceNode node) {
        parentRuleProvider.initializeState(node);

        node.setRemoveEmpty(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
