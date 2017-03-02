package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentEmploymentListNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final CurrentEmploymentListNodeModule module;

  public CurrentEmploymentListNodeModule_ProvideUiNodeFactory(
      CurrentEmploymentListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CurrentEmploymentListNodeModule module) {
    return new CurrentEmploymentListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CurrentEmploymentListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CurrentEmploymentListNodeModule instance) {
    return instance.provideUiNode();
  }
}
