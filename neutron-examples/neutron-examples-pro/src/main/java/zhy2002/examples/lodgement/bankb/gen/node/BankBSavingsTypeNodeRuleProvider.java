package zhy2002.examples.lodgement.bankb.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ComponentScope
public class BankBSavingsTypeNodeRuleProvider extends SavingsTypeNodeRuleProvider {

    @Inject
    public BankBSavingsTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(SavingsTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.SAVINGS_ACCOUNT_TYPE);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
