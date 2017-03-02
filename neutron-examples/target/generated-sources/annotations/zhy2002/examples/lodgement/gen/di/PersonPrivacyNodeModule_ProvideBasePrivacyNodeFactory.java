package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BasePrivacyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonPrivacyNodeModule_ProvideBasePrivacyNodeFactory
    implements Factory<BasePrivacyNode<?>> {
  private final PersonPrivacyNodeModule module;

  public PersonPrivacyNodeModule_ProvideBasePrivacyNodeFactory(PersonPrivacyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BasePrivacyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBasePrivacyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BasePrivacyNode<?>> create(PersonPrivacyNodeModule module) {
    return new PersonPrivacyNodeModule_ProvideBasePrivacyNodeFactory(module);
  }

  /** Proxies {@link PersonPrivacyNodeModule#provideBasePrivacyNode()}. */
  public static BasePrivacyNode<?> proxyProvideBasePrivacyNode(PersonPrivacyNodeModule instance) {
    return instance.provideBasePrivacyNode();
  }
}
