package zhy2002.examples.lodgement.di;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EmployedNodeChildProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomModule_ProvideEmployedNodeChildProviderFactory
    implements Factory<EmployedNodeChildProvider> {
  private final CustomModule module;

  private final MembersInjector<EmployedNodeChildProvider> injectorMembersInjector;

  public CustomModule_ProvideEmployedNodeChildProviderFactory(
      CustomModule module, MembersInjector<EmployedNodeChildProvider> injectorMembersInjector) {
    assert module != null;
    this.module = module;
    assert injectorMembersInjector != null;
    this.injectorMembersInjector = injectorMembersInjector;
  }

  @Override
  public EmployedNodeChildProvider get() {
    return Preconditions.checkNotNull(
        module.provideEmployedNodeChildProvider(injectorMembersInjector),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmployedNodeChildProvider> create(
      CustomModule module, MembersInjector<EmployedNodeChildProvider> injectorMembersInjector) {
    return new CustomModule_ProvideEmployedNodeChildProviderFactory(
        module, injectorMembersInjector);
  }

  /** Proxies {@link CustomModule#provideEmployedNodeChildProvider(MembersInjector)}. */
  public static EmployedNodeChildProvider proxyProvideEmployedNodeChildProvider(
      CustomModule instance, MembersInjector<EmployedNodeChildProvider> injector) {
    return instance.provideEmployedNodeChildProvider(injector);
  }
}
