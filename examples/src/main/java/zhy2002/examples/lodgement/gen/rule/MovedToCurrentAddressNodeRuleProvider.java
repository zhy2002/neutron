package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@MovedToCurrentAddressNodeScope
public class MovedToCurrentAddressNodeRuleProvider extends MonthYearNodeRuleProvider {

    @Inject
    public MovedToCurrentAddressNodeRuleProvider() {}

    @Inject
    Provider<ToCurrentNoEarlierThanToPreviousRule> toCurrentNoEarlierThanToPreviousRuleProvider;
    @Inject
    Provider<ToCurrentNoEarlierThanFromPreviousRule> toCurrentNoEarlierThanFromPreviousRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(toCurrentNoEarlierThanToPreviousRuleProvider.get());
            createdRules.add(toCurrentNoEarlierThanFromPreviousRuleProvider.get());
    }

}
