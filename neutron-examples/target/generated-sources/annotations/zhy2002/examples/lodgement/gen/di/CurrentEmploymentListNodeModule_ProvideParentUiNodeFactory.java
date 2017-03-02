package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentEmploymentListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final CurrentEmploymentListNodeModule module;

  public CurrentEmploymentListNodeModule_ProvideParentUiNodeFactory(
      CurrentEmploymentListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(CurrentEmploymentListNodeModule module) {
    return new CurrentEmploymentListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link CurrentEmploymentListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(CurrentEmploymentListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
