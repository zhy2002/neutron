package zhy2002.examples.app.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.app.gen.di.*;
import javax.inject.*;

@LodgementNodeScope
public class LodgementNodeRuleProvider extends ObjectUiNodeRuleProvider {

    @Inject
    public LodgementNodeRuleProvider() {}

    @Inject
    Provider<DummyRule> dummyRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(dummyRuleProvider.get());
    }

}
