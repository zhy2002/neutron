package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;

public  class RegisterNode extends ObjectUiNode<VoidUiNode>
{
    private UsernameNode usernameNode;
    private EmailNode emailNode;
    private PasswordNode passwordNode;
    private RepeatPasswordNode repeatPasswordNode;
    private AgeNode ageNode;
    private PlanNode planNode;
    private ReceiveOffersNode receiveOffersNode;
    private OwnInvestmentPropertyNode ownInvestmentPropertyNode;
    private PropertyDetailsNode residentialPropertyNode;
    private PropertyDetailsNode investmentPropertyNode;
    private PhoneInfoNode homePhoneNode;
    private ErrorListNode errorListNode;

    protected RegisterNode(@NotNull AbstractUiNodeContext<?> context) {
        super(context);
    }

    @JsMethod
    public Boolean getHasError() {
        return getStateValue(RegisterNodeConstants.HAS_ERROR, Boolean.FALSE);
    }

    @JsMethod
    public void setHasError(Boolean value) {
        setStateValue(RegisterNodeConstants.HAS_ERROR, Boolean.class, value);
    }

    @JsMethod
    public UsernameNode getUsernameNode() {
        return usernameNode;
    }

    @JsMethod
    public EmailNode getEmailNode() {
        return emailNode;
    }

    @JsMethod
    public PasswordNode getPasswordNode() {
        return passwordNode;
    }

    @JsMethod
    public RepeatPasswordNode getRepeatPasswordNode() {
        return repeatPasswordNode;
    }

    @JsMethod
    public AgeNode getAgeNode() {
        return ageNode;
    }

    @JsMethod
    public PlanNode getPlanNode() {
        return planNode;
    }

    @JsMethod
    public ReceiveOffersNode getReceiveOffersNode() {
        return receiveOffersNode;
    }

    @JsMethod
    public OwnInvestmentPropertyNode getOwnInvestmentPropertyNode() {
        return ownInvestmentPropertyNode;
    }

    @JsMethod
    public PropertyDetailsNode getResidentialPropertyNode() {
        return residentialPropertyNode;
    }

    @JsMethod
    public PropertyDetailsNode getInvestmentPropertyNode() {
        return investmentPropertyNode;
    }

    @JsMethod
    public PhoneInfoNode getHomePhoneNode() {
        return homePhoneNode;
    }

    @JsMethod
    public ErrorListNode getErrorListNode() {
        return errorListNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        usernameNode = context.createChildNode(UsernameNode.class, this, "usernameNode");
        children.add(usernameNode);
        emailNode = context.createChildNode(EmailNode.class, this, "emailNode");
        children.add(emailNode);
        passwordNode = context.createChildNode(PasswordNode.class, this, "passwordNode");
        children.add(passwordNode);
        repeatPasswordNode = context.createChildNode(RepeatPasswordNode.class, this, "repeatPasswordNode");
        children.add(repeatPasswordNode);
        ageNode = context.createChildNode(AgeNode.class, this, "ageNode");
        children.add(ageNode);
        planNode = context.createChildNode(PlanNode.class, this, "planNode");
        children.add(planNode);
        receiveOffersNode = context.createChildNode(ReceiveOffersNode.class, this, "receiveOffersNode");
        children.add(receiveOffersNode);
        ownInvestmentPropertyNode = context.createChildNode(OwnInvestmentPropertyNode.class, this, "ownInvestmentPropertyNode");
        children.add(ownInvestmentPropertyNode);
        residentialPropertyNode = context.createChildNode(PropertyDetailsNode.class, this, "residentialPropertyNode");
        children.add(residentialPropertyNode);
        investmentPropertyNode = context.createChildNode(PropertyDetailsNode.class, this, "investmentPropertyNode");
        children.add(investmentPropertyNode);
        homePhoneNode = context.createChildNode(PhoneInfoNode.class, this, "homePhoneNode");
        children.add(homePhoneNode);
        errorListNode = context.createChildNode(ErrorListNode.class, this, "errorListNode");
        children.add(errorListNode);
        return children;
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(SetHasErrorRule.class, this));
        createdRules.add(context.createUiNodeRule(CreateErrorNodeRule.class, this));
    }



}
