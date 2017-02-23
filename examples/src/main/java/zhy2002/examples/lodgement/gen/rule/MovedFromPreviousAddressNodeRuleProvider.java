package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@MovedFromPreviousAddressNodeScope
public class MovedFromPreviousAddressNodeRuleProvider extends MonthYearNodeRuleProvider {

    @Inject
    public MovedFromPreviousAddressNodeRuleProvider() {}

    @Inject
    Provider<FromPreviousNoEarlierThanToPreviousRule> fromPreviousNoEarlierThanToPreviousRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(fromPreviousNoEarlierThanToPreviousRuleProvider.get());
    }

}
