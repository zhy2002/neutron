package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ContactEmailNode;


@ContactEmailNodeScope
public class ContactEmailNodeRuleProvider
    extends EmailNodeRuleProvider<ContactEmailNode> {

    @Inject
    public ContactEmailNodeRuleProvider() {}

    @Override
    public void initializeState(ContactEmailNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
