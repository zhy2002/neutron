package zhy2002.examples.register.di;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.RegisterNodeChildProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomModule_ProvideRegisterNodeChildProviderFactory
    implements Factory<RegisterNodeChildProvider> {
  private final CustomModule module;

  private final MembersInjector<RegisterNodeChildProvider> injectorMembersInjector;

  public CustomModule_ProvideRegisterNodeChildProviderFactory(
      CustomModule module, MembersInjector<RegisterNodeChildProvider> injectorMembersInjector) {
    assert module != null;
    this.module = module;
    assert injectorMembersInjector != null;
    this.injectorMembersInjector = injectorMembersInjector;
  }

  @Override
  public RegisterNodeChildProvider get() {
    return Preconditions.checkNotNull(
        module.provideRegisterNodeChildProvider(injectorMembersInjector),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RegisterNodeChildProvider> create(
      CustomModule module, MembersInjector<RegisterNodeChildProvider> injectorMembersInjector) {
    return new CustomModule_ProvideRegisterNodeChildProviderFactory(
        module, injectorMembersInjector);
  }

  /** Proxies {@link CustomModule#provideRegisterNodeChildProvider(MembersInjector)}. */
  public static RegisterNodeChildProvider proxyProvideRegisterNodeChildProvider(
      CustomModule instance, MembersInjector<RegisterNodeChildProvider> injector) {
    return instance.provideRegisterNodeChildProvider(injector);
  }
}
