package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@DefenseServiceFlagNodeScope
public class DefenseServiceFlagNodeRuleProvider extends BooleanUiNodeRuleProvider {

    @Inject
    public DefenseServiceFlagNodeRuleProvider() {}


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
