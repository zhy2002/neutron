package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.RegisterNodeComponent;
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

    @Inject
    public RegisterNode(@NotNull RegisterNodeContext context) {
        super(context);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return RegisterNode.class;
    }

    private RegisterNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(RegisterNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }



    protected final RegisterNodeComponent getComponent() {
        return component;
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

    public static final PropertyMetadata<Boolean> HAS_ERROR_PROPERTY = MetadataRegistry.createProperty(RegisterNode.class, "hasError", Boolean.class, Boolean.FALSE);

    @JsMethod
    public Boolean getHasError() {
        return getStateValue(HAS_ERROR_PROPERTY);
    }

    @JsMethod
    public void setHasError(Boolean value) {
        setStateValue(HAS_ERROR_PROPERTY, value);
    }

    //region children getters

    @JsMethod
    public UsernameNode getUsernameNode() {
        return (UsernameNode)getChildByName("usernameNode");
    }

    @JsMethod
    public EmailNode getEmailNode() {
        return (EmailNode)getChildByName("emailNode");
    }

    @JsMethod
    public PasswordNode getPasswordNode() {
        return (PasswordNode)getChildByName("passwordNode");
    }

    @JsMethod
    public RepeatPasswordNode getRepeatPasswordNode() {
        return (RepeatPasswordNode)getChildByName("repeatPasswordNode");
    }

    @JsMethod
    public AgeNode getAgeNode() {
        return (AgeNode)getChildByName("ageNode");
    }

    @JsMethod
    public PlanNode getPlanNode() {
        return (PlanNode)getChildByName("planNode");
    }

    @JsMethod
    public ReceiveOffersNode getReceiveOffersNode() {
        return (ReceiveOffersNode)getChildByName("receiveOffersNode");
    }

    @JsMethod
    public OwnInvestmentPropertyNode getOwnInvestmentPropertyNode() {
        return (OwnInvestmentPropertyNode)getChildByName("ownInvestmentPropertyNode");
    }

    @JsMethod
    public PropertyDetailsNode getResidentialPropertyNode() {
        return (PropertyDetailsNode)getChildByName("residentialPropertyNode");
    }

    @JsMethod
    public PropertyDetailsNode getInvestmentPropertyNode() {
        return (PropertyDetailsNode)getChildByName("investmentPropertyNode");
    }

    @JsMethod
    public PhoneInfoNode getHomePhoneNode() {
        return (PhoneInfoNode)getChildByName("homePhoneNode");
    }

    @JsMethod
    public ErrorListNode getErrorListNode() {
        return (ErrorListNode)getChildByName("errorListNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("usernameNode");
        children.add(getComponent().createUsernameNode());
        setChildNodeIdentity("emailNode");
        children.add(getComponent().createEmailNode());
        setChildNodeIdentity("passwordNode");
        children.add(getComponent().createPasswordNode());
        setChildNodeIdentity("repeatPasswordNode");
        children.add(getComponent().createRepeatPasswordNode());
        setChildNodeIdentity("ageNode");
        children.add(getComponent().createAgeNode());
        setChildNodeIdentity("planNode");
        children.add(getComponent().createPlanNode());
        setChildNodeIdentity("receiveOffersNode");
        children.add(getComponent().createReceiveOffersNode());
        setChildNodeIdentity("ownInvestmentPropertyNode");
        children.add(getComponent().createOwnInvestmentPropertyNode());
        setChildNodeIdentity("residentialPropertyNode");
        children.add(getComponent().createResidentialPropertyNode());
        setChildNodeIdentity("investmentPropertyNode");
        children.add(getComponent().createInvestmentPropertyNode());
        setChildNodeIdentity("homePhoneNode");
        children.add(getComponent().createHomePhoneNode());
        setChildNodeIdentity("errorListNode");
        children.add(getComponent().createErrorListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
