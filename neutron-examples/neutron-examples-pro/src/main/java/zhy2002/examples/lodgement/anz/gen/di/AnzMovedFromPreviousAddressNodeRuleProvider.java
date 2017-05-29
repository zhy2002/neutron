package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.anz.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@MovedFromPreviousAddressNodeScope
public class AnzMovedFromPreviousAddressNodeRuleProvider extends MovedFromPreviousAddressNodeRuleProvider {

    @Inject
    public AnzMovedFromPreviousAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(MovedFromPreviousAddressNode node) {
        super.initializeState(node);

    }

    @Inject
    Provider<FromPreviousNoEarlierThanToPreviousRule> fromPreviousNoEarlierThanToPreviousRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        FromPreviousNoEarlierThanToPreviousRule fromPreviousNoEarlierThanToPreviousRule = fromPreviousNoEarlierThanToPreviousRuleProvider.get();
        createdRules.add(fromPreviousNoEarlierThanToPreviousRule);
    }

}
