package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLoanTypeNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final MortgageLoanTypeNodeModule module;

  public MortgageLoanTypeNodeModule_ProvideUiNodeFactory(MortgageLoanTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(MortgageLoanTypeNodeModule module) {
    return new MortgageLoanTypeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link MortgageLoanTypeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(MortgageLoanTypeNodeModule instance) {
    return instance.provideUiNode();
  }
}
