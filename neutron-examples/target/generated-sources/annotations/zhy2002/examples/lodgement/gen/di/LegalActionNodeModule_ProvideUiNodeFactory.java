package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LegalActionNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final LegalActionNodeModule module;

  public LegalActionNodeModule_ProvideUiNodeFactory(LegalActionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(LegalActionNodeModule module) {
    return new LegalActionNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link LegalActionNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(LegalActionNodeModule instance) {
    return instance.provideUiNode();
  }
}
