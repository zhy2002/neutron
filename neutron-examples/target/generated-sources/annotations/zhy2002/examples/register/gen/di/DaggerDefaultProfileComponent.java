package zhy2002.examples.register.gen.di;

import dagger.MembersInjector;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.di.CustomModule;
import zhy2002.examples.register.di.CustomModule_ProvideRegisterNodeChildProviderFactory;
import zhy2002.examples.register.gen.RegisterNodeClassRegistry;
import zhy2002.examples.register.gen.RegisterNodeClassRegistry_Factory;
import zhy2002.examples.register.gen.RegisterNodeContext;
import zhy2002.examples.register.gen.RegisterNodeContext_Factory;
import zhy2002.examples.register.gen.RegisterNodeContext_MembersInjector;
import zhy2002.examples.register.gen.node.AgeNode;
import zhy2002.examples.register.gen.node.AgeNode_MembersInjector;
import zhy2002.examples.register.gen.node.AreaCodeNode;
import zhy2002.examples.register.gen.node.AreaCodeNode_MembersInjector;
import zhy2002.examples.register.gen.node.CountryCodeNode;
import zhy2002.examples.register.gen.node.CountryCodeNode_MembersInjector;
import zhy2002.examples.register.gen.node.EmailNode;
import zhy2002.examples.register.gen.node.EmailNode_MembersInjector;
import zhy2002.examples.register.gen.node.ErrorListNode;
import zhy2002.examples.register.gen.node.ErrorListNodeItemProvider;
import zhy2002.examples.register.gen.node.ErrorListNodeItemProvider_Factory;
import zhy2002.examples.register.gen.node.ErrorListNodeItemProvider_MembersInjector;
import zhy2002.examples.register.gen.node.ErrorListNode_MembersInjector;
import zhy2002.examples.register.gen.node.ErrorNode;
import zhy2002.examples.register.gen.node.ErrorNode_MembersInjector;
import zhy2002.examples.register.gen.node.OwnInvestmentPropertyNode;
import zhy2002.examples.register.gen.node.OwnInvestmentPropertyNode_MembersInjector;
import zhy2002.examples.register.gen.node.PasswordNode;
import zhy2002.examples.register.gen.node.PasswordNode_MembersInjector;
import zhy2002.examples.register.gen.node.PhoneInfoFieldNode;
import zhy2002.examples.register.gen.node.PhoneInfoNode;
import zhy2002.examples.register.gen.node.PhoneInfoNodeChildProvider;
import zhy2002.examples.register.gen.node.PhoneInfoNodeChildProvider_Factory;
import zhy2002.examples.register.gen.node.PhoneInfoNodeChildProvider_MembersInjector;
import zhy2002.examples.register.gen.node.PhoneInfoNode_MembersInjector;
import zhy2002.examples.register.gen.node.PhoneNumberNode;
import zhy2002.examples.register.gen.node.PhoneNumberNode_MembersInjector;
import zhy2002.examples.register.gen.node.PlanNode;
import zhy2002.examples.register.gen.node.PlanNode_MembersInjector;
import zhy2002.examples.register.gen.node.PropertyAddressNode;
import zhy2002.examples.register.gen.node.PropertyAddressNode_MembersInjector;
import zhy2002.examples.register.gen.node.PropertyDetailsNode;
import zhy2002.examples.register.gen.node.PropertyDetailsNodeChildProvider;
import zhy2002.examples.register.gen.node.PropertyDetailsNodeChildProvider_Factory;
import zhy2002.examples.register.gen.node.PropertyDetailsNodeChildProvider_MembersInjector;
import zhy2002.examples.register.gen.node.PropertyDetailsNode_MembersInjector;
import zhy2002.examples.register.gen.node.PropertyStateNode;
import zhy2002.examples.register.gen.node.PropertyStateNode_MembersInjector;
import zhy2002.examples.register.gen.node.ReceiveOffersNode;
import zhy2002.examples.register.gen.node.ReceiveOffersNode_MembersInjector;
import zhy2002.examples.register.gen.node.RegisterNode;
import zhy2002.examples.register.gen.node.RegisterNodeChildProvider;
import zhy2002.examples.register.gen.node.RegisterNodeChildProvider_MembersInjector;
import zhy2002.examples.register.gen.node.RegisterNode_Factory;
import zhy2002.examples.register.gen.node.RegisterNode_MembersInjector;
import zhy2002.examples.register.gen.node.RepeatPasswordNode;
import zhy2002.examples.register.gen.node.RepeatPasswordNode_MembersInjector;
import zhy2002.examples.register.gen.node.UsernameNode;
import zhy2002.examples.register.gen.node.UsernameNode_MembersInjector;
import zhy2002.examples.register.gen.rule.AgeNodeRuleProvider;
import zhy2002.examples.register.gen.rule.AgeNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.AgeNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.AreaCodeNodeRuleProvider;
import zhy2002.examples.register.gen.rule.AreaCodeNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.AreaCodeNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.CountryCodeNodeRuleProvider;
import zhy2002.examples.register.gen.rule.CountryCodeNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.CountryCodeNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.CreateErrorNodeRule;
import zhy2002.examples.register.gen.rule.DefaultEmailByUsernameRule;
import zhy2002.examples.register.gen.rule.EmailChangeReasonRule;
import zhy2002.examples.register.gen.rule.EmailIsRequiredWhenReceiveOffersRule;
import zhy2002.examples.register.gen.rule.EmailNodeRuleProvider;
import zhy2002.examples.register.gen.rule.EmailNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.EmailNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.ErrorListNodeRuleProvider;
import zhy2002.examples.register.gen.rule.ErrorListNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.ErrorListNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.ErrorNodeRuleProvider;
import zhy2002.examples.register.gen.rule.ErrorNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.ErrorNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.LoadInvestmentPropertyRule;
import zhy2002.examples.register.gen.rule.OwnInvestmentPropertyNodeRuleProvider;
import zhy2002.examples.register.gen.rule.OwnInvestmentPropertyNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.OwnInvestmentPropertyNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.PasswordIsStrongRule;
import zhy2002.examples.register.gen.rule.PasswordNodeRuleProvider;
import zhy2002.examples.register.gen.rule.PasswordNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.PasswordNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.PhoneInfoAllOrNothingRule;
import zhy2002.examples.register.gen.rule.PhoneInfoNodeRuleProvider;
import zhy2002.examples.register.gen.rule.PhoneInfoNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.PhoneInfoNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.PhoneNumberNodeRuleProvider;
import zhy2002.examples.register.gen.rule.PhoneNumberNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.PhoneNumberNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.PlanNodeRuleProvider;
import zhy2002.examples.register.gen.rule.PlanNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.PlanNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.PropertyAddressNodeRuleProvider;
import zhy2002.examples.register.gen.rule.PropertyAddressNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.PropertyAddressNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.PropertyDetailsNodeRuleProvider;
import zhy2002.examples.register.gen.rule.PropertyDetailsNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.PropertyDetailsNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.PropertyStateNodeRuleProvider;
import zhy2002.examples.register.gen.rule.PropertyStateNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.PropertyStateNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.ReceiveOffersNodeRuleProvider;
import zhy2002.examples.register.gen.rule.ReceiveOffersNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.ReceiveOffersNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.RegisterNodeRuleProvider;
import zhy2002.examples.register.gen.rule.RegisterNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.RegisterNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.RepeatPasswordNodeRuleProvider;
import zhy2002.examples.register.gen.rule.RepeatPasswordNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.RepeatPasswordNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.gen.rule.RepeatPasswordRule;
import zhy2002.examples.register.gen.rule.SetHasErrorRule;
import zhy2002.examples.register.gen.rule.UpdatePlanRule;
import zhy2002.examples.register.gen.rule.UsernameNodeRuleProvider;
import zhy2002.examples.register.gen.rule.UsernameNodeRuleProvider_Factory;
import zhy2002.examples.register.gen.rule.UsernameNodeRuleProvider_MembersInjector;
import zhy2002.examples.register.rule.CreateErrorNodeRuleImpl;
import zhy2002.examples.register.rule.CreateErrorNodeRuleImpl_Factory;
import zhy2002.examples.register.rule.DefaultEmailByUsernameRuleImpl;
import zhy2002.examples.register.rule.DefaultEmailByUsernameRuleImpl_Factory;
import zhy2002.examples.register.rule.EmailChangeReasonRuleImpl;
import zhy2002.examples.register.rule.EmailChangeReasonRuleImpl_Factory;
import zhy2002.examples.register.rule.EmailIsRequiredWhenReceiveOffersRuleImpl;
import zhy2002.examples.register.rule.EmailIsRequiredWhenReceiveOffersRuleImpl_Factory;
import zhy2002.examples.register.rule.LoadInvestmentPropertyRuleImpl;
import zhy2002.examples.register.rule.LoadInvestmentPropertyRuleImpl_Factory;
import zhy2002.examples.register.rule.PasswordIsStrongRuleImpl;
import zhy2002.examples.register.rule.PasswordIsStrongRuleImpl_Factory;
import zhy2002.examples.register.rule.PhoneInfoAllOrNothingRuleImpl;
import zhy2002.examples.register.rule.PhoneInfoAllOrNothingRuleImpl_Factory;
import zhy2002.examples.register.rule.RepeatPasswordRuleImpl;
import zhy2002.examples.register.rule.RepeatPasswordRuleImpl_Factory;
import zhy2002.examples.register.rule.SetHasErrorRuleImpl;
import zhy2002.examples.register.rule.SetHasErrorRuleImpl_Factory;
import zhy2002.examples.register.rule.UpdatePlanRuleImpl;
import zhy2002.examples.register.rule.UpdatePlanRuleImpl_Factory;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.NodeFinder;
import zhy2002.neutron.NodeFinder_Factory;
import zhy2002.neutron.NodeReferenceRegistry;
import zhy2002.neutron.NodeReferenceRegistry_Factory;
import zhy2002.neutron.ObjectUiNode;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeChangeEngine;
import zhy2002.neutron.UiNodeChangeEngineImpl_Factory;
import zhy2002.neutron.UniqueIdGenerator;
import zhy2002.neutron.node.BigDecimalUiNode;
import zhy2002.neutron.node.BooleanUiNode;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.rule.BooleanFixedValueValidationRule;
import zhy2002.neutron.rule.BooleanFixedValueValidationRule_Factory;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule_Factory;
import zhy2002.neutron.rule.InvalidCharPreChangeRule;
import zhy2002.neutron.rule.InvalidCharPreChangeRule_Factory;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule_Factory;
import zhy2002.neutron.rule.LengthValidationRule;
import zhy2002.neutron.rule.LengthValidationRule_Factory;
import zhy2002.neutron.rule.NumberFormatValidationRule;
import zhy2002.neutron.rule.NumberFormatValidationRule_Factory;
import zhy2002.neutron.rule.ObjectValueRequiredValidationRule;
import zhy2002.neutron.rule.ObjectValueRequiredValidationRule_Factory;
import zhy2002.neutron.rule.PatternValidationRule;
import zhy2002.neutron.rule.PatternValidationRule_Factory;
import zhy2002.neutron.rule.RangeValidationRule;
import zhy2002.neutron.rule.RangeValidationRule_Factory;
import zhy2002.neutron.rule.UpdateObjectHasValueRule;
import zhy2002.neutron.rule.UpdateObjectHasValueRule_Factory;
import zhy2002.neutron.util.SequentialUniqueIdGenerator_Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerDefaultProfileComponent implements DefaultProfileComponent {
  private Provider<NodeFinder> nodeFinderProvider;

  private Provider<NodeReferenceRegistry> nodeReferenceRegistryProvider;

  private Provider<PlanNodeComponent.Builder> planNodeComponentBuilderProvider;

  private MembersInjector<PlanNode> planNodeMembersInjector;

  private Provider<ReceiveOffersNodeComponent.Builder> receiveOffersNodeComponentBuilderProvider;

  private MembersInjector<ReceiveOffersNode> receiveOffersNodeMembersInjector;

  private Provider<UsernameNodeComponent.Builder> usernameNodeComponentBuilderProvider;

  private MembersInjector<UsernameNode> usernameNodeMembersInjector;

  private Provider<RepeatPasswordNodeComponent.Builder> repeatPasswordNodeComponentBuilderProvider;

  private MembersInjector<RepeatPasswordNode> repeatPasswordNodeMembersInjector;

  private Provider<PropertyAddressNodeComponent.Builder>
      propertyAddressNodeComponentBuilderProvider;

  private MembersInjector<PropertyAddressNode> propertyAddressNodeMembersInjector;

  private Provider<PropertyStateNodeComponent.Builder> propertyStateNodeComponentBuilderProvider;

  private MembersInjector<PropertyStateNode> propertyStateNodeMembersInjector;

  private MembersInjector<PropertyDetailsNodeChildProvider>
      propertyDetailsNodeChildProviderMembersInjector;

  private Provider<PropertyDetailsNodeChildProvider> propertyDetailsNodeChildProvider;

  private Provider<PropertyDetailsNodeComponent.Builder>
      propertyDetailsNodeComponentBuilderProvider;

  private MembersInjector<PropertyDetailsNode> propertyDetailsNodeMembersInjector;

  private Provider<PhoneNumberNodeComponent.Builder> phoneNumberNodeComponentBuilderProvider;

  private MembersInjector<PhoneNumberNode> phoneNumberNodeMembersInjector;

  private Provider<CountryCodeNodeComponent.Builder> countryCodeNodeComponentBuilderProvider;

  private MembersInjector<CountryCodeNode> countryCodeNodeMembersInjector;

  private Provider<AreaCodeNodeComponent.Builder> areaCodeNodeComponentBuilderProvider;

  private MembersInjector<AreaCodeNode> areaCodeNodeMembersInjector;

  private MembersInjector<PhoneInfoNodeChildProvider> phoneInfoNodeChildProviderMembersInjector;

  private Provider<PhoneInfoNodeChildProvider> phoneInfoNodeChildProvider;

  private Provider<PhoneInfoNodeComponent.Builder> phoneInfoNodeComponentBuilderProvider;

  private MembersInjector<PhoneInfoNode> phoneInfoNodeMembersInjector;

  private Provider<PasswordNodeComponent.Builder> passwordNodeComponentBuilderProvider;

  private MembersInjector<PasswordNode> passwordNodeMembersInjector;

  private Provider<OwnInvestmentPropertyNodeComponent.Builder>
      ownInvestmentPropertyNodeComponentBuilderProvider;

  private MembersInjector<OwnInvestmentPropertyNode> ownInvestmentPropertyNodeMembersInjector;

  private Provider<ErrorNodeComponent.Builder> errorNodeComponentBuilderProvider;

  private MembersInjector<ErrorNode> errorNodeMembersInjector;

  private MembersInjector<ErrorListNodeItemProvider> errorListNodeItemProviderMembersInjector;

  private Provider<ErrorListNodeItemProvider> errorListNodeItemProvider;

  private Provider<ErrorListNodeComponent.Builder> errorListNodeComponentBuilderProvider;

  private MembersInjector<ErrorListNode> errorListNodeMembersInjector;

  private Provider<EmailNodeComponent.Builder> emailNodeComponentBuilderProvider;

  private MembersInjector<EmailNode> emailNodeMembersInjector;

  private Provider<AgeNodeComponent.Builder> ageNodeComponentBuilderProvider;

  private MembersInjector<AgeNode> ageNodeMembersInjector;

  private MembersInjector<RegisterNodeChildProvider> registerNodeChildProviderMembersInjector;

  private Provider<RegisterNodeChildProvider> provideRegisterNodeChildProvider;

  private Provider<RegisterNodeComponent.Builder> registerNodeComponentBuilderProvider;

  private MembersInjector<RegisterNode> registerNodeMembersInjector;

  private Provider<RegisterNode> registerNodeProvider;

  private MembersInjector<RegisterNodeContext> registerNodeContextMembersInjector;

  private Provider<UiNodeChangeEngine> provideUiNodeChangeEngineProvider;

  private Provider<UniqueIdGenerator> provideSequentialUniqueIdGeneratorProvider;

  private Provider<RegisterNodeClassRegistry> registerNodeClassRegistryProvider;

  private Provider<ClassRegistryImpl> provideClassRegistryImplProvider;

  private Provider<RegisterNodeContext> registerNodeContextProvider;

  private DaggerDefaultProfileComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static DefaultProfileComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.nodeFinderProvider = DoubleCheck.provider(NodeFinder_Factory.create());

    this.nodeReferenceRegistryProvider =
        DoubleCheck.provider(NodeReferenceRegistry_Factory.create());

    this.planNodeComponentBuilderProvider =
        new Factory<PlanNodeComponent.Builder>() {
          @Override
          public PlanNodeComponent.Builder get() {
            return new PlanNodeComponentBuilder();
          }
        };

    this.planNodeMembersInjector =
        PlanNode_MembersInjector.create(planNodeComponentBuilderProvider);

    this.receiveOffersNodeComponentBuilderProvider =
        new Factory<ReceiveOffersNodeComponent.Builder>() {
          @Override
          public ReceiveOffersNodeComponent.Builder get() {
            return new ReceiveOffersNodeComponentBuilder();
          }
        };

    this.receiveOffersNodeMembersInjector =
        ReceiveOffersNode_MembersInjector.create(receiveOffersNodeComponentBuilderProvider);

    this.usernameNodeComponentBuilderProvider =
        new Factory<UsernameNodeComponent.Builder>() {
          @Override
          public UsernameNodeComponent.Builder get() {
            return new UsernameNodeComponentBuilder();
          }
        };

    this.usernameNodeMembersInjector =
        UsernameNode_MembersInjector.create(usernameNodeComponentBuilderProvider);

    this.repeatPasswordNodeComponentBuilderProvider =
        new Factory<RepeatPasswordNodeComponent.Builder>() {
          @Override
          public RepeatPasswordNodeComponent.Builder get() {
            return new RepeatPasswordNodeComponentBuilder();
          }
        };

    this.repeatPasswordNodeMembersInjector =
        RepeatPasswordNode_MembersInjector.create(repeatPasswordNodeComponentBuilderProvider);

    this.propertyAddressNodeComponentBuilderProvider =
        new Factory<PropertyAddressNodeComponent.Builder>() {
          @Override
          public PropertyAddressNodeComponent.Builder get() {
            return new PropertyAddressNodeComponentBuilder();
          }
        };

    this.propertyAddressNodeMembersInjector =
        PropertyAddressNode_MembersInjector.create(propertyAddressNodeComponentBuilderProvider);

    this.propertyStateNodeComponentBuilderProvider =
        new Factory<PropertyStateNodeComponent.Builder>() {
          @Override
          public PropertyStateNodeComponent.Builder get() {
            return new PropertyStateNodeComponentBuilder();
          }
        };

    this.propertyStateNodeMembersInjector =
        PropertyStateNode_MembersInjector.create(propertyStateNodeComponentBuilderProvider);

    this.propertyDetailsNodeChildProviderMembersInjector =
        PropertyDetailsNodeChildProvider_MembersInjector.create(
            propertyAddressNodeMembersInjector, propertyStateNodeMembersInjector);

    this.propertyDetailsNodeChildProvider =
        DoubleCheck.provider(
            PropertyDetailsNodeChildProvider_Factory.create(
                propertyDetailsNodeChildProviderMembersInjector));

    this.propertyDetailsNodeComponentBuilderProvider =
        new Factory<PropertyDetailsNodeComponent.Builder>() {
          @Override
          public PropertyDetailsNodeComponent.Builder get() {
            return new PropertyDetailsNodeComponentBuilder();
          }
        };

    this.propertyDetailsNodeMembersInjector =
        PropertyDetailsNode_MembersInjector.create(
            propertyDetailsNodeChildProvider, propertyDetailsNodeComponentBuilderProvider);

    this.phoneNumberNodeComponentBuilderProvider =
        new Factory<PhoneNumberNodeComponent.Builder>() {
          @Override
          public PhoneNumberNodeComponent.Builder get() {
            return new PhoneNumberNodeComponentBuilder();
          }
        };

    this.phoneNumberNodeMembersInjector =
        PhoneNumberNode_MembersInjector.create(phoneNumberNodeComponentBuilderProvider);

    this.countryCodeNodeComponentBuilderProvider =
        new Factory<CountryCodeNodeComponent.Builder>() {
          @Override
          public CountryCodeNodeComponent.Builder get() {
            return new CountryCodeNodeComponentBuilder();
          }
        };

    this.countryCodeNodeMembersInjector =
        CountryCodeNode_MembersInjector.create(countryCodeNodeComponentBuilderProvider);

    this.areaCodeNodeComponentBuilderProvider =
        new Factory<AreaCodeNodeComponent.Builder>() {
          @Override
          public AreaCodeNodeComponent.Builder get() {
            return new AreaCodeNodeComponentBuilder();
          }
        };

    this.areaCodeNodeMembersInjector =
        AreaCodeNode_MembersInjector.create(areaCodeNodeComponentBuilderProvider);

    this.phoneInfoNodeChildProviderMembersInjector =
        PhoneInfoNodeChildProvider_MembersInjector.create(
            phoneNumberNodeMembersInjector,
            MembersInjectors.<PhoneInfoFieldNode>noOp(),
            countryCodeNodeMembersInjector,
            areaCodeNodeMembersInjector);

    this.phoneInfoNodeChildProvider =
        DoubleCheck.provider(
            PhoneInfoNodeChildProvider_Factory.create(phoneInfoNodeChildProviderMembersInjector));

    this.phoneInfoNodeComponentBuilderProvider =
        new Factory<PhoneInfoNodeComponent.Builder>() {
          @Override
          public PhoneInfoNodeComponent.Builder get() {
            return new PhoneInfoNodeComponentBuilder();
          }
        };

    this.phoneInfoNodeMembersInjector =
        PhoneInfoNode_MembersInjector.create(
            phoneInfoNodeChildProvider, phoneInfoNodeComponentBuilderProvider);

    this.passwordNodeComponentBuilderProvider =
        new Factory<PasswordNodeComponent.Builder>() {
          @Override
          public PasswordNodeComponent.Builder get() {
            return new PasswordNodeComponentBuilder();
          }
        };

    this.passwordNodeMembersInjector =
        PasswordNode_MembersInjector.create(passwordNodeComponentBuilderProvider);

    this.ownInvestmentPropertyNodeComponentBuilderProvider =
        new Factory<OwnInvestmentPropertyNodeComponent.Builder>() {
          @Override
          public OwnInvestmentPropertyNodeComponent.Builder get() {
            return new OwnInvestmentPropertyNodeComponentBuilder();
          }
        };

    this.ownInvestmentPropertyNodeMembersInjector =
        OwnInvestmentPropertyNode_MembersInjector.create(
            ownInvestmentPropertyNodeComponentBuilderProvider);

    this.errorNodeComponentBuilderProvider =
        new Factory<ErrorNodeComponent.Builder>() {
          @Override
          public ErrorNodeComponent.Builder get() {
            return new ErrorNodeComponentBuilder();
          }
        };

    this.errorNodeMembersInjector =
        ErrorNode_MembersInjector.create(errorNodeComponentBuilderProvider);

    this.errorListNodeItemProviderMembersInjector =
        ErrorListNodeItemProvider_MembersInjector.create(errorNodeMembersInjector);

    this.errorListNodeItemProvider =
        DoubleCheck.provider(
            ErrorListNodeItemProvider_Factory.create(errorListNodeItemProviderMembersInjector));

    this.errorListNodeComponentBuilderProvider =
        new Factory<ErrorListNodeComponent.Builder>() {
          @Override
          public ErrorListNodeComponent.Builder get() {
            return new ErrorListNodeComponentBuilder();
          }
        };

    this.errorListNodeMembersInjector =
        ErrorListNode_MembersInjector.create(
            errorListNodeItemProvider, errorListNodeComponentBuilderProvider);

    this.emailNodeComponentBuilderProvider =
        new Factory<EmailNodeComponent.Builder>() {
          @Override
          public EmailNodeComponent.Builder get() {
            return new EmailNodeComponentBuilder();
          }
        };

    this.emailNodeMembersInjector =
        EmailNode_MembersInjector.create(emailNodeComponentBuilderProvider);

    this.ageNodeComponentBuilderProvider =
        new Factory<AgeNodeComponent.Builder>() {
          @Override
          public AgeNodeComponent.Builder get() {
            return new AgeNodeComponentBuilder();
          }
        };

    this.ageNodeMembersInjector = AgeNode_MembersInjector.create(ageNodeComponentBuilderProvider);

    this.registerNodeChildProviderMembersInjector =
        RegisterNodeChildProvider_MembersInjector.create(
            planNodeMembersInjector,
            receiveOffersNodeMembersInjector,
            usernameNodeMembersInjector,
            repeatPasswordNodeMembersInjector,
            propertyDetailsNodeMembersInjector,
            phoneInfoNodeMembersInjector,
            passwordNodeMembersInjector,
            ownInvestmentPropertyNodeMembersInjector,
            errorListNodeMembersInjector,
            emailNodeMembersInjector,
            ageNodeMembersInjector);

    this.provideRegisterNodeChildProvider =
        DoubleCheck.provider(
            CustomModule_ProvideRegisterNodeChildProviderFactory.create(
                builder.customModule, registerNodeChildProviderMembersInjector));

    this.registerNodeComponentBuilderProvider =
        new Factory<RegisterNodeComponent.Builder>() {
          @Override
          public RegisterNodeComponent.Builder get() {
            return new RegisterNodeComponentBuilder();
          }
        };

    this.registerNodeMembersInjector =
        RegisterNode_MembersInjector.create(
            provideRegisterNodeChildProvider, registerNodeComponentBuilderProvider);
    this.registerNodeContextProvider = new DelegateFactory();

    this.registerNodeProvider =
        DoubleCheck.provider(
            RegisterNode_Factory.create(registerNodeMembersInjector, registerNodeContextProvider));

    this.registerNodeContextMembersInjector =
        RegisterNodeContext_MembersInjector.create(
            nodeFinderProvider, nodeReferenceRegistryProvider, registerNodeProvider);

    this.provideUiNodeChangeEngineProvider =
        DoubleCheck.provider((Provider) UiNodeChangeEngineImpl_Factory.create());

    this.provideSequentialUniqueIdGeneratorProvider =
        DoubleCheck.provider((Provider) SequentialUniqueIdGenerator_Factory.create());

    this.registerNodeClassRegistryProvider =
        DoubleCheck.provider(
            RegisterNodeClassRegistry_Factory.create(
                MembersInjectors.<RegisterNodeClassRegistry>noOp()));

    this.provideClassRegistryImplProvider =
        DoubleCheck.provider((Provider) registerNodeClassRegistryProvider);

    DelegateFactory registerNodeContextProviderDelegate =
        (DelegateFactory) registerNodeContextProvider;
    this.registerNodeContextProvider =
        DoubleCheck.provider(
            RegisterNodeContext_Factory.create(
                registerNodeContextMembersInjector,
                provideUiNodeChangeEngineProvider,
                provideSequentialUniqueIdGeneratorProvider,
                provideClassRegistryImplProvider));
    registerNodeContextProviderDelegate.setDelegatedProvider(registerNodeContextProvider);
  }

  @Override
  public RegisterNodeContext provideRegisterNodeContext() {
    return registerNodeContextProvider.get();
  }

  public static final class Builder {
    private CustomModule customModule;

    private Builder() {}

    public DefaultProfileComponent build() {
      if (customModule == null) {
        this.customModule = new CustomModule();
      }
      return new DaggerDefaultProfileComponent(this);
    }

    public Builder customModule(CustomModule customModule) {
      this.customModule = Preconditions.checkNotNull(customModule);
      return this;
    }
  }

  private final class PlanNodeComponentBuilder implements PlanNodeComponent.Builder {
    private PlanNodeModule planNodeModule;

    @Override
    public PlanNodeComponent build() {
      if (planNodeModule == null) {
        throw new IllegalStateException(PlanNodeModule.class.getCanonicalName() + " must be set");
      }
      return new PlanNodeComponentImpl(this);
    }

    @Override
    public PlanNodeComponentBuilder setPlanNodeModule(PlanNodeModule module) {
      this.planNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class PlanNodeComponentImpl implements PlanNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private Provider<StringUiNode<?>> provideStringUiNodeProvider;

    private Provider<PatternValidationRule> patternValidationRuleProvider;

    private Provider<LengthValidationRule> lengthValidationRuleProvider;

    private Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    private MembersInjector<PlanNodeRuleProvider> planNodeRuleProviderMembersInjector;

    private Provider<PlanNodeRuleProvider> planNodeRuleProvider;

    private PlanNodeComponentImpl(PlanNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final PlanNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(PlanNodeModule_ProvideUiNodeFactory.create(builder.planNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              PlanNodeModule_ProvideLeafUiNodeFactory.create(builder.planNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.provideStringUiNodeProvider =
          DoubleCheck.provider(
              PlanNodeModule_ProvideStringUiNodeFactory.create(builder.planNodeModule));

      this.patternValidationRuleProvider =
          PatternValidationRule_Factory.create(
              MembersInjectors.<PatternValidationRule>noOp(), provideStringUiNodeProvider);

      this.lengthValidationRuleProvider =
          LengthValidationRule_Factory.create(
              MembersInjectors.<LengthValidationRule>noOp(), provideStringUiNodeProvider);

      this.invalidCharPreChangeRuleProvider =
          InvalidCharPreChangeRule_Factory.create(
              MembersInjectors.<InvalidCharPreChangeRule>noOp(), provideStringUiNodeProvider);

      this.planNodeRuleProviderMembersInjector =
          PlanNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              leafValueRequiredValidationRuleProvider,
              patternValidationRuleProvider,
              lengthValidationRuleProvider,
              invalidCharPreChangeRuleProvider);

      this.planNodeRuleProvider =
          DoubleCheck.provider(
              PlanNodeRuleProvider_Factory.create(planNodeRuleProviderMembersInjector));
    }

    @Override
    public PlanNodeRuleProvider getPlanNodeRuleProvider() {
      return planNodeRuleProvider.get();
    }
  }

  private final class ReceiveOffersNodeComponentBuilder
      implements ReceiveOffersNodeComponent.Builder {
    private ReceiveOffersNodeModule receiveOffersNodeModule;

    @Override
    public ReceiveOffersNodeComponent build() {
      if (receiveOffersNodeModule == null) {
        throw new IllegalStateException(
            ReceiveOffersNodeModule.class.getCanonicalName() + " must be set");
      }
      return new ReceiveOffersNodeComponentImpl(this);
    }

    @Override
    public ReceiveOffersNodeComponentBuilder setReceiveOffersNodeModule(
        ReceiveOffersNodeModule module) {
      this.receiveOffersNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class ReceiveOffersNodeComponentImpl implements ReceiveOffersNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private Provider<BooleanUiNode<?>> provideBooleanUiNodeProvider;

    private Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider;

    private Provider<ReceiveOffersNode> provideReceiveOffersNodeProvider;

    private Provider<EmailIsRequiredWhenReceiveOffersRuleImpl>
        emailIsRequiredWhenReceiveOffersRuleImplProvider;

    private Provider<EmailIsRequiredWhenReceiveOffersRule>
        provideEmailIsRequiredWhenReceiveOffersRuleImplProvider;

    private MembersInjector<ReceiveOffersNodeRuleProvider>
        receiveOffersNodeRuleProviderMembersInjector;

    private Provider<ReceiveOffersNodeRuleProvider> receiveOffersNodeRuleProvider;

    private ReceiveOffersNodeComponentImpl(ReceiveOffersNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ReceiveOffersNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              ReceiveOffersNodeModule_ProvideUiNodeFactory.create(builder.receiveOffersNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              ReceiveOffersNodeModule_ProvideLeafUiNodeFactory.create(
                  builder.receiveOffersNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.provideBooleanUiNodeProvider =
          DoubleCheck.provider(
              ReceiveOffersNodeModule_ProvideBooleanUiNodeFactory.create(
                  builder.receiveOffersNodeModule));

      this.booleanFixedValueValidationRuleProvider =
          BooleanFixedValueValidationRule_Factory.create(
              MembersInjectors.<BooleanFixedValueValidationRule>noOp(),
              provideBooleanUiNodeProvider);

      this.provideReceiveOffersNodeProvider =
          DoubleCheck.provider(
              ReceiveOffersNodeModule_ProvideReceiveOffersNodeFactory.create(
                  builder.receiveOffersNodeModule));

      this.emailIsRequiredWhenReceiveOffersRuleImplProvider =
          EmailIsRequiredWhenReceiveOffersRuleImpl_Factory.create(
              MembersInjectors.<EmailIsRequiredWhenReceiveOffersRuleImpl>noOp(),
              provideReceiveOffersNodeProvider);

      this.provideEmailIsRequiredWhenReceiveOffersRuleImplProvider =
          (Provider) emailIsRequiredWhenReceiveOffersRuleImplProvider;

      this.receiveOffersNodeRuleProviderMembersInjector =
          ReceiveOffersNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              leafValueRequiredValidationRuleProvider,
              booleanFixedValueValidationRuleProvider,
              provideEmailIsRequiredWhenReceiveOffersRuleImplProvider);

      this.receiveOffersNodeRuleProvider =
          DoubleCheck.provider(
              ReceiveOffersNodeRuleProvider_Factory.create(
                  receiveOffersNodeRuleProviderMembersInjector));
    }

    @Override
    public ReceiveOffersNodeRuleProvider getReceiveOffersNodeRuleProvider() {
      return receiveOffersNodeRuleProvider.get();
    }
  }

  private final class UsernameNodeComponentBuilder implements UsernameNodeComponent.Builder {
    private UsernameNodeModule usernameNodeModule;

    @Override
    public UsernameNodeComponent build() {
      if (usernameNodeModule == null) {
        throw new IllegalStateException(
            UsernameNodeModule.class.getCanonicalName() + " must be set");
      }
      return new UsernameNodeComponentImpl(this);
    }

    @Override
    public UsernameNodeComponentBuilder setUsernameNodeModule(UsernameNodeModule module) {
      this.usernameNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class UsernameNodeComponentImpl implements UsernameNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private Provider<StringUiNode<?>> provideStringUiNodeProvider;

    private Provider<PatternValidationRule> patternValidationRuleProvider;

    private Provider<LengthValidationRule> lengthValidationRuleProvider;

    private Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    private Provider<UsernameNode> provideUsernameNodeProvider;

    private Provider<DefaultEmailByUsernameRuleImpl> defaultEmailByUsernameRuleImplProvider;

    private Provider<DefaultEmailByUsernameRule> provideDefaultEmailByUsernameRuleProvider;

    private MembersInjector<UsernameNodeRuleProvider> usernameNodeRuleProviderMembersInjector;

    private Provider<UsernameNodeRuleProvider> usernameNodeRuleProvider;

    private UsernameNodeComponentImpl(UsernameNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final UsernameNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              UsernameNodeModule_ProvideUiNodeFactory.create(builder.usernameNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              UsernameNodeModule_ProvideLeafUiNodeFactory.create(builder.usernameNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.provideStringUiNodeProvider =
          DoubleCheck.provider(
              UsernameNodeModule_ProvideStringUiNodeFactory.create(builder.usernameNodeModule));

      this.patternValidationRuleProvider =
          PatternValidationRule_Factory.create(
              MembersInjectors.<PatternValidationRule>noOp(), provideStringUiNodeProvider);

      this.lengthValidationRuleProvider =
          LengthValidationRule_Factory.create(
              MembersInjectors.<LengthValidationRule>noOp(), provideStringUiNodeProvider);

      this.invalidCharPreChangeRuleProvider =
          InvalidCharPreChangeRule_Factory.create(
              MembersInjectors.<InvalidCharPreChangeRule>noOp(), provideStringUiNodeProvider);

      this.provideUsernameNodeProvider =
          DoubleCheck.provider(
              UsernameNodeModule_ProvideUsernameNodeFactory.create(builder.usernameNodeModule));

      this.defaultEmailByUsernameRuleImplProvider =
          DefaultEmailByUsernameRuleImpl_Factory.create(
              MembersInjectors.<DefaultEmailByUsernameRuleImpl>noOp(), provideUsernameNodeProvider);

      this.provideDefaultEmailByUsernameRuleProvider =
          (Provider) defaultEmailByUsernameRuleImplProvider;

      this.usernameNodeRuleProviderMembersInjector =
          UsernameNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              leafValueRequiredValidationRuleProvider,
              patternValidationRuleProvider,
              lengthValidationRuleProvider,
              invalidCharPreChangeRuleProvider,
              provideDefaultEmailByUsernameRuleProvider);

      this.usernameNodeRuleProvider =
          DoubleCheck.provider(
              UsernameNodeRuleProvider_Factory.create(usernameNodeRuleProviderMembersInjector));
    }

    @Override
    public UsernameNodeRuleProvider getUsernameNodeRuleProvider() {
      return usernameNodeRuleProvider.get();
    }
  }

  private final class RepeatPasswordNodeComponentBuilder
      implements RepeatPasswordNodeComponent.Builder {
    private RepeatPasswordNodeModule repeatPasswordNodeModule;

    @Override
    public RepeatPasswordNodeComponent build() {
      if (repeatPasswordNodeModule == null) {
        throw new IllegalStateException(
            RepeatPasswordNodeModule.class.getCanonicalName() + " must be set");
      }
      return new RepeatPasswordNodeComponentImpl(this);
    }

    @Override
    public RepeatPasswordNodeComponentBuilder setRepeatPasswordNodeModule(
        RepeatPasswordNodeModule module) {
      this.repeatPasswordNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class RepeatPasswordNodeComponentImpl implements RepeatPasswordNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private Provider<StringUiNode<?>> provideStringUiNodeProvider;

    private Provider<PatternValidationRule> patternValidationRuleProvider;

    private Provider<LengthValidationRule> lengthValidationRuleProvider;

    private Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    private Provider<RepeatPasswordNode> provideRepeatPasswordNodeProvider;

    private Provider<RepeatPasswordRuleImpl> repeatPasswordRuleImplProvider;

    private Provider<RepeatPasswordRule> provideRepeatPasswordRuleProvider;

    private MembersInjector<RepeatPasswordNodeRuleProvider>
        repeatPasswordNodeRuleProviderMembersInjector;

    private Provider<RepeatPasswordNodeRuleProvider> repeatPasswordNodeRuleProvider;

    private RepeatPasswordNodeComponentImpl(RepeatPasswordNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final RepeatPasswordNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              RepeatPasswordNodeModule_ProvideUiNodeFactory.create(
                  builder.repeatPasswordNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              RepeatPasswordNodeModule_ProvideLeafUiNodeFactory.create(
                  builder.repeatPasswordNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.provideStringUiNodeProvider =
          DoubleCheck.provider(
              RepeatPasswordNodeModule_ProvideStringUiNodeFactory.create(
                  builder.repeatPasswordNodeModule));

      this.patternValidationRuleProvider =
          PatternValidationRule_Factory.create(
              MembersInjectors.<PatternValidationRule>noOp(), provideStringUiNodeProvider);

      this.lengthValidationRuleProvider =
          LengthValidationRule_Factory.create(
              MembersInjectors.<LengthValidationRule>noOp(), provideStringUiNodeProvider);

      this.invalidCharPreChangeRuleProvider =
          InvalidCharPreChangeRule_Factory.create(
              MembersInjectors.<InvalidCharPreChangeRule>noOp(), provideStringUiNodeProvider);

      this.provideRepeatPasswordNodeProvider =
          DoubleCheck.provider(
              RepeatPasswordNodeModule_ProvideRepeatPasswordNodeFactory.create(
                  builder.repeatPasswordNodeModule));

      this.repeatPasswordRuleImplProvider =
          RepeatPasswordRuleImpl_Factory.create(
              MembersInjectors.<RepeatPasswordRuleImpl>noOp(), provideRepeatPasswordNodeProvider);

      this.provideRepeatPasswordRuleProvider = (Provider) repeatPasswordRuleImplProvider;

      this.repeatPasswordNodeRuleProviderMembersInjector =
          RepeatPasswordNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              leafValueRequiredValidationRuleProvider,
              patternValidationRuleProvider,
              lengthValidationRuleProvider,
              invalidCharPreChangeRuleProvider,
              provideRepeatPasswordRuleProvider);

      this.repeatPasswordNodeRuleProvider =
          DoubleCheck.provider(
              RepeatPasswordNodeRuleProvider_Factory.create(
                  repeatPasswordNodeRuleProviderMembersInjector));
    }

    @Override
    public RepeatPasswordNodeRuleProvider getRepeatPasswordNodeRuleProvider() {
      return repeatPasswordNodeRuleProvider.get();
    }
  }

  private final class PropertyAddressNodeComponentBuilder
      implements PropertyAddressNodeComponent.Builder {
    private PropertyAddressNodeModule propertyAddressNodeModule;

    @Override
    public PropertyAddressNodeComponent build() {
      if (propertyAddressNodeModule == null) {
        throw new IllegalStateException(
            PropertyAddressNodeModule.class.getCanonicalName() + " must be set");
      }
      return new PropertyAddressNodeComponentImpl(this);
    }

    @Override
    public PropertyAddressNodeComponentBuilder setPropertyAddressNodeModule(
        PropertyAddressNodeModule module) {
      this.propertyAddressNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class PropertyAddressNodeComponentImpl implements PropertyAddressNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private Provider<StringUiNode<?>> provideStringUiNodeProvider;

    private Provider<PatternValidationRule> patternValidationRuleProvider;

    private Provider<LengthValidationRule> lengthValidationRuleProvider;

    private Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    private MembersInjector<PropertyAddressNodeRuleProvider>
        propertyAddressNodeRuleProviderMembersInjector;

    private Provider<PropertyAddressNodeRuleProvider> propertyAddressNodeRuleProvider;

    private PropertyAddressNodeComponentImpl(PropertyAddressNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final PropertyAddressNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              PropertyAddressNodeModule_ProvideUiNodeFactory.create(
                  builder.propertyAddressNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              PropertyAddressNodeModule_ProvideLeafUiNodeFactory.create(
                  builder.propertyAddressNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.provideStringUiNodeProvider =
          DoubleCheck.provider(
              PropertyAddressNodeModule_ProvideStringUiNodeFactory.create(
                  builder.propertyAddressNodeModule));

      this.patternValidationRuleProvider =
          PatternValidationRule_Factory.create(
              MembersInjectors.<PatternValidationRule>noOp(), provideStringUiNodeProvider);

      this.lengthValidationRuleProvider =
          LengthValidationRule_Factory.create(
              MembersInjectors.<LengthValidationRule>noOp(), provideStringUiNodeProvider);

      this.invalidCharPreChangeRuleProvider =
          InvalidCharPreChangeRule_Factory.create(
              MembersInjectors.<InvalidCharPreChangeRule>noOp(), provideStringUiNodeProvider);

      this.propertyAddressNodeRuleProviderMembersInjector =
          PropertyAddressNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              leafValueRequiredValidationRuleProvider,
              patternValidationRuleProvider,
              lengthValidationRuleProvider,
              invalidCharPreChangeRuleProvider);

      this.propertyAddressNodeRuleProvider =
          DoubleCheck.provider(
              PropertyAddressNodeRuleProvider_Factory.create(
                  propertyAddressNodeRuleProviderMembersInjector));
    }

    @Override
    public PropertyAddressNodeRuleProvider getPropertyAddressNodeRuleProvider() {
      return propertyAddressNodeRuleProvider.get();
    }
  }

  private final class PropertyStateNodeComponentBuilder
      implements PropertyStateNodeComponent.Builder {
    private PropertyStateNodeModule propertyStateNodeModule;

    @Override
    public PropertyStateNodeComponent build() {
      if (propertyStateNodeModule == null) {
        throw new IllegalStateException(
            PropertyStateNodeModule.class.getCanonicalName() + " must be set");
      }
      return new PropertyStateNodeComponentImpl(this);
    }

    @Override
    public PropertyStateNodeComponentBuilder setPropertyStateNodeModule(
        PropertyStateNodeModule module) {
      this.propertyStateNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class PropertyStateNodeComponentImpl implements PropertyStateNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private Provider<StringUiNode<?>> provideStringUiNodeProvider;

    private Provider<PatternValidationRule> patternValidationRuleProvider;

    private Provider<LengthValidationRule> lengthValidationRuleProvider;

    private Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    private MembersInjector<PropertyStateNodeRuleProvider>
        propertyStateNodeRuleProviderMembersInjector;

    private Provider<PropertyStateNodeRuleProvider> propertyStateNodeRuleProvider;

    private PropertyStateNodeComponentImpl(PropertyStateNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final PropertyStateNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              PropertyStateNodeModule_ProvideUiNodeFactory.create(builder.propertyStateNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              PropertyStateNodeModule_ProvideLeafUiNodeFactory.create(
                  builder.propertyStateNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.provideStringUiNodeProvider =
          DoubleCheck.provider(
              PropertyStateNodeModule_ProvideStringUiNodeFactory.create(
                  builder.propertyStateNodeModule));

      this.patternValidationRuleProvider =
          PatternValidationRule_Factory.create(
              MembersInjectors.<PatternValidationRule>noOp(), provideStringUiNodeProvider);

      this.lengthValidationRuleProvider =
          LengthValidationRule_Factory.create(
              MembersInjectors.<LengthValidationRule>noOp(), provideStringUiNodeProvider);

      this.invalidCharPreChangeRuleProvider =
          InvalidCharPreChangeRule_Factory.create(
              MembersInjectors.<InvalidCharPreChangeRule>noOp(), provideStringUiNodeProvider);

      this.propertyStateNodeRuleProviderMembersInjector =
          PropertyStateNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              leafValueRequiredValidationRuleProvider,
              patternValidationRuleProvider,
              lengthValidationRuleProvider,
              invalidCharPreChangeRuleProvider);

      this.propertyStateNodeRuleProvider =
          DoubleCheck.provider(
              PropertyStateNodeRuleProvider_Factory.create(
                  propertyStateNodeRuleProviderMembersInjector));
    }

    @Override
    public PropertyStateNodeRuleProvider getPropertyStateNodeRuleProvider() {
      return propertyStateNodeRuleProvider.get();
    }
  }

  private final class PropertyDetailsNodeComponentBuilder
      implements PropertyDetailsNodeComponent.Builder {
    private PropertyDetailsNodeModule propertyDetailsNodeModule;

    @Override
    public PropertyDetailsNodeComponent build() {
      if (propertyDetailsNodeModule == null) {
        throw new IllegalStateException(
            PropertyDetailsNodeModule.class.getCanonicalName() + " must be set");
      }
      return new PropertyDetailsNodeComponentImpl(this);
    }

    @Override
    public PropertyDetailsNodeComponentBuilder setPropertyDetailsNodeModule(
        PropertyDetailsNodeModule module) {
      this.propertyDetailsNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class PropertyDetailsNodeComponentImpl implements PropertyDetailsNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<ObjectUiNode<?>> provideObjectUiNodeProvider;

    private Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider;

    private Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

    private MembersInjector<PropertyDetailsNodeRuleProvider>
        propertyDetailsNodeRuleProviderMembersInjector;

    private Provider<PropertyDetailsNodeRuleProvider> propertyDetailsNodeRuleProvider;

    private PropertyDetailsNodeComponentImpl(PropertyDetailsNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final PropertyDetailsNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              PropertyDetailsNodeModule_ProvideUiNodeFactory.create(
                  builder.propertyDetailsNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideObjectUiNodeProvider =
          DoubleCheck.provider(
              PropertyDetailsNodeModule_ProvideObjectUiNodeFactory.create(
                  builder.propertyDetailsNodeModule));

      this.objectValueRequiredValidationRuleProvider =
          ObjectValueRequiredValidationRule_Factory.create(
              MembersInjectors.<ObjectValueRequiredValidationRule>noOp(),
              provideObjectUiNodeProvider);

      this.updateObjectHasValueRuleProvider =
          UpdateObjectHasValueRule_Factory.create(
              MembersInjectors.<UpdateObjectHasValueRule>noOp(), provideObjectUiNodeProvider);

      this.propertyDetailsNodeRuleProviderMembersInjector =
          PropertyDetailsNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              objectValueRequiredValidationRuleProvider,
              updateObjectHasValueRuleProvider);

      this.propertyDetailsNodeRuleProvider =
          DoubleCheck.provider(
              PropertyDetailsNodeRuleProvider_Factory.create(
                  propertyDetailsNodeRuleProviderMembersInjector));
    }

    @Override
    public PropertyDetailsNodeRuleProvider getPropertyDetailsNodeRuleProvider() {
      return propertyDetailsNodeRuleProvider.get();
    }
  }

  private final class PhoneNumberNodeComponentBuilder implements PhoneNumberNodeComponent.Builder {
    private PhoneNumberNodeModule phoneNumberNodeModule;

    @Override
    public PhoneNumberNodeComponent build() {
      if (phoneNumberNodeModule == null) {
        throw new IllegalStateException(
            PhoneNumberNodeModule.class.getCanonicalName() + " must be set");
      }
      return new PhoneNumberNodeComponentImpl(this);
    }

    @Override
    public PhoneNumberNodeComponentBuilder setPhoneNumberNodeModule(PhoneNumberNodeModule module) {
      this.phoneNumberNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class PhoneNumberNodeComponentImpl implements PhoneNumberNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private Provider<StringUiNode<?>> provideStringUiNodeProvider;

    private Provider<PatternValidationRule> patternValidationRuleProvider;

    private Provider<LengthValidationRule> lengthValidationRuleProvider;

    private Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    private MembersInjector<PhoneNumberNodeRuleProvider> phoneNumberNodeRuleProviderMembersInjector;

    private Provider<PhoneNumberNodeRuleProvider> phoneNumberNodeRuleProvider;

    private PhoneNumberNodeComponentImpl(PhoneNumberNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final PhoneNumberNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              PhoneNumberNodeModule_ProvideUiNodeFactory.create(builder.phoneNumberNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              PhoneNumberNodeModule_ProvideLeafUiNodeFactory.create(builder.phoneNumberNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.provideStringUiNodeProvider =
          DoubleCheck.provider(
              PhoneNumberNodeModule_ProvideStringUiNodeFactory.create(
                  builder.phoneNumberNodeModule));

      this.patternValidationRuleProvider =
          PatternValidationRule_Factory.create(
              MembersInjectors.<PatternValidationRule>noOp(), provideStringUiNodeProvider);

      this.lengthValidationRuleProvider =
          LengthValidationRule_Factory.create(
              MembersInjectors.<LengthValidationRule>noOp(), provideStringUiNodeProvider);

      this.invalidCharPreChangeRuleProvider =
          InvalidCharPreChangeRule_Factory.create(
              MembersInjectors.<InvalidCharPreChangeRule>noOp(), provideStringUiNodeProvider);

      this.phoneNumberNodeRuleProviderMembersInjector =
          PhoneNumberNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              leafValueRequiredValidationRuleProvider,
              patternValidationRuleProvider,
              lengthValidationRuleProvider,
              invalidCharPreChangeRuleProvider);

      this.phoneNumberNodeRuleProvider =
          DoubleCheck.provider(
              PhoneNumberNodeRuleProvider_Factory.create(
                  phoneNumberNodeRuleProviderMembersInjector));
    }

    @Override
    public PhoneNumberNodeRuleProvider getPhoneNumberNodeRuleProvider() {
      return phoneNumberNodeRuleProvider.get();
    }
  }

  private final class CountryCodeNodeComponentBuilder implements CountryCodeNodeComponent.Builder {
    private CountryCodeNodeModule countryCodeNodeModule;

    @Override
    public CountryCodeNodeComponent build() {
      if (countryCodeNodeModule == null) {
        throw new IllegalStateException(
            CountryCodeNodeModule.class.getCanonicalName() + " must be set");
      }
      return new CountryCodeNodeComponentImpl(this);
    }

    @Override
    public CountryCodeNodeComponentBuilder setCountryCodeNodeModule(CountryCodeNodeModule module) {
      this.countryCodeNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class CountryCodeNodeComponentImpl implements CountryCodeNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private Provider<StringUiNode<?>> provideStringUiNodeProvider;

    private Provider<PatternValidationRule> patternValidationRuleProvider;

    private Provider<LengthValidationRule> lengthValidationRuleProvider;

    private Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    private MembersInjector<CountryCodeNodeRuleProvider> countryCodeNodeRuleProviderMembersInjector;

    private Provider<CountryCodeNodeRuleProvider> countryCodeNodeRuleProvider;

    private CountryCodeNodeComponentImpl(CountryCodeNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final CountryCodeNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              CountryCodeNodeModule_ProvideUiNodeFactory.create(builder.countryCodeNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              CountryCodeNodeModule_ProvideLeafUiNodeFactory.create(builder.countryCodeNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.provideStringUiNodeProvider =
          DoubleCheck.provider(
              CountryCodeNodeModule_ProvideStringUiNodeFactory.create(
                  builder.countryCodeNodeModule));

      this.patternValidationRuleProvider =
          PatternValidationRule_Factory.create(
              MembersInjectors.<PatternValidationRule>noOp(), provideStringUiNodeProvider);

      this.lengthValidationRuleProvider =
          LengthValidationRule_Factory.create(
              MembersInjectors.<LengthValidationRule>noOp(), provideStringUiNodeProvider);

      this.invalidCharPreChangeRuleProvider =
          InvalidCharPreChangeRule_Factory.create(
              MembersInjectors.<InvalidCharPreChangeRule>noOp(), provideStringUiNodeProvider);

      this.countryCodeNodeRuleProviderMembersInjector =
          CountryCodeNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              leafValueRequiredValidationRuleProvider,
              patternValidationRuleProvider,
              lengthValidationRuleProvider,
              invalidCharPreChangeRuleProvider);

      this.countryCodeNodeRuleProvider =
          DoubleCheck.provider(
              CountryCodeNodeRuleProvider_Factory.create(
                  countryCodeNodeRuleProviderMembersInjector));
    }

    @Override
    public CountryCodeNodeRuleProvider getCountryCodeNodeRuleProvider() {
      return countryCodeNodeRuleProvider.get();
    }
  }

  private final class AreaCodeNodeComponentBuilder implements AreaCodeNodeComponent.Builder {
    private AreaCodeNodeModule areaCodeNodeModule;

    @Override
    public AreaCodeNodeComponent build() {
      if (areaCodeNodeModule == null) {
        throw new IllegalStateException(
            AreaCodeNodeModule.class.getCanonicalName() + " must be set");
      }
      return new AreaCodeNodeComponentImpl(this);
    }

    @Override
    public AreaCodeNodeComponentBuilder setAreaCodeNodeModule(AreaCodeNodeModule module) {
      this.areaCodeNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class AreaCodeNodeComponentImpl implements AreaCodeNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private Provider<StringUiNode<?>> provideStringUiNodeProvider;

    private Provider<PatternValidationRule> patternValidationRuleProvider;

    private Provider<LengthValidationRule> lengthValidationRuleProvider;

    private Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    private MembersInjector<AreaCodeNodeRuleProvider> areaCodeNodeRuleProviderMembersInjector;

    private Provider<AreaCodeNodeRuleProvider> areaCodeNodeRuleProvider;

    private AreaCodeNodeComponentImpl(AreaCodeNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AreaCodeNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              AreaCodeNodeModule_ProvideUiNodeFactory.create(builder.areaCodeNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              AreaCodeNodeModule_ProvideLeafUiNodeFactory.create(builder.areaCodeNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.provideStringUiNodeProvider =
          DoubleCheck.provider(
              AreaCodeNodeModule_ProvideStringUiNodeFactory.create(builder.areaCodeNodeModule));

      this.patternValidationRuleProvider =
          PatternValidationRule_Factory.create(
              MembersInjectors.<PatternValidationRule>noOp(), provideStringUiNodeProvider);

      this.lengthValidationRuleProvider =
          LengthValidationRule_Factory.create(
              MembersInjectors.<LengthValidationRule>noOp(), provideStringUiNodeProvider);

      this.invalidCharPreChangeRuleProvider =
          InvalidCharPreChangeRule_Factory.create(
              MembersInjectors.<InvalidCharPreChangeRule>noOp(), provideStringUiNodeProvider);

      this.areaCodeNodeRuleProviderMembersInjector =
          AreaCodeNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              leafValueRequiredValidationRuleProvider,
              patternValidationRuleProvider,
              lengthValidationRuleProvider,
              invalidCharPreChangeRuleProvider);

      this.areaCodeNodeRuleProvider =
          DoubleCheck.provider(
              AreaCodeNodeRuleProvider_Factory.create(areaCodeNodeRuleProviderMembersInjector));
    }

    @Override
    public AreaCodeNodeRuleProvider getAreaCodeNodeRuleProvider() {
      return areaCodeNodeRuleProvider.get();
    }
  }

  private final class PhoneInfoNodeComponentBuilder implements PhoneInfoNodeComponent.Builder {
    private PhoneInfoNodeModule phoneInfoNodeModule;

    @Override
    public PhoneInfoNodeComponent build() {
      if (phoneInfoNodeModule == null) {
        throw new IllegalStateException(
            PhoneInfoNodeModule.class.getCanonicalName() + " must be set");
      }
      return new PhoneInfoNodeComponentImpl(this);
    }

    @Override
    public PhoneInfoNodeComponentBuilder setPhoneInfoNodeModule(PhoneInfoNodeModule module) {
      this.phoneInfoNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class PhoneInfoNodeComponentImpl implements PhoneInfoNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<ObjectUiNode<?>> provideObjectUiNodeProvider;

    private Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider;

    private Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

    private Provider<PhoneInfoNode> providePhoneInfoNodeProvider;

    private Provider<PhoneInfoAllOrNothingRuleImpl> phoneInfoAllOrNothingRuleImplProvider;

    private Provider<PhoneInfoAllOrNothingRule> providePhoneInfoAllOrNothingRuleProvider;

    private MembersInjector<PhoneInfoNodeRuleProvider> phoneInfoNodeRuleProviderMembersInjector;

    private Provider<PhoneInfoNodeRuleProvider> phoneInfoNodeRuleProvider;

    private PhoneInfoNodeComponentImpl(PhoneInfoNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final PhoneInfoNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              PhoneInfoNodeModule_ProvideUiNodeFactory.create(builder.phoneInfoNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideObjectUiNodeProvider =
          DoubleCheck.provider(
              PhoneInfoNodeModule_ProvideObjectUiNodeFactory.create(builder.phoneInfoNodeModule));

      this.objectValueRequiredValidationRuleProvider =
          ObjectValueRequiredValidationRule_Factory.create(
              MembersInjectors.<ObjectValueRequiredValidationRule>noOp(),
              provideObjectUiNodeProvider);

      this.updateObjectHasValueRuleProvider =
          UpdateObjectHasValueRule_Factory.create(
              MembersInjectors.<UpdateObjectHasValueRule>noOp(), provideObjectUiNodeProvider);

      this.providePhoneInfoNodeProvider =
          DoubleCheck.provider(
              PhoneInfoNodeModule_ProvidePhoneInfoNodeFactory.create(builder.phoneInfoNodeModule));

      this.phoneInfoAllOrNothingRuleImplProvider =
          PhoneInfoAllOrNothingRuleImpl_Factory.create(
              MembersInjectors.<PhoneInfoAllOrNothingRuleImpl>noOp(), providePhoneInfoNodeProvider);

      this.providePhoneInfoAllOrNothingRuleProvider =
          (Provider) phoneInfoAllOrNothingRuleImplProvider;

      this.phoneInfoNodeRuleProviderMembersInjector =
          PhoneInfoNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              objectValueRequiredValidationRuleProvider,
              updateObjectHasValueRuleProvider,
              providePhoneInfoAllOrNothingRuleProvider);

      this.phoneInfoNodeRuleProvider =
          DoubleCheck.provider(
              PhoneInfoNodeRuleProvider_Factory.create(phoneInfoNodeRuleProviderMembersInjector));
    }

    @Override
    public PhoneInfoNodeRuleProvider getPhoneInfoNodeRuleProvider() {
      return phoneInfoNodeRuleProvider.get();
    }
  }

  private final class PasswordNodeComponentBuilder implements PasswordNodeComponent.Builder {
    private PasswordNodeModule passwordNodeModule;

    @Override
    public PasswordNodeComponent build() {
      if (passwordNodeModule == null) {
        throw new IllegalStateException(
            PasswordNodeModule.class.getCanonicalName() + " must be set");
      }
      return new PasswordNodeComponentImpl(this);
    }

    @Override
    public PasswordNodeComponentBuilder setPasswordNodeModule(PasswordNodeModule module) {
      this.passwordNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class PasswordNodeComponentImpl implements PasswordNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private Provider<StringUiNode<?>> provideStringUiNodeProvider;

    private Provider<PatternValidationRule> patternValidationRuleProvider;

    private Provider<LengthValidationRule> lengthValidationRuleProvider;

    private Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    private Provider<PasswordNode> providePasswordNodeProvider;

    private Provider<PasswordIsStrongRuleImpl> passwordIsStrongRuleImplProvider;

    private Provider<PasswordIsStrongRule> providePasswordIsStrongRuleProvider;

    private MembersInjector<PasswordNodeRuleProvider> passwordNodeRuleProviderMembersInjector;

    private Provider<PasswordNodeRuleProvider> passwordNodeRuleProvider;

    private PasswordNodeComponentImpl(PasswordNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final PasswordNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              PasswordNodeModule_ProvideUiNodeFactory.create(builder.passwordNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              PasswordNodeModule_ProvideLeafUiNodeFactory.create(builder.passwordNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.provideStringUiNodeProvider =
          DoubleCheck.provider(
              PasswordNodeModule_ProvideStringUiNodeFactory.create(builder.passwordNodeModule));

      this.patternValidationRuleProvider =
          PatternValidationRule_Factory.create(
              MembersInjectors.<PatternValidationRule>noOp(), provideStringUiNodeProvider);

      this.lengthValidationRuleProvider =
          LengthValidationRule_Factory.create(
              MembersInjectors.<LengthValidationRule>noOp(), provideStringUiNodeProvider);

      this.invalidCharPreChangeRuleProvider =
          InvalidCharPreChangeRule_Factory.create(
              MembersInjectors.<InvalidCharPreChangeRule>noOp(), provideStringUiNodeProvider);

      this.providePasswordNodeProvider =
          DoubleCheck.provider(
              PasswordNodeModule_ProvidePasswordNodeFactory.create(builder.passwordNodeModule));

      this.passwordIsStrongRuleImplProvider =
          PasswordIsStrongRuleImpl_Factory.create(
              MembersInjectors.<PasswordIsStrongRuleImpl>noOp(), providePasswordNodeProvider);

      this.providePasswordIsStrongRuleProvider = (Provider) passwordIsStrongRuleImplProvider;

      this.passwordNodeRuleProviderMembersInjector =
          PasswordNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              leafValueRequiredValidationRuleProvider,
              patternValidationRuleProvider,
              lengthValidationRuleProvider,
              invalidCharPreChangeRuleProvider,
              providePasswordIsStrongRuleProvider);

      this.passwordNodeRuleProvider =
          DoubleCheck.provider(
              PasswordNodeRuleProvider_Factory.create(passwordNodeRuleProviderMembersInjector));
    }

    @Override
    public PasswordNodeRuleProvider getPasswordNodeRuleProvider() {
      return passwordNodeRuleProvider.get();
    }
  }

  private final class OwnInvestmentPropertyNodeComponentBuilder
      implements OwnInvestmentPropertyNodeComponent.Builder {
    private OwnInvestmentPropertyNodeModule ownInvestmentPropertyNodeModule;

    @Override
    public OwnInvestmentPropertyNodeComponent build() {
      if (ownInvestmentPropertyNodeModule == null) {
        throw new IllegalStateException(
            OwnInvestmentPropertyNodeModule.class.getCanonicalName() + " must be set");
      }
      return new OwnInvestmentPropertyNodeComponentImpl(this);
    }

    @Override
    public OwnInvestmentPropertyNodeComponentBuilder setOwnInvestmentPropertyNodeModule(
        OwnInvestmentPropertyNodeModule module) {
      this.ownInvestmentPropertyNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class OwnInvestmentPropertyNodeComponentImpl
      implements OwnInvestmentPropertyNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private Provider<BooleanUiNode<?>> provideBooleanUiNodeProvider;

    private Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider;

    private Provider<OwnInvestmentPropertyNode> provideOwnInvestmentPropertyNodeProvider;

    private Provider<LoadInvestmentPropertyRuleImpl> loadInvestmentPropertyRuleImplProvider;

    private Provider<LoadInvestmentPropertyRule> provideLoadInvestmentPropertyRuleProvider;

    private MembersInjector<OwnInvestmentPropertyNodeRuleProvider>
        ownInvestmentPropertyNodeRuleProviderMembersInjector;

    private Provider<OwnInvestmentPropertyNodeRuleProvider> ownInvestmentPropertyNodeRuleProvider;

    private OwnInvestmentPropertyNodeComponentImpl(
        OwnInvestmentPropertyNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final OwnInvestmentPropertyNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              OwnInvestmentPropertyNodeModule_ProvideUiNodeFactory.create(
                  builder.ownInvestmentPropertyNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              OwnInvestmentPropertyNodeModule_ProvideLeafUiNodeFactory.create(
                  builder.ownInvestmentPropertyNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.provideBooleanUiNodeProvider =
          DoubleCheck.provider(
              OwnInvestmentPropertyNodeModule_ProvideBooleanUiNodeFactory.create(
                  builder.ownInvestmentPropertyNodeModule));

      this.booleanFixedValueValidationRuleProvider =
          BooleanFixedValueValidationRule_Factory.create(
              MembersInjectors.<BooleanFixedValueValidationRule>noOp(),
              provideBooleanUiNodeProvider);

      this.provideOwnInvestmentPropertyNodeProvider =
          DoubleCheck.provider(
              OwnInvestmentPropertyNodeModule_ProvideOwnInvestmentPropertyNodeFactory.create(
                  builder.ownInvestmentPropertyNodeModule));

      this.loadInvestmentPropertyRuleImplProvider =
          LoadInvestmentPropertyRuleImpl_Factory.create(
              MembersInjectors.<LoadInvestmentPropertyRuleImpl>noOp(),
              provideOwnInvestmentPropertyNodeProvider);

      this.provideLoadInvestmentPropertyRuleProvider =
          (Provider) loadInvestmentPropertyRuleImplProvider;

      this.ownInvestmentPropertyNodeRuleProviderMembersInjector =
          OwnInvestmentPropertyNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              leafValueRequiredValidationRuleProvider,
              booleanFixedValueValidationRuleProvider,
              provideLoadInvestmentPropertyRuleProvider);

      this.ownInvestmentPropertyNodeRuleProvider =
          DoubleCheck.provider(
              OwnInvestmentPropertyNodeRuleProvider_Factory.create(
                  ownInvestmentPropertyNodeRuleProviderMembersInjector));
    }

    @Override
    public OwnInvestmentPropertyNodeRuleProvider getOwnInvestmentPropertyNodeRuleProvider() {
      return ownInvestmentPropertyNodeRuleProvider.get();
    }
  }

  private final class ErrorNodeComponentBuilder implements ErrorNodeComponent.Builder {
    private ErrorNodeModule errorNodeModule;

    @Override
    public ErrorNodeComponent build() {
      if (errorNodeModule == null) {
        throw new IllegalStateException(ErrorNodeModule.class.getCanonicalName() + " must be set");
      }
      return new ErrorNodeComponentImpl(this);
    }

    @Override
    public ErrorNodeComponentBuilder setErrorNodeModule(ErrorNodeModule module) {
      this.errorNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class ErrorNodeComponentImpl implements ErrorNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private MembersInjector<ErrorNodeRuleProvider> errorNodeRuleProviderMembersInjector;

    private Provider<ErrorNodeRuleProvider> errorNodeRuleProvider;

    private ErrorNodeComponentImpl(ErrorNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ErrorNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              ErrorNodeModule_ProvideUiNodeFactory.create(builder.errorNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              ErrorNodeModule_ProvideLeafUiNodeFactory.create(builder.errorNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.errorNodeRuleProviderMembersInjector =
          ErrorNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider, leafValueRequiredValidationRuleProvider);

      this.errorNodeRuleProvider =
          DoubleCheck.provider(
              ErrorNodeRuleProvider_Factory.create(errorNodeRuleProviderMembersInjector));
    }

    @Override
    public ErrorNodeRuleProvider getErrorNodeRuleProvider() {
      return errorNodeRuleProvider.get();
    }
  }

  private final class ErrorListNodeComponentBuilder implements ErrorListNodeComponent.Builder {
    private ErrorListNodeModule errorListNodeModule;

    @Override
    public ErrorListNodeComponent build() {
      if (errorListNodeModule == null) {
        throw new IllegalStateException(
            ErrorListNodeModule.class.getCanonicalName() + " must be set");
      }
      return new ErrorListNodeComponentImpl(this);
    }

    @Override
    public ErrorListNodeComponentBuilder setErrorListNodeModule(ErrorListNodeModule module) {
      this.errorListNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class ErrorListNodeComponentImpl implements ErrorListNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private MembersInjector<ErrorListNodeRuleProvider> errorListNodeRuleProviderMembersInjector;

    private Provider<ErrorListNodeRuleProvider> errorListNodeRuleProvider;

    private ErrorListNodeComponentImpl(ErrorListNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ErrorListNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              ErrorListNodeModule_ProvideUiNodeFactory.create(builder.errorListNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.errorListNodeRuleProviderMembersInjector =
          ErrorListNodeRuleProvider_MembersInjector.create(clearErrorsForDisabledNodeRuleProvider);

      this.errorListNodeRuleProvider =
          DoubleCheck.provider(
              ErrorListNodeRuleProvider_Factory.create(errorListNodeRuleProviderMembersInjector));
    }

    @Override
    public ErrorListNodeRuleProvider getErrorListNodeRuleProvider() {
      return errorListNodeRuleProvider.get();
    }
  }

  private final class EmailNodeComponentBuilder implements EmailNodeComponent.Builder {
    private EmailNodeModule emailNodeModule;

    @Override
    public EmailNodeComponent build() {
      if (emailNodeModule == null) {
        throw new IllegalStateException(EmailNodeModule.class.getCanonicalName() + " must be set");
      }
      return new EmailNodeComponentImpl(this);
    }

    @Override
    public EmailNodeComponentBuilder setEmailNodeModule(EmailNodeModule module) {
      this.emailNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class EmailNodeComponentImpl implements EmailNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private Provider<StringUiNode<?>> provideStringUiNodeProvider;

    private Provider<PatternValidationRule> patternValidationRuleProvider;

    private Provider<LengthValidationRule> lengthValidationRuleProvider;

    private Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    private Provider<EmailNode> provideEmailNodeProvider;

    private Provider<EmailChangeReasonRuleImpl> emailChangeReasonRuleImplProvider;

    private Provider<EmailChangeReasonRule> provideEmailChangeReasonRuleProvider;

    private MembersInjector<EmailNodeRuleProvider> emailNodeRuleProviderMembersInjector;

    private Provider<EmailNodeRuleProvider> emailNodeRuleProvider;

    private EmailNodeComponentImpl(EmailNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final EmailNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              EmailNodeModule_ProvideUiNodeFactory.create(builder.emailNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              EmailNodeModule_ProvideLeafUiNodeFactory.create(builder.emailNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.provideStringUiNodeProvider =
          DoubleCheck.provider(
              EmailNodeModule_ProvideStringUiNodeFactory.create(builder.emailNodeModule));

      this.patternValidationRuleProvider =
          PatternValidationRule_Factory.create(
              MembersInjectors.<PatternValidationRule>noOp(), provideStringUiNodeProvider);

      this.lengthValidationRuleProvider =
          LengthValidationRule_Factory.create(
              MembersInjectors.<LengthValidationRule>noOp(), provideStringUiNodeProvider);

      this.invalidCharPreChangeRuleProvider =
          InvalidCharPreChangeRule_Factory.create(
              MembersInjectors.<InvalidCharPreChangeRule>noOp(), provideStringUiNodeProvider);

      this.provideEmailNodeProvider =
          DoubleCheck.provider(
              EmailNodeModule_ProvideEmailNodeFactory.create(builder.emailNodeModule));

      this.emailChangeReasonRuleImplProvider =
          EmailChangeReasonRuleImpl_Factory.create(
              MembersInjectors.<EmailChangeReasonRuleImpl>noOp(), provideEmailNodeProvider);

      this.provideEmailChangeReasonRuleProvider = (Provider) emailChangeReasonRuleImplProvider;

      this.emailNodeRuleProviderMembersInjector =
          EmailNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              leafValueRequiredValidationRuleProvider,
              patternValidationRuleProvider,
              lengthValidationRuleProvider,
              invalidCharPreChangeRuleProvider,
              provideEmailChangeReasonRuleProvider);

      this.emailNodeRuleProvider =
          DoubleCheck.provider(
              EmailNodeRuleProvider_Factory.create(emailNodeRuleProviderMembersInjector));
    }

    @Override
    public EmailNodeRuleProvider getEmailNodeRuleProvider() {
      return emailNodeRuleProvider.get();
    }
  }

  private final class AgeNodeComponentBuilder implements AgeNodeComponent.Builder {
    private AgeNodeModule ageNodeModule;

    @Override
    public AgeNodeComponent build() {
      if (ageNodeModule == null) {
        throw new IllegalStateException(AgeNodeModule.class.getCanonicalName() + " must be set");
      }
      return new AgeNodeComponentImpl(this);
    }

    @Override
    public AgeNodeComponentBuilder setAgeNodeModule(AgeNodeModule module) {
      this.ageNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class AgeNodeComponentImpl implements AgeNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<LeafUiNode<?, ?>> provideLeafUiNodeProvider;

    private Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

    private Provider<BigDecimalUiNode<?>> provideBigDecimalUiNodeProvider;

    private Provider<RangeValidationRule> rangeValidationRuleProvider;

    private Provider<NumberFormatValidationRule> numberFormatValidationRuleProvider;

    private Provider<AgeNode> provideAgeNodeProvider;

    private Provider<UpdatePlanRuleImpl> updatePlanRuleImplProvider;

    private Provider<UpdatePlanRule> provideUpdatePlanRuleProvider;

    private MembersInjector<AgeNodeRuleProvider> ageNodeRuleProviderMembersInjector;

    private Provider<AgeNodeRuleProvider> ageNodeRuleProvider;

    private AgeNodeComponentImpl(AgeNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AgeNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(AgeNodeModule_ProvideUiNodeFactory.create(builder.ageNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideLeafUiNodeProvider =
          DoubleCheck.provider(
              AgeNodeModule_ProvideLeafUiNodeFactory.create(builder.ageNodeModule));

      this.leafValueRequiredValidationRuleProvider =
          LeafValueRequiredValidationRule_Factory.create(
              MembersInjectors.<LeafValueRequiredValidationRule>noOp(), provideLeafUiNodeProvider);

      this.provideBigDecimalUiNodeProvider =
          DoubleCheck.provider(
              AgeNodeModule_ProvideBigDecimalUiNodeFactory.create(builder.ageNodeModule));

      this.rangeValidationRuleProvider =
          RangeValidationRule_Factory.create(
              MembersInjectors.<RangeValidationRule>noOp(), provideBigDecimalUiNodeProvider);

      this.numberFormatValidationRuleProvider =
          NumberFormatValidationRule_Factory.create(
              MembersInjectors.<NumberFormatValidationRule>noOp(), provideBigDecimalUiNodeProvider);

      this.provideAgeNodeProvider =
          DoubleCheck.provider(AgeNodeModule_ProvideAgeNodeFactory.create(builder.ageNodeModule));

      this.updatePlanRuleImplProvider =
          UpdatePlanRuleImpl_Factory.create(
              MembersInjectors.<UpdatePlanRuleImpl>noOp(), provideAgeNodeProvider);

      this.provideUpdatePlanRuleProvider = (Provider) updatePlanRuleImplProvider;

      this.ageNodeRuleProviderMembersInjector =
          AgeNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              leafValueRequiredValidationRuleProvider,
              rangeValidationRuleProvider,
              numberFormatValidationRuleProvider,
              provideUpdatePlanRuleProvider);

      this.ageNodeRuleProvider =
          DoubleCheck.provider(
              AgeNodeRuleProvider_Factory.create(ageNodeRuleProviderMembersInjector));
    }

    @Override
    public AgeNodeRuleProvider getAgeNodeRuleProvider() {
      return ageNodeRuleProvider.get();
    }
  }

  private final class RegisterNodeComponentBuilder implements RegisterNodeComponent.Builder {
    private RegisterNodeModule registerNodeModule;

    @Override
    public RegisterNodeComponent build() {
      if (registerNodeModule == null) {
        throw new IllegalStateException(
            RegisterNodeModule.class.getCanonicalName() + " must be set");
      }
      return new RegisterNodeComponentImpl(this);
    }

    @Override
    public RegisterNodeComponentBuilder setRegisterNodeModule(RegisterNodeModule module) {
      this.registerNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class RegisterNodeComponentImpl implements RegisterNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<ObjectUiNode<?>> provideObjectUiNodeProvider;

    private Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider;

    private Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

    private Provider<RegisterNode> provideRegisterNodeProvider;

    private Provider<SetHasErrorRuleImpl> setHasErrorRuleImplProvider;

    private Provider<SetHasErrorRule> provideSetHasErrorRuleImplProvider;

    private Provider<CreateErrorNodeRuleImpl> createErrorNodeRuleImplProvider;

    private Provider<CreateErrorNodeRule> provideCreateErrorNodeRuleProvider;

    private MembersInjector<RegisterNodeRuleProvider> registerNodeRuleProviderMembersInjector;

    private Provider<RegisterNodeRuleProvider> registerNodeRuleProvider;

    private RegisterNodeComponentImpl(RegisterNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final RegisterNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              RegisterNodeModule_ProvideUiNodeFactory.create(builder.registerNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideObjectUiNodeProvider =
          DoubleCheck.provider(
              RegisterNodeModule_ProvideObjectUiNodeFactory.create(builder.registerNodeModule));

      this.objectValueRequiredValidationRuleProvider =
          ObjectValueRequiredValidationRule_Factory.create(
              MembersInjectors.<ObjectValueRequiredValidationRule>noOp(),
              provideObjectUiNodeProvider);

      this.updateObjectHasValueRuleProvider =
          UpdateObjectHasValueRule_Factory.create(
              MembersInjectors.<UpdateObjectHasValueRule>noOp(), provideObjectUiNodeProvider);

      this.provideRegisterNodeProvider =
          DoubleCheck.provider(
              RegisterNodeModule_ProvideRegisterNodeFactory.create(builder.registerNodeModule));

      this.setHasErrorRuleImplProvider =
          SetHasErrorRuleImpl_Factory.create(
              MembersInjectors.<SetHasErrorRuleImpl>noOp(), provideRegisterNodeProvider);

      this.provideSetHasErrorRuleImplProvider = (Provider) setHasErrorRuleImplProvider;

      this.createErrorNodeRuleImplProvider =
          CreateErrorNodeRuleImpl_Factory.create(
              MembersInjectors.<CreateErrorNodeRuleImpl>noOp(), provideRegisterNodeProvider);

      this.provideCreateErrorNodeRuleProvider = (Provider) createErrorNodeRuleImplProvider;

      this.registerNodeRuleProviderMembersInjector =
          RegisterNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              objectValueRequiredValidationRuleProvider,
              updateObjectHasValueRuleProvider,
              provideSetHasErrorRuleImplProvider,
              provideCreateErrorNodeRuleProvider);

      this.registerNodeRuleProvider =
          DoubleCheck.provider(
              RegisterNodeRuleProvider_Factory.create(registerNodeRuleProviderMembersInjector));
    }

    @Override
    public RegisterNodeRuleProvider getRegisterNodeRuleProvider() {
      return registerNodeRuleProvider.get();
    }
  }
}
