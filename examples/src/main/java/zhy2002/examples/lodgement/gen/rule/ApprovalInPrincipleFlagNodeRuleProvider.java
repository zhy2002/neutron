package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@ApprovalInPrincipleFlagNodeScope
public class ApprovalInPrincipleFlagNodeRuleProvider extends BooleanUiNodeRuleProvider {

    @Inject
    public ApprovalInPrincipleFlagNodeRuleProvider() {}


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
