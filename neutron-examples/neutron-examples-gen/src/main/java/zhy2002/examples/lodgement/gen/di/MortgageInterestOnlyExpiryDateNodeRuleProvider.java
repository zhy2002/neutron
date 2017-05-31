package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.MortgageInterestOnlyExpiryDateNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class MortgageInterestOnlyExpiryDateNodeRuleProvider implements RuleProvider<MortgageInterestOnlyExpiryDateNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public MortgageInterestOnlyExpiryDateNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageInterestOnlyExpiryDateNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
