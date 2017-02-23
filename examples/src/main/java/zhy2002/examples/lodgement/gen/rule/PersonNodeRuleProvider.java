package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@PersonNodeScope
public class PersonNodeRuleProvider extends ObjectUiNodeRuleProvider {

    @Inject
    public PersonNodeRuleProvider() {}

    @Inject
    Provider<UpdatePersonNodeLabelRule> updatePersonNodeLabelRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(updatePersonNodeLabelRuleProvider.get());
    }

}
