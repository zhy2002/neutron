package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeAddBackTypeNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final OtherIncomeAddBackTypeNodeModule module;

  public OtherIncomeAddBackTypeNodeModule_ProvideUiNodeFactory(
      OtherIncomeAddBackTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OtherIncomeAddBackTypeNodeModule module) {
    return new OtherIncomeAddBackTypeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OtherIncomeAddBackTypeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OtherIncomeAddBackTypeNodeModule instance) {
    return instance.provideUiNode();
  }
}
