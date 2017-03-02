package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonResponsibleLendNode;


@PersonResponsibleLendNodeScope
public class PersonResponsibleLendNodeRuleProvider
    extends BaseResponsibleLendNodeRuleProvider<PersonResponsibleLendNode> {

    @Inject
    public PersonResponsibleLendNodeRuleProvider() {}

    @Override
    public void initializeState(PersonResponsibleLendNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
