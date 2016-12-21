package zhy2002.examples.register.gen;

import zhy2002.examples.register.gen.event.*;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.ObjectStateChangeEventFactory;
import zhy2002.neutron.UiNodeRuleFactory;
import zhy2002.neutron.data.ValidationErrorList;
import zhy2002.neutron.event.BigDecimalStateChangeEventFactory;
import zhy2002.neutron.event.BooleanStateChangeEventFactory;
import zhy2002.neutron.event.StringStateChangeEventFactory;
import zhy2002.neutron.event.ValidationErrorListStateChangeEventFactory;
import zhy2002.neutron.node.BigDecimalUiNode;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.rule.*;

import java.math.BigDecimal;

/**
 * The generated factory register with all the default implementation instances.
 */
public class RegisterClassRegistry extends ClassRegistryImpl {

    public RegisterClassRegistry() {
        loadChildNodeFactories();
        loadNodeConfig();
        loadRuleFactories();
        loadStateChangeEventFactories();
        loadNodeAddEventFactories();
        loadNodeRemoveEventFactories();
        loadNodeLoadEventFactories();
        loadNodeUnloadEventFactories();

    }

    private void loadChildNodeFactories() {
        setChildNodeFactory(UsernameNode.class, new UsernameNodeFactory());
        setChildNodeFactory(PasswordNode.class, new PasswordNodeFactory());
        setChildNodeFactory(ErrorListNode.class, new ErrorListNodeFactory());
        setChildNodeFactory(ErrorNode.class, new ErrorNodeFactory());
        setChildNodeFactory(EmailNode.class, new EmailNodeFactory());
        setChildNodeFactory(RepeatPasswordNode.class, new RepeatPasswordNodeFactory());
        setChildNodeFactory(ReceiveOffersNode.class, new ReceiveOffersNodeFactory());
        setChildNodeFactory(AgeNode.class, new AgeNodeFactory());
        setChildNodeFactory(OwnInvestmentPropertyNode.class, new OwnInvestmentPropertyNodeFactory());
        setChildNodeFactory(PropertyDetailsNode.class, new PropertyDetailsNodeFactory());
        setChildNodeFactory(PropertyAddressNode.class, new PropertyAddressNodeFactory());
        setChildNodeFactory(PropertyStateNode.class, new PropertyStateNodeFactory());
        setChildNodeFactory(CountryCodeNode.class, new CountryCodeFactory());
        setChildNodeFactory(AreaCodeNode.class, new AreaNodeFactory());
        setChildNodeFactory(PhoneNumberNode.class, new PhoneNumberNodeFactory());
        setChildNodeFactory(PhoneInfoNode.class, PhoneInfoNode::new);
        setChildNodeFactory(PlanNode.class, new PlanNodeFactory());
    }

    private void loadNodeConfig() {
        this.setUiNodeConfig(PropertyDetailsNode.class, new PropertyDetailsInvestmentPropertyNodeConfig());
    }

