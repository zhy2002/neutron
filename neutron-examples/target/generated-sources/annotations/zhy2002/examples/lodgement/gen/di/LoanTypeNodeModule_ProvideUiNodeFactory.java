package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanTypeNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final LoanTypeNodeModule module;

  public LoanTypeNodeModule_ProvideUiNodeFactory(LoanTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(LoanTypeNodeModule module) {
    return new LoanTypeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link LoanTypeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(LoanTypeNodeModule instance) {
    return instance.provideUiNode();
  }
}
