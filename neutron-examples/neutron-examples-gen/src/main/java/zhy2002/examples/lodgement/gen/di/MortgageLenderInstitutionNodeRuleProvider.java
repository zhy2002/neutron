package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.MortgageLenderInstitutionNode;
import zhy2002.examples.lodgement.gen.di.*;

@MortgageLenderInstitutionNodeScope
public class MortgageLenderInstitutionNodeRuleProvider implements RuleProvider<MortgageLenderInstitutionNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public MortgageLenderInstitutionNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageLenderInstitutionNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
