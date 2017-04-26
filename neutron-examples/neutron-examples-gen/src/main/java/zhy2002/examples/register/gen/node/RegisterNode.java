package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.register.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.event.*;

@Singleton
public class RegisterNode extends RootUiNode<VoidUiNode> {

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

    private RuleProvider<RegisterNode> getRuleProvider() {
        return component.getRegisterNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

    @Override
    protected final NodeLoadEvent<RegisterNode> createNodeLoadEvent() {
        return new RegisterNodeLoadEvent(this);
    }

    @Override
    protected final NodeUnloadEvent<RegisterNode> createNodeUnloadEvent() {
        return new RegisterNodeUnloadEvent(this);
    }


    @Inject
    public RegisterNode(@NotNull RegisterNodeContext context) {
        super(context);
    }

    public static final PropertyMetadata<Boolean> HAS_ERROR_PROPERTY = MetadataRegistry.createProperty(RegisterNode.class, "hasError", Boolean.class, Boolean.FALSE);

    @JsMethod
    public Boolean getHasError() {
        return getStateValue(HAS_ERROR_PROPERTY);
    }

    @JsMethod
    public void setHasError(Boolean value) {
        setStateValue(HAS_ERROR_PROPERTY, value);
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
