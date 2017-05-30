package zhy2002.examples.register.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.node.PhoneInfoNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.register.gen.di.*;
import zhy2002.examples.register.gen.rule.*;

@PhoneInfoNodeScope
public class PhoneInfoNodeRuleProvider implements RuleProvider<PhoneInfoNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PhoneInfoNodeRuleProvider() {
    }

    @Override
    public void initializeState(PhoneInfoNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<PhoneInfoAllOrNothingRule> phoneInfoAllOrNothingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        PhoneInfoAllOrNothingRule phoneInfoAllOrNothingRule = phoneInfoAllOrNothingRuleProvider.get();
        createdRules.add(phoneInfoAllOrNothingRule);
    }

}
