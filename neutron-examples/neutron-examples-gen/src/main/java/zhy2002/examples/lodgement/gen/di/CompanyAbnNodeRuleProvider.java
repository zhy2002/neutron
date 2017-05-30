package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyAbnNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyAbnNodeScope
public class CompanyAbnNodeRuleProvider implements RuleProvider<CompanyAbnNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyAbnNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyAbnNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
