package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.TrustBeneficialOwnerListNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class TrustBeneficialOwnerListNodeRuleProvider implements RuleProvider<TrustBeneficialOwnerListNode> {

    @Inject
    SelectRelatedPersonListNodeRuleProvider parentRuleProvider;

    @Inject
    public TrustBeneficialOwnerListNodeRuleProvider() {
    }

    @Override
    public void initializeState(TrustBeneficialOwnerListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
