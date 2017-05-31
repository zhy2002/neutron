package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.CompanyGeneralNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class CompanyGeneralNodeRuleProvider implements RuleProvider<CompanyGeneralNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyGeneralNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyGeneralNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
