package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;

public  class ContactNode extends ObjectUiNode<PersonNode>
{
    private ContactTelephoneNode HomePhoneNode;
    private ContactTelephoneNode WorkPhoneNode;

    protected ContactNode(PersonNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public ContactTelephoneNode getHomePhoneNode() {
        return HomePhoneNode;
    }

    @JsMethod
    public ContactTelephoneNode getWorkPhoneNode() {
        return WorkPhoneNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        UiNodeContext<?> context = getContext();

        HomePhoneNode = context.createChildNode(ContactTelephoneNode.class, this, "HomePhoneNode");
        WorkPhoneNode = context.createChildNode(ContactTelephoneNode.class, this, "WorkPhoneNode");

        return Arrays.asList(
            HomePhoneNode,
            WorkPhoneNode
        );
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(HomeOrWorkPhoneRequiredRule.class, this));
    }


}
