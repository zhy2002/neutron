package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@ApplicantReferenceNodeScope
public class ApplicantReferenceNodeRuleProvider implements RuleProvider<ApplicantReferenceNode> {

    @Inject
    ReferenceUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ApplicantReferenceNodeRuleProvider() {
    }

    @Override
    public void initializeState(ApplicantReferenceNode node) {
        parentRuleProvider.initializeState(node);

        node.setRemoveEmpty(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
