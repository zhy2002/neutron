package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsOwnershipListNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final SavingsOwnershipListNodeModule module;

  public SavingsOwnershipListNodeModule_ProvideUiNodeFactory(
      SavingsOwnershipListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(SavingsOwnershipListNodeModule module) {
    return new SavingsOwnershipListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link SavingsOwnershipListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(SavingsOwnershipListNodeModule instance) {
    return instance.provideUiNode();
  }
}
