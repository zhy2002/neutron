package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.BaseApplicantTypeNode;
import zhy2002.examples.lodgement.gen.di.*;


public class BaseApplicantTypeNodeRuleProvider implements RuleProvider<BaseApplicantTypeNode<?>> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BaseApplicantTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseApplicantTypeNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}