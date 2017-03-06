package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

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

        //todo move source to a profile
    }

}
