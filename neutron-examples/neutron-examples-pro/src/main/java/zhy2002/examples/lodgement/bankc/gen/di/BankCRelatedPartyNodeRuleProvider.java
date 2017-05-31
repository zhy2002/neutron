package zhy2002.examples.lodgement.bankc.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankc.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@ComponentScope
public class BankCRelatedPartyNodeRuleProvider extends RelatedPartyNodeRuleProvider {

    @Inject
    public BankCRelatedPartyNodeRuleProvider() {
    }

    @Override
    public void initializeState(RelatedPartyNode node) {
        super.initializeState(node);

    }

    @Inject
    Provider<UpdateRelatedPartyNodeLabelRule> updateRelatedPartyNodeLabelRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UpdateRelatedPartyNodeLabelRule updateRelatedPartyNodeLabelRule = updateRelatedPartyNodeLabelRuleProvider.get();
        createdRules.add(updateRelatedPartyNodeLabelRule);
    }

}
