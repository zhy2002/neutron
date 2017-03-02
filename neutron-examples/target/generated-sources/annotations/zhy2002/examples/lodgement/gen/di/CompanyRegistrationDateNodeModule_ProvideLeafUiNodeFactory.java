package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyRegistrationDateNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final CompanyRegistrationDateNodeModule module;

  public CompanyRegistrationDateNodeModule_ProvideLeafUiNodeFactory(
      CompanyRegistrationDateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(CompanyRegistrationDateNodeModule module) {
    return new CompanyRegistrationDateNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link CompanyRegistrationDateNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      CompanyRegistrationDateNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