    private void loadRuleFactories() {

        setUiNodeRuleFactory(PatternValidationRule.class, new UiNodeRuleFactory<PatternValidationRule, StringUiNode<?>>() {
            @Override
            public PatternValidationRule create(StringUiNode<?> owner) {
                return new PatternValidationRule(owner);
            }
        });

        setUiNodeRuleFactory(LengthValidationRule.class, new UiNodeRuleFactory<LengthValidationRule, StringUiNode<?>>() {
            @Override
            public LengthValidationRule create(StringUiNode<?> owner) {
                return new LengthValidationRule(owner);
            }
        });

        setUiNodeRuleFactory(RangeValidationRule.class, new UiNodeRuleFactory<RangeValidationRule, BigDecimalUiNode<?>>() {
            @Override
            public RangeValidationRule create(BigDecimalUiNode<?> owner) {
                return new RangeValidationRule(owner);
            }
        });

        setUiNodeRuleFactory(InvalidCharPreChangeRule.class, new UiNodeRuleFactory<InvalidCharPreChangeRule, StringUiNode<?>>() {
            @Override
            public InvalidCharPreChangeRule create(StringUiNode<?> owner) {
                return new InvalidCharPreChangeRule(owner);
            }
        });

        setUiNodeRuleFactory(StringValueRequiredValidationRule.class, new UiNodeRuleFactory<StringValueRequiredValidationRule, StringUiNode<?>>() {
            @Override
            public StringValueRequiredValidationRule create(StringUiNode<?> owner) {
                return new StringValueRequiredValidationRule(owner);
            }
        });

        setUiNodeRuleFactory(zhy2002.examples.register.rule.SetHasErrorRule.class, zhy2002.examples.register.rule.SetHasErrorRule::new);
        setUiNodeRuleFactory(zhy2002.examples.register.rule.DefaultEmailByUsernameRule.class, zhy2002.examples.register.rule.DefaultEmailByUsernameRule::new);
        setUiNodeRuleFactory(zhy2002.examples.register.rule.EmailChangeReasonRule.class, zhy2002.examples.register.rule.EmailChangeReasonRule::new);
        setUiNodeRuleFactory(zhy2002.examples.register.rule.PasswordIsStrongRule.class, zhy2002.examples.register.rule.PasswordIsStrongRule::new);
        setUiNodeRuleFactory(zhy2002.examples.register.rule.RepeatPasswordRule.class, zhy2002.examples.register.rule.RepeatPasswordRule::new);
        setUiNodeRuleFactory(zhy2002.examples.register.rule.EmailIsRequiredWhenReceiveOffersRule.class, zhy2002.examples.register.rule.EmailIsRequiredWhenReceiveOffersRule::new);
        setUiNodeRuleFactory(zhy2002.examples.register.rule.LoadInvestmentPropertyRule.class, zhy2002.examples.register.rule.LoadInvestmentPropertyRule::new);
        setUiNodeRuleFactory(zhy2002.examples.register.rule.PhoneInfoAllOrNothingRule.class, zhy2002.examples.register.rule.PhoneInfoAllOrNothingRule::new);
        setUiNodeRuleFactory(zhy2002.examples.register.rule.CreateErrorNodeRule.class, zhy2002.examples.register.rule.CreateErrorNodeRule::new);
        setUiNodeRuleFactory(UpdatePlanRule.class, UpdatePlanRule::new);

    }

    private void loadStateChangeEventFactories() {
        this.setStateChangeEventFactory(String.class, new StringStateChangeEventFactory());
        this.setStateChangeEventFactory(Boolean.class, new BooleanStateChangeEventFactory());
        this.setStateChangeEventFactory(BigDecimal.class, new BigDecimalStateChangeEventFactory());
        this.setStateChangeEventFactory(ValidationErrorList.class, new ValidationErrorListStateChangeEventFactory());
        this.setStateChangeEventFactory(Object.class, new ObjectStateChangeEventFactory());
    }

    private void loadNodeAddEventFactories() {
        super.setNodeAddEventFactory(ErrorNode.class, ErrorNodeAddEvent::new);
    }

    private void loadNodeRemoveEventFactories() {
        super.setNodeRemoveEventFactory(ErrorNode.class, ErrorNodeRemoveEvent::new);
    }

    private void loadNodeLoadEventFactories() {
        super.setNodeLoadEventFactory(PropertyDetailsNode.class, PropertyDetailsNodeLoadEvent::new);
        super.setNodeLoadEventFactory(RegisterNode.class, RegisterNodeLoadEvent::new);
    }

    private void loadNodeUnloadEventFactories() {
        super.setNodeUnloadEventFactory(PropertyDetailsNode.class, PropertyDetailsNodeUnloadEvent::new);
        super.setNodeUnloadEventFactory(RegisterNode.class, RegisterNodeUnloadEvent::new);
    }
}
