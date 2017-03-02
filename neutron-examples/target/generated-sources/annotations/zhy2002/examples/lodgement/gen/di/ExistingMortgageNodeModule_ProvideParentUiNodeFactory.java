package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExistingMortgageNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final ExistingMortgageNodeModule module;

  public ExistingMortgageNodeModule_ProvideParentUiNodeFactory(ExistingMortgageNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(ExistingMortgageNodeModule module) {
    return new ExistingMortgageNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link ExistingMortgageNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(ExistingMortgageNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
