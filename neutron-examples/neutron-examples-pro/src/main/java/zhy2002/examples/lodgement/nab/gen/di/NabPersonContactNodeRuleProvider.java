package zhy2002.examples.lodgement.nab.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.nab.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@PersonContactNodeScope
public class NabPersonContactNodeRuleProvider extends PersonContactNodeRuleProvider {

    @Inject
    public NabPersonContactNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonContactNode node) {
        super.initializeState(node);

    }

    @Inject
    Provider<HomeOrWorkPhoneRequiredRule> homeOrWorkPhoneRequiredRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        HomeOrWorkPhoneRequiredRule homeOrWorkPhoneRequiredRule = homeOrWorkPhoneRequiredRuleProvider.get();
        createdRules.add(homeOrWorkPhoneRequiredRule);
    }

}
