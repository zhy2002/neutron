package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ApplicantReferenceNode;


@ApplicantReferenceNodeScope
public class ApplicantReferenceNodeRuleProvider
    extends ReferenceUiNodeRuleProvider<ApplicantReferenceNode> {

    @Inject
    public ApplicantReferenceNodeRuleProvider() {}

    @Override
    public void initializeState(ApplicantReferenceNode node) {
    }


    @Inject
    Provider<RemoveOwnershipNodeRule> removeOwnershipNodeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(removeOwnershipNodeRuleProvider.get());
    }

}