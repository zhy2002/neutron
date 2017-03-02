package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final SelectRelatedPersonNodeModule module;

  public SelectRelatedPersonNodeModule_ProvideUiNodeFactory(SelectRelatedPersonNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(SelectRelatedPersonNodeModule module) {
    return new SelectRelatedPersonNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link SelectRelatedPersonNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(SelectRelatedPersonNodeModule instance) {
    return instance.provideUiNode();
  }
}
