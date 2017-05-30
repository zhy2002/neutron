package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyApplicationTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyApplicationTypeNodeScope
public class CompanyApplicationTypeNodeRuleProvider implements RuleProvider<CompanyApplicationTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyApplicationTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyApplicationTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
