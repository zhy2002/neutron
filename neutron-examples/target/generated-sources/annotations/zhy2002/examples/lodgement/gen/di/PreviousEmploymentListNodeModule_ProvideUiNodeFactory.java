package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentListNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final PreviousEmploymentListNodeModule module;

  public PreviousEmploymentListNodeModule_ProvideUiNodeFactory(
      PreviousEmploymentListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PreviousEmploymentListNodeModule module) {
    return new PreviousEmploymentListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PreviousEmploymentListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PreviousEmploymentListNodeModule instance) {
    return instance.provideUiNode();
  }
}