package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExistingMortgageListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final ExistingMortgageListNodeModule module;

  public ExistingMortgageListNodeModule_ProvideParentUiNodeFactory(
      ExistingMortgageListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(ExistingMortgageListNodeModule module) {
    return new ExistingMortgageListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link ExistingMortgageListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(ExistingMortgageListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
