package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeDescriptionNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final OtherIncomeDescriptionNodeModule module;

  public OtherIncomeDescriptionNodeModule_ProvideUiNodeFactory(
      OtherIncomeDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OtherIncomeDescriptionNodeModule module) {
    return new OtherIncomeDescriptionNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OtherIncomeDescriptionNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OtherIncomeDescriptionNodeModule instance) {
    return instance.provideUiNode();
  }
}
