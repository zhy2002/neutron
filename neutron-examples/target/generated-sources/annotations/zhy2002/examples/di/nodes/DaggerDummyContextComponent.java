package zhy2002.examples.di.nodes;

import dagger.MembersInjector;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerDummyContextComponent implements DummyContextComponent {
  private Provider<DummyChangeEngineImpl> dummyChangeEngineImplProvider;

  private Provider<DummyChangeEngine> provideDummyChangeEngineProvider;

  private Provider<DummyMiddleANode> getDummyMiddleANodeLazy1Provider;

  private Provider<DummyMiddleANode> getDummyMiddleANodeLazy2Provider;

  private Provider<DummyListAItemComponent.Builder> dummyListAItemComponentBuilderProvider;

  private MembersInjector<DummyListANode> dummyListANodeMembersInjector;

  private Provider<DummyListANode> getDummyListANodeProvider;

  private MembersInjector<DummyMiddleBNode> dummyMiddleBNodeMembersInjector;

  private Provider<DummyMiddleBNode> getDummyMiddleBNodeLazyProvider;

  private MembersInjector<DummyRootNode> dummyRootNodeMembersInjector;

  private Provider<DummyRootNode> dummyRootNodeProvider;

  private Provider<DummyContext> dummyContextProvider;

  private DaggerDummyContextComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static DummyContextComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.dummyChangeEngineImplProvider =
        DoubleCheck.provider(DummyChangeEngineImpl_Factory.create());

    this.provideDummyChangeEngineProvider = (Provider) dummyChangeEngineImplProvider;
    this.dummyRootNodeProvider = new DelegateFactory();

    this.getDummyMiddleANodeLazy1Provider =
        DoubleCheck.provider(
            DummyChildNodeModule_GetDummyMiddleANodeLazy1Factory.create(
                builder.dummyChildNodeModule,
                dummyRootNodeProvider,
                MembersInjectors.<DummyMiddleANode>noOp()));

    this.getDummyMiddleANodeLazy2Provider =
        DoubleCheck.provider(
            DummyChildNodeModule_GetDummyMiddleANodeLazy2Factory.create(
                builder.dummyChildNodeModule, dummyRootNodeProvider));

    this.dummyListAItemComponentBuilderProvider =
        new Factory<DummyListAItemComponent.Builder>() {
          @Override
          public DummyListAItemComponent.Builder get() {
            return new DummyListAItemComponentBuilder();
          }
        };

    this.dummyListANodeMembersInjector =
        DummyListANode_MembersInjector.create(dummyListAItemComponentBuilderProvider);
    this.getDummyMiddleBNodeLazyProvider = new DelegateFactory();

    this.getDummyListANodeProvider =
        DoubleCheck.provider(
            DummyChildNodeModule_GetDummyListANodeFactory.create(
                builder.dummyChildNodeModule,
                getDummyMiddleBNodeLazyProvider,
                dummyListANodeMembersInjector));

    this.dummyMiddleBNodeMembersInjector =
        DummyMiddleBNode_MembersInjector.create(
            getDummyMiddleANodeLazy2Provider, getDummyListANodeProvider);

    DelegateFactory getDummyMiddleBNodeLazyProviderDelegate =
        (DelegateFactory) getDummyMiddleBNodeLazyProvider;
    this.getDummyMiddleBNodeLazyProvider =
        DoubleCheck.provider(
            DummyChildNodeModule_GetDummyMiddleBNodeLazyFactory.create(
                builder.dummyChildNodeModule,
                dummyRootNodeProvider,
                dummyMiddleBNodeMembersInjector));
    getDummyMiddleBNodeLazyProviderDelegate.setDelegatedProvider(getDummyMiddleBNodeLazyProvider);

    this.dummyRootNodeMembersInjector =
        DummyRootNode_MembersInjector.create(
            provideDummyChangeEngineProvider,
            getDummyMiddleANodeLazy1Provider,
            getDummyMiddleANodeLazy2Provider,
            getDummyMiddleBNodeLazyProvider);
    this.dummyContextProvider = new DelegateFactory();

    DelegateFactory dummyRootNodeProviderDelegate = (DelegateFactory) dummyRootNodeProvider;
    this.dummyRootNodeProvider =
        DoubleCheck.provider(
            DummyRootNode_Factory.create(dummyRootNodeMembersInjector, dummyContextProvider));
    dummyRootNodeProviderDelegate.setDelegatedProvider(dummyRootNodeProvider);

    DelegateFactory dummyContextProviderDelegate = (DelegateFactory) dummyContextProvider;
    this.dummyContextProvider =
        DoubleCheck.provider(
            DummyContext_Factory.create(dummyChangeEngineImplProvider, dummyRootNodeProvider));
    dummyContextProviderDelegate.setDelegatedProvider(dummyContextProvider);
  }

  @Override
  public DummyContext provideDummyContext() {
    return dummyContextProvider.get();
  }

  public static final class Builder {
    private DummyChildNodeModule dummyChildNodeModule;

    private Builder() {}

    public DummyContextComponent build() {
      if (dummyChildNodeModule == null) {
        this.dummyChildNodeModule = new DummyChildNodeModule();
      }
      return new DaggerDummyContextComponent(this);
    }

    public Builder dummyChildNodeModule(DummyChildNodeModule dummyChildNodeModule) {
      this.dummyChildNodeModule = Preconditions.checkNotNull(dummyChildNodeModule);
      return this;
    }
  }

  private final class DummyListAItemComponentBuilder implements DummyListAItemComponent.Builder {
    private DummyListAItemModule dummyListAItemModule;

    @Override
    public DummyListAItemComponent build() {
      if (dummyListAItemModule == null) {
        throw new IllegalStateException(
            DummyListAItemModule.class.getCanonicalName() + " must be set");
      }
      return new DummyListAItemComponentImpl(this);
    }

    @Override
    public DummyListAItemComponentBuilder dummyListAItemModule(DummyListAItemModule module) {
      this.dummyListAItemModule = Preconditions.checkNotNull(module);
      return this;
    }
  }

  private final class DummyListAItemComponentImpl implements DummyListAItemComponent {
    private MembersInjector<DummyListAItemNode> dummyListAItemNodeMembersInjector;

    private Provider<DummyListAItemNode> provideDummyListAItemNodeProvider;

    private Provider<DummyListAItemGuide> dummyListAItemGuideProvider;

    private DummyListAItemComponentImpl(DummyListAItemComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final DummyListAItemComponentBuilder builder) {

      this.dummyListAItemNodeMembersInjector =
          DummyListAItemNode_MembersInjector.create(
              DaggerDummyContextComponent.this.dummyRootNodeProvider);

      this.provideDummyListAItemNodeProvider =
          DoubleCheck.provider(
              DummyListAItemModule_ProvideDummyListAItemNodeFactory.create(
                  builder.dummyListAItemModule,
                  DaggerDummyContextComponent.this.getDummyListANodeProvider,
                  dummyListAItemNodeMembersInjector));

      this.dummyListAItemGuideProvider = DoubleCheck.provider(DummyListAItemGuide_Factory.create());
    }

    @Override
    public DummyListAItemNode provideDummyListAItemNode() {
      return provideDummyListAItemNodeProvider.get();
    }

    @Override
    public DummyListAItemGuide provideDummyListAItemGuide() {
      return dummyListAItemGuideProvider.get();
    }
  }
}
