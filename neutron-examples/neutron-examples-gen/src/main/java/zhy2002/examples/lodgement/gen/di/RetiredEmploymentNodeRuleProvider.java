package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.RetiredEmploymentNode;
import zhy2002.examples.lodgement.gen.di.*;

@RetiredEmploymentNodeScope
public class RetiredEmploymentNodeRuleProvider implements RuleProvider<RetiredEmploymentNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public RetiredEmploymentNodeRuleProvider() {
    }

    @Override
    public void initializeState(RetiredEmploymentNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
