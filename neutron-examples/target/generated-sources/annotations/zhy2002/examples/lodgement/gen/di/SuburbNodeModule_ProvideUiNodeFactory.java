package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SuburbNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final SuburbNodeModule module;

  public SuburbNodeModule_ProvideUiNodeFactory(SuburbNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(SuburbNodeModule module) {
    return new SuburbNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link SuburbNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(SuburbNodeModule instance) {
    return instance.provideUiNode();
  }
}