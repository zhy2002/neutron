package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.DobNode;



public abstract class DobNodeRuleProvider<N extends DobNode<?>>
    extends StringUiNodeRuleProvider <N> {


    @Inject
    Provider<DobRangeValidationRule> dobRangeValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(dobRangeValidationRuleProvider.get());
    }

}
