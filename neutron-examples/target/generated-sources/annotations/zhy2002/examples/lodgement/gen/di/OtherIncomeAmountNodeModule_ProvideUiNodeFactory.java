package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeAmountNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final OtherIncomeAmountNodeModule module;

  public OtherIncomeAmountNodeModule_ProvideUiNodeFactory(OtherIncomeAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OtherIncomeAmountNodeModule module) {
    return new OtherIncomeAmountNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OtherIncomeAmountNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OtherIncomeAmountNodeModule instance) {
    return instance.provideUiNode();
  }
}