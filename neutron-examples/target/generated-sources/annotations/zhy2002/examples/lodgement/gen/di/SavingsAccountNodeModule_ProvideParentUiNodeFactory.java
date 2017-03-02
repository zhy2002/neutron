package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final SavingsAccountNodeModule module;

  public SavingsAccountNodeModule_ProvideParentUiNodeFactory(SavingsAccountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(SavingsAccountNodeModule module) {
    return new SavingsAccountNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link SavingsAccountNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(SavingsAccountNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
