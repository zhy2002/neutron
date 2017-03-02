package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final PreviousEmploymentListNodeModule module;

  public PreviousEmploymentListNodeModule_ProvideParentUiNodeFactory(
      PreviousEmploymentListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(PreviousEmploymentListNodeModule module) {
    return new PreviousEmploymentListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link PreviousEmploymentListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(
      PreviousEmploymentListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
