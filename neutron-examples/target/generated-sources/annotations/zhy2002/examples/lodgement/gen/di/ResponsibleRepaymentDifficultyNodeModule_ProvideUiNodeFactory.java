package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleRepaymentDifficultyNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ResponsibleRepaymentDifficultyNodeModule module;

  public ResponsibleRepaymentDifficultyNodeModule_ProvideUiNodeFactory(
      ResponsibleRepaymentDifficultyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ResponsibleRepaymentDifficultyNodeModule module) {
    return new ResponsibleRepaymentDifficultyNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ResponsibleRepaymentDifficultyNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ResponsibleRepaymentDifficultyNodeModule instance) {
    return instance.provideUiNode();
  }
}