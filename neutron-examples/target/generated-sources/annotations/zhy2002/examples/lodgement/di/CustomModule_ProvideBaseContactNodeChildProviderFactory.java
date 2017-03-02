package zhy2002.examples.lodgement.di;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseContactNodeChildProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomModule_ProvideBaseContactNodeChildProviderFactory
    implements Factory<BaseContactNodeChildProvider> {
  private final CustomModule module;

  private final MembersInjector<BaseContactNodeChildProvider> injectorMembersInjector;

  public CustomModule_ProvideBaseContactNodeChildProviderFactory(
      CustomModule module, MembersInjector<BaseContactNodeChildProvider> injectorMembersInjector) {
    assert module != null;
    this.module = module;
    assert injectorMembersInjector != null;
    this.injectorMembersInjector = injectorMembersInjector;
  }

  @Override
  public BaseContactNodeChildProvider get() {
    return Preconditions.checkNotNull(
        module.provideBaseContactNodeChildProvider(injectorMembersInjector),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseContactNodeChildProvider> create(
      CustomModule module, MembersInjector<BaseContactNodeChildProvider> injectorMembersInjector) {
    return new CustomModule_ProvideBaseContactNodeChildProviderFactory(
        module, injectorMembersInjector);
  }

  /** Proxies {@link CustomModule#provideBaseContactNodeChildProvider(MembersInjector)}. */
  public static BaseContactNodeChildProvider proxyProvideBaseContactNodeChildProvider(
      CustomModule instance, MembersInjector<BaseContactNodeChildProvider> injector) {
    return instance.provideBaseContactNodeChildProvider(injector);
  }
}
