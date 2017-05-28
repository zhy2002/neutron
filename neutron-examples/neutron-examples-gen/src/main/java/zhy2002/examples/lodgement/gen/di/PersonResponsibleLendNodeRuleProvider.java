package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PersonResponsibleLendNode;
import zhy2002.examples.lodgement.gen.di.*;

@PersonResponsibleLendNodeScope
public class PersonResponsibleLendNodeRuleProvider implements RuleProvider<PersonResponsibleLendNode> {

    @Inject
    BaseResponsibleLendNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonResponsibleLendNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonResponsibleLendNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
