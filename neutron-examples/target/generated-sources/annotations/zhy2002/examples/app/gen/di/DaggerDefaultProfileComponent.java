package zhy2002.examples.app.gen.di;

import dagger.MembersInjector;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.app.gen.LodgementNodeClassRegistry;
import zhy2002.examples.app.gen.LodgementNodeClassRegistry_Factory;
import zhy2002.examples.app.gen.LodgementNodeContext;
import zhy2002.examples.app.gen.LodgementNodeContext_Factory;
import zhy2002.examples.app.gen.LodgementNodeContext_MembersInjector;
import zhy2002.examples.app.gen.node.AppManagerNode;
import zhy2002.examples.app.gen.node.AppManagerNode_MembersInjector;
import zhy2002.examples.app.gen.node.LodgementNode;
import zhy2002.examples.app.gen.node.LodgementNodeChildProvider;
import zhy2002.examples.app.gen.node.LodgementNodeChildProvider_Factory;
import zhy2002.examples.app.gen.node.LodgementNodeChildProvider_MembersInjector;
import zhy2002.examples.app.gen.node.LodgementNode_Factory;
import zhy2002.examples.app.gen.node.LodgementNode_MembersInjector;
import zhy2002.examples.app.gen.rule.AppManagerNodeRuleProvider;
import zhy2002.examples.app.gen.rule.AppManagerNodeRuleProvider_Factory;
import zhy2002.examples.app.gen.rule.AppManagerNodeRuleProvider_MembersInjector;
import zhy2002.examples.app.gen.rule.DummyRule;
import zhy2002.examples.app.gen.rule.LodgementNodeRuleProvider;
import zhy2002.examples.app.gen.rule.LodgementNodeRuleProvider_Factory;
import zhy2002.examples.app.gen.rule.LodgementNodeRuleProvider_MembersInjector;
import zhy2002.examples.app.rule.DummyRuleImpl;
import zhy2002.examples.app.rule.DummyRuleImpl_Factory;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.NodeFinder;
import zhy2002.neutron.NodeFinder_Factory;
import zhy2002.neutron.NodeReferenceRegistry;
import zhy2002.neutron.NodeReferenceRegistry_Factory;
import zhy2002.neutron.ObjectUiNode;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeChangeEngine;
import zhy2002.neutron.UiNodeChangeEngineImpl_Factory;
import zhy2002.neutron.UniqueIdGenerator;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule_Factory;
import zhy2002.neutron.rule.ObjectValueRequiredValidationRule;
import zhy2002.neutron.rule.ObjectValueRequiredValidationRule_Factory;
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

  private Provider<AppManagerNodeComponent.Builder> appManagerNodeComponentBuilderProvider;

  private MembersInjector<AppManagerNode> appManagerNodeMembersInjector;

  private MembersInjector<LodgementNodeChildProvider> lodgementNodeChildProviderMembersInjector;

  private Provider<LodgementNodeChildProvider> lodgementNodeChildProvider;

  private Provider<LodgementNodeComponent.Builder> lodgementNodeComponentBuilderProvider;

  private MembersInjector<LodgementNode> lodgementNodeMembersInjector;

  private Provider<LodgementNode> lodgementNodeProvider;

  private MembersInjector<LodgementNodeContext> lodgementNodeContextMembersInjector;

  private Provider<UiNodeChangeEngine> provideUiNodeChangeEngineProvider;

  private Provider<UniqueIdGenerator> provideSequentialUniqueIdGeneratorProvider;

  private Provider<LodgementNodeClassRegistry> lodgementNodeClassRegistryProvider;

  private Provider<ClassRegistryImpl> provideClassRegistryImplProvider;

  private Provider<LodgementNodeContext> lodgementNodeContextProvider;

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

    this.appManagerNodeComponentBuilderProvider =
        new Factory<AppManagerNodeComponent.Builder>() {
          @Override
          public AppManagerNodeComponent.Builder get() {
            return new AppManagerNodeComponentBuilder();
          }
        };

    this.appManagerNodeMembersInjector =
        AppManagerNode_MembersInjector.create(appManagerNodeComponentBuilderProvider);

    this.lodgementNodeChildProviderMembersInjector =
        LodgementNodeChildProvider_MembersInjector.create(appManagerNodeMembersInjector);

    this.lodgementNodeChildProvider =
        DoubleCheck.provider(
            LodgementNodeChildProvider_Factory.create(lodgementNodeChildProviderMembersInjector));

    this.lodgementNodeComponentBuilderProvider =
        new Factory<LodgementNodeComponent.Builder>() {
          @Override
          public LodgementNodeComponent.Builder get() {
            return new LodgementNodeComponentBuilder();
          }
        };

    this.lodgementNodeMembersInjector =
        LodgementNode_MembersInjector.create(
            lodgementNodeChildProvider, lodgementNodeComponentBuilderProvider);
    this.lodgementNodeContextProvider = new DelegateFactory();

    this.lodgementNodeProvider =
        DoubleCheck.provider(
            LodgementNode_Factory.create(
                lodgementNodeMembersInjector, lodgementNodeContextProvider));

    this.lodgementNodeContextMembersInjector =
        LodgementNodeContext_MembersInjector.create(
            nodeFinderProvider, nodeReferenceRegistryProvider, lodgementNodeProvider);

    this.provideUiNodeChangeEngineProvider =
        DoubleCheck.provider((Provider) UiNodeChangeEngineImpl_Factory.create());

    this.provideSequentialUniqueIdGeneratorProvider =
        DoubleCheck.provider((Provider) SequentialUniqueIdGenerator_Factory.create());

    this.lodgementNodeClassRegistryProvider =
        DoubleCheck.provider(
            LodgementNodeClassRegistry_Factory.create(
                MembersInjectors.<LodgementNodeClassRegistry>noOp()));

    this.provideClassRegistryImplProvider =
        DoubleCheck.provider((Provider) lodgementNodeClassRegistryProvider);

    DelegateFactory lodgementNodeContextProviderDelegate =
        (DelegateFactory) lodgementNodeContextProvider;
    this.lodgementNodeContextProvider =
        DoubleCheck.provider(
            LodgementNodeContext_Factory.create(
                lodgementNodeContextMembersInjector,
                provideUiNodeChangeEngineProvider,
                provideSequentialUniqueIdGeneratorProvider,
                provideClassRegistryImplProvider));
    lodgementNodeContextProviderDelegate.setDelegatedProvider(lodgementNodeContextProvider);
  }

  @Override
  public LodgementNodeContext provideLodgementNodeContext() {
    return lodgementNodeContextProvider.get();
  }

  public static final class Builder {
    private Builder() {}

    public DefaultProfileComponent build() {
      return new DaggerDefaultProfileComponent(this);
    }
  }

  private final class AppManagerNodeComponentBuilder implements AppManagerNodeComponent.Builder {
    private AppManagerNodeModule appManagerNodeModule;

    @Override
    public AppManagerNodeComponent build() {
      if (appManagerNodeModule == null) {
        throw new IllegalStateException(
            AppManagerNodeModule.class.getCanonicalName() + " must be set");
      }
      return new AppManagerNodeComponentImpl(this);
    }

    @Override
    public AppManagerNodeComponentBuilder setAppManagerNodeModule(AppManagerNodeModule module) {
      this.appManagerNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class AppManagerNodeComponentImpl implements AppManagerNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<ObjectUiNode<?>> provideObjectUiNodeProvider;

    private Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider;

    private Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

    private MembersInjector<AppManagerNodeRuleProvider> appManagerNodeRuleProviderMembersInjector;

    private Provider<AppManagerNodeRuleProvider> appManagerNodeRuleProvider;

    private AppManagerNodeComponentImpl(AppManagerNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AppManagerNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              AppManagerNodeModule_ProvideUiNodeFactory.create(builder.appManagerNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideObjectUiNodeProvider =
          DoubleCheck.provider(
              AppManagerNodeModule_ProvideObjectUiNodeFactory.create(builder.appManagerNodeModule));

      this.objectValueRequiredValidationRuleProvider =
          ObjectValueRequiredValidationRule_Factory.create(
              MembersInjectors.<ObjectValueRequiredValidationRule>noOp(),
              provideObjectUiNodeProvider);

      this.updateObjectHasValueRuleProvider =
          UpdateObjectHasValueRule_Factory.create(
              MembersInjectors.<UpdateObjectHasValueRule>noOp(), provideObjectUiNodeProvider);

      this.appManagerNodeRuleProviderMembersInjector =
          AppManagerNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              objectValueRequiredValidationRuleProvider,
              updateObjectHasValueRuleProvider);

      this.appManagerNodeRuleProvider =
          DoubleCheck.provider(
              AppManagerNodeRuleProvider_Factory.create(appManagerNodeRuleProviderMembersInjector));
    }

    @Override
    public AppManagerNodeRuleProvider getAppManagerNodeRuleProvider() {
      return appManagerNodeRuleProvider.get();
    }
  }

  private final class LodgementNodeComponentBuilder implements LodgementNodeComponent.Builder {
    private LodgementNodeModule lodgementNodeModule;

    @Override
    public LodgementNodeComponent build() {
      if (lodgementNodeModule == null) {
        throw new IllegalStateException(
            LodgementNodeModule.class.getCanonicalName() + " must be set");
      }
      return new LodgementNodeComponentImpl(this);
    }

    @Override
    public LodgementNodeComponentBuilder setLodgementNodeModule(LodgementNodeModule module) {
      this.lodgementNodeModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class LodgementNodeComponentImpl implements LodgementNodeComponent {
    private Provider<UiNode<?>> provideUiNodeProvider;

    private Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    private Provider<ObjectUiNode<?>> provideObjectUiNodeProvider;

    private Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider;

    private Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

    private Provider<LodgementNode> provideLodgementNodeProvider;

    private Provider<DummyRuleImpl> dummyRuleImplProvider;

    private Provider<DummyRule> provideDummyRuleProvider;

    private MembersInjector<LodgementNodeRuleProvider> lodgementNodeRuleProviderMembersInjector;

    private Provider<LodgementNodeRuleProvider> lodgementNodeRuleProvider;

    private LodgementNodeComponentImpl(LodgementNodeComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final LodgementNodeComponentBuilder builder) {

      this.provideUiNodeProvider =
          DoubleCheck.provider(
              LodgementNodeModule_ProvideUiNodeFactory.create(builder.lodgementNodeModule));

      this.clearErrorsForDisabledNodeRuleProvider =
          ClearErrorsForDisabledNodeRule_Factory.create(
              MembersInjectors.<ClearErrorsForDisabledNodeRule>noOp(), provideUiNodeProvider);

      this.provideObjectUiNodeProvider =
          DoubleCheck.provider(
              LodgementNodeModule_ProvideObjectUiNodeFactory.create(builder.lodgementNodeModule));

      this.objectValueRequiredValidationRuleProvider =
          ObjectValueRequiredValidationRule_Factory.create(
              MembersInjectors.<ObjectValueRequiredValidationRule>noOp(),
              provideObjectUiNodeProvider);

      this.updateObjectHasValueRuleProvider =
          UpdateObjectHasValueRule_Factory.create(
              MembersInjectors.<UpdateObjectHasValueRule>noOp(), provideObjectUiNodeProvider);

      this.provideLodgementNodeProvider =
          DoubleCheck.provider(
              LodgementNodeModule_ProvideLodgementNodeFactory.create(builder.lodgementNodeModule));

      this.dummyRuleImplProvider =
          DoubleCheck.provider(
              DummyRuleImpl_Factory.create(
                  MembersInjectors.<DummyRuleImpl>noOp(), provideLodgementNodeProvider));

      this.provideDummyRuleProvider = (Provider) dummyRuleImplProvider;

      this.lodgementNodeRuleProviderMembersInjector =
          LodgementNodeRuleProvider_MembersInjector.create(
              clearErrorsForDisabledNodeRuleProvider,
              objectValueRequiredValidationRuleProvider,
              updateObjectHasValueRuleProvider,
              provideDummyRuleProvider);

      this.lodgementNodeRuleProvider =
          DoubleCheck.provider(
              LodgementNodeRuleProvider_Factory.create(lodgementNodeRuleProviderMembersInjector));
    }

    @Override
    public LodgementNodeRuleProvider getLodgementNodeRuleProvider() {
      return lodgementNodeRuleProvider.get();
    }
  }
}
