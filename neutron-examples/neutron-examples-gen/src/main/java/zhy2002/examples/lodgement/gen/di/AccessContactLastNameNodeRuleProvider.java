package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.AccessContactLastNameNode;
import zhy2002.examples.lodgement.gen.di.*;

@AccessContactLastNameNodeScope
public class AccessContactLastNameNodeRuleProvider implements RuleProvider<AccessContactLastNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AccessContactLastNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessContactLastNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
