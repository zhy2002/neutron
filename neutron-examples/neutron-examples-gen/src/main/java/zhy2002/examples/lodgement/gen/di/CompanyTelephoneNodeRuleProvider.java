package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyTelephoneNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyTelephoneNodeScope
public class CompanyTelephoneNodeRuleProvider implements RuleProvider<CompanyTelephoneNode> {

    @Inject
    TelephoneNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyTelephoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyTelephoneNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
