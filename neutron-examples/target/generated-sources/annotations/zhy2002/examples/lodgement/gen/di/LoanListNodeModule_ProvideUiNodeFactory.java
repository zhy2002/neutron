package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanListNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final LoanListNodeModule module;

  public LoanListNodeModule_ProvideUiNodeFactory(LoanListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(LoanListNodeModule module) {
    return new LoanListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link LoanListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(LoanListNodeModule instance) {
    return instance.provideUiNode();
  }
}
