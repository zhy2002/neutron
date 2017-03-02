package zhy2002.examples.lodgement.di;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ApplicationNodeChildProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomModule_ProvideApplicationNodeChildProviderFactory
    implements Factory<ApplicationNodeChildProvider> {
  private final CustomModule module;

  private final MembersInjector<ApplicationNodeChildProvider> injectorMembersInjector;

  public CustomModule_ProvideApplicationNodeChildProviderFactory(
      CustomModule module, MembersInjector<ApplicationNodeChildProvider> injectorMembersInjector) {
    assert module != null;
    this.module = module;
    assert injectorMembersInjector != null;
    this.injectorMembersInjector = injectorMembersInjector;
  }

  @Override
  public ApplicationNodeChildProvider get() {
    return Preconditions.checkNotNull(
        module.provideApplicationNodeChildProvider(injectorMembersInjector),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ApplicationNodeChildProvider> create(
      CustomModule module, MembersInjector<ApplicationNodeChildProvider> injectorMembersInjector) {
    return new CustomModule_ProvideApplicationNodeChildProviderFactory(
        module, injectorMembersInjector);
  }

  /** Proxies {@link CustomModule#provideApplicationNodeChildProvider(MembersInjector)}. */
  public static ApplicationNodeChildProvider proxyProvideApplicationNodeChildProvider(
      CustomModule instance, MembersInjector<ApplicationNodeChildProvider> injector) {
    return instance.provideApplicationNodeChildProvider(injector);
  }
}
