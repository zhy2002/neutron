package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final PreviousEmploymentNodeModule module;

  public PreviousEmploymentNodeModule_ProvideUiNodeFactory(PreviousEmploymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PreviousEmploymentNodeModule module) {
    return new PreviousEmploymentNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PreviousEmploymentNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PreviousEmploymentNodeModule instance) {
    return instance.provideUiNode();
  }
}
