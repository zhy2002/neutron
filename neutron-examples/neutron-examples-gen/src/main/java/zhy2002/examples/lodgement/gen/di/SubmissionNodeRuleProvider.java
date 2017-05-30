package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.SubmissionNode;
import zhy2002.examples.lodgement.gen.di.*;

@SubmissionNodeScope
public class SubmissionNodeRuleProvider implements RuleProvider<SubmissionNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SubmissionNodeRuleProvider() {
    }

    @Override
    public void initializeState(SubmissionNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
