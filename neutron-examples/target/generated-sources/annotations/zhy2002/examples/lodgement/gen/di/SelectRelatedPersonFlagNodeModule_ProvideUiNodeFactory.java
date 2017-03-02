package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonFlagNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final SelectRelatedPersonFlagNodeModule module;

  public SelectRelatedPersonFlagNodeModule_ProvideUiNodeFactory(
      SelectRelatedPersonFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(SelectRelatedPersonFlagNodeModule module) {
    return new SelectRelatedPersonFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link SelectRelatedPersonFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(SelectRelatedPersonFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
