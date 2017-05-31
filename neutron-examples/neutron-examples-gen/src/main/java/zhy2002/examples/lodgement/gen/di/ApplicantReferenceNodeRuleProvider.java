package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.ApplicantReferenceNode;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@ComponentScope
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
