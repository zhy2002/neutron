package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyRegistrationStateNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final CompanyRegistrationStateNodeModule module;

  public CompanyRegistrationStateNodeModule_ProvideLeafUiNodeFactory(
      CompanyRegistrationStateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(CompanyRegistrationStateNodeModule module) {
    return new CompanyRegistrationStateNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link CompanyRegistrationStateNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      CompanyRegistrationStateNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
