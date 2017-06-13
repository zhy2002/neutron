package zhy2002.examples.lodgement.bankb.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankb.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@ComponentScope
public class BankBMovedToCurrentAddressNodeRuleProvider extends MovedToCurrentAddressNodeRuleProvider {

    @Inject
    public BankBMovedToCurrentAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(MovedToCurrentAddressNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Inject
    Provider<ToCurrentNoEarlierThanToPreviousRule> toCurrentNoEarlierThanToPreviousRuleProvider;
    @Inject
    Provider<ToCurrentNoEarlierThanFromPreviousRule> toCurrentNoEarlierThanFromPreviousRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        {
            ToCurrentNoEarlierThanToPreviousRule toCurrentNoEarlierThanToPreviousRule = toCurrentNoEarlierThanToPreviousRuleProvider.get();
            createdRules.add(toCurrentNoEarlierThanToPreviousRule);
        }
        {
            ToCurrentNoEarlierThanFromPreviousRule toCurrentNoEarlierThanFromPreviousRule = toCurrentNoEarlierThanFromPreviousRuleProvider.get();
            createdRules.add(toCurrentNoEarlierThanFromPreviousRule);
        }
    }

}
