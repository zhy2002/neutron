package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@ApplicantReferenceNodeScope
public class ApplicantReferenceNodeRuleProvider extends ReferenceUiNodeRuleProvider {

    @Inject
    public ApplicantReferenceNodeRuleProvider() {}

    @Inject
    Provider<RemoveOwnershipNodeRule> removeOwnershipNodeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(removeOwnershipNodeRuleProvider.get());
    }

}
