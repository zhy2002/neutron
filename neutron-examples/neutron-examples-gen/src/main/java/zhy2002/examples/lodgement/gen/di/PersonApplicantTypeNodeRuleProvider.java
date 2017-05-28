package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PersonApplicantTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@PersonApplicantTypeNodeScope
public class PersonApplicantTypeNodeRuleProvider implements RuleProvider<PersonApplicantTypeNode> {

    @Inject
    BaseApplicantTypeNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonApplicantTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonApplicantTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
