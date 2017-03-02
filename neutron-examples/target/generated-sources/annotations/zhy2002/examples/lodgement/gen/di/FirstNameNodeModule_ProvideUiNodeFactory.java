package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirstNameNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final FirstNameNodeModule module;

  public FirstNameNodeModule_ProvideUiNodeFactory(FirstNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(FirstNameNodeModule module) {
    return new FirstNameNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link FirstNameNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(FirstNameNodeModule instance) {
    return instance.provideUiNode();
  }
}
