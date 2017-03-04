package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import zhy2002.examples.register.gen.*;


@Singleton
public class RegisterNode extends ObjectUiNode<VoidUiNode> {

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

    private RegisterNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(RegisterNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return RegisterNode.class;
    }

    private RegisterNodeComponent component;

    @Inject
    void createComponent(RegisterNodeComponent.Builder builder) {
        this.component = builder.setRegisterNodeModule(new RegisterNodeModule(this)).build();
    }

    @Override
    protected RegisterNodeRuleProvider getRuleProvider() {
        return component.getRegisterNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    @Inject
    public RegisterNode(@NotNull RegisterNodeContext context) {
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
        usernameNode = childFactory.createUsernameNode();
        children.add(usernameNode);
        emailNode = childFactory.createEmailNode();
        children.add(emailNode);
        passwordNode = childFactory.createPasswordNode();
        children.add(passwordNode);
        repeatPasswordNode = childFactory.createRepeatPasswordNode();
        children.add(repeatPasswordNode);
        ageNode = childFactory.createAgeNode();
        children.add(ageNode);
        planNode = childFactory.createPlanNode();
        children.add(planNode);
        receiveOffersNode = childFactory.createReceiveOffersNode();
        children.add(receiveOffersNode);
        ownInvestmentPropertyNode = childFactory.createOwnInvestmentPropertyNode();
        children.add(ownInvestmentPropertyNode);
        residentialPropertyNode = childFactory.createResidentialPropertyNode();
        children.add(residentialPropertyNode);
        investmentPropertyNode = childFactory.createInvestmentPropertyNode();
        children.add(investmentPropertyNode);
        homePhoneNode = childFactory.createHomePhoneNode();
        children.add(homePhoneNode);
        errorListNode = childFactory.createErrorListNode();
        children.add(errorListNode);
        return children;
    }

}
