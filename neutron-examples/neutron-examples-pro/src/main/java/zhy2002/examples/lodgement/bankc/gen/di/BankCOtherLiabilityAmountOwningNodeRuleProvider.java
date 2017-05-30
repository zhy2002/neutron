package zhy2002.examples.lodgement.bankc.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@OtherLiabilityAmountOwningNodeScope
public class BankCOtherLiabilityAmountOwningNodeRuleProvider extends OtherLiabilityAmountOwningNodeRuleProvider {

    @Inject
    public BankCOtherLiabilityAmountOwningNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityAmountOwningNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
