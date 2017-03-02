package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleSignificantChangeFlagNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ResponsibleSignificantChangeFlagNodeModule module;

  public ResponsibleSignificantChangeFlagNodeModule_ProvideUiNodeFactory(
      ResponsibleSignificantChangeFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ResponsibleSignificantChangeFlagNodeModule module) {
    return new ResponsibleSignificantChangeFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ResponsibleSignificantChangeFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ResponsibleSignificantChangeFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
